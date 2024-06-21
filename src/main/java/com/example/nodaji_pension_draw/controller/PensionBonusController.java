package com.example.nodaji_pension_draw.controller;
import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.service.BonusSrv;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "*"
        ,methods = {
        RequestMethod.GET,
        RequestMethod.POST,
        RequestMethod.DELETE,
        RequestMethod.PUT,
        RequestMethod.OPTIONS}, allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/pension/bonus")
@RequiredArgsConstructor
public class PensionBonusController {
    private final BonusSrv bonusSrv;

    @GetMapping("/date")
    public List<PensionBonusNum> getBonusByDate(@RequestParam String date) {
        LocalDate bonusDate = LocalDate.parse(date);
       return bonusSrv.getBonusByDate(bonusDate);

    }

    @GetMapping("/round")
    public List<PensionBonusNum> getBonusByRound(@RequestParam int round) {
        return  bonusSrv.getBonusByRound(round);

    }

    @GetMapping("/bonus-win-lists")
    public List<PensionBonusNum> getAllBonusNum() {
        return  bonusSrv.getAllBonusNum();

    }
}
