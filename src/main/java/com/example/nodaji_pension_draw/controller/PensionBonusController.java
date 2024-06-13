package com.example.nodaji_pension_draw.controller;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.service.BonusSrv;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/pension-bonus")
@RequiredArgsConstructor
public class PensionBonusController {
    private final BonusSrv bonusSrv;

    @GetMapping("/date/{date}")
    public ResponseEntity<PensionBonusNum> getBonusByDate(@PathVariable String date) {
        LocalDate bonusDate = LocalDate.parse(date);
        PensionBonusNum bonus = bonusSrv.getBonusByDate(bonusDate);
        return ResponseEntity.ok(bonus);
    }

    @GetMapping("/round/{round}")
    public ResponseEntity<PensionBonusNum> getBonusByRound(@PathVariable int round) {
        PensionBonusNum bonus = bonusSrv.getBonusByRound(round);
        return ResponseEntity.ok(bonus);
    }

    @GetMapping
    public ResponseEntity<List<PensionBonusNum>> getAllBonusNum() {
        List<PensionBonusNum> bonuses = bonusSrv.getAllBonusNum();
        return ResponseEntity.ok(bonuses);
    }
}
