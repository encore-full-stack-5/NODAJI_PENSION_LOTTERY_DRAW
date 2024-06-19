package com.example.nodaji_pension_draw.controller;
import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.service.PensionWinNumSrv;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pension-win/")
@RequiredArgsConstructor
public class PensionNumController {

    private final PensionWinNumSrv pensionWinNumSrv;

    @GetMapping("/date")
    public List<PensionWinNum> getDrawByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
//        PensionWinNum draw = pensionWinNumSrv.getDrawByDate(date);
//        return ResponseEntity.ok(draw);
        return pensionWinNumSrv.getDrawByDate(date);
    }

    @GetMapping("/round")
    public List<PensionWinNum> getDrawByRound(@RequestParam int round) {
        return pensionWinNumSrv.getDrawByRound(round);

    }

    @GetMapping("/all")
    public List<PensionWinNum> getAllDraws() {
        return pensionWinNumSrv.getAllDraws();

    }
}
