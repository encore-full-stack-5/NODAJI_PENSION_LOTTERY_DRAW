package com.example.nodaji_pension_draw.controller;

import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.service.PensionWinNumSrv;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pension/draw")
@RequiredArgsConstructor
public class PensionNumController {

    private final PensionWinNumSrv pensionWinNumSrv;

    @GetMapping("/{date}")
    public ResponseEntity<PensionWinNum> getDrawByDate(@PathVariable String date) {
        LocalDate drawDate = LocalDate.parse(date);
        PensionWinNum draw = pensionWinNumSrv.getDrawByDate(drawDate);
        return ResponseEntity.ok(draw);
    }

    @GetMapping("/{round}")
    public ResponseEntity<PensionWinNum> getDrawByRound(@PathVariable int round) {
        PensionWinNum draw = pensionWinNumSrv.getDrawByRound(round);
        return ResponseEntity.ok(draw);
    }

    @GetMapping
    public ResponseEntity<List<PensionWinNum>> getAllDraws() {
        List<PensionWinNum> draws = pensionWinNumSrv.getAllDraws();
        return ResponseEntity.ok(draws);
    }
}
