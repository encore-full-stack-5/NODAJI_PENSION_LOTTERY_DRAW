package com.example.nodaji_pension_draw.controller;
import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.service.BonusService;
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
@RequestMapping("/api/v1/pension-bonus")
@RequiredArgsConstructor
public class PensionBonusController {
    private final BonusService bonusService;

    @GetMapping("date")
    public List<PensionBonusNum> getBonusByDate(@RequestParam(value="date") String date) {
        LocalDate bonusDate = LocalDate.parse(date);
       return bonusService.getBonusByDate(bonusDate);

    }

    @GetMapping("round")
    public List<PensionBonusNum> getBonusByRound(@RequestParam(value ="round" ) int round) {
        return  bonusService.getBonusByRound(round);

    }

    @GetMapping("/all")
    public List<PensionBonusNum> getAllBonusNum() {
        return  bonusService.getAllBonusNum();

    }
}
