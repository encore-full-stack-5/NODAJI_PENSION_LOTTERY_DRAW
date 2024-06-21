package com.example.nodaji_pension_draw.controller;
import com.example.nodaji_pension_draw.service.StatBonusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*"
        ,methods = {
        RequestMethod.GET,
        RequestMethod.POST,
        RequestMethod.DELETE,
        RequestMethod.PUT,
        RequestMethod.OPTIONS}, allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/statistics/bonus")
@RequiredArgsConstructor
public class PensionBonusStatisticsController {
    private final StatBonusService statBonusService;
    @GetMapping("/firstNum")
    public List<Map<String, Object>> getFrequencyOfFirstNum() {
        return statBonusService.getFrequencyOfFirstNum();
    }

    @GetMapping("/secondNum")
    public List<Map<String, Object>> getFrequencyOfSecondNum() {
        return statBonusService.getFrequencyOfSecondNum();
    }

    @GetMapping("/thirdNum")
    public List<Map<String, Object>> getFrequencyOfThirdNum() {
        return statBonusService.getFrequencyOfThirdNum();
    }

    @GetMapping("/fourthNum")
    public List<Map<String, Object>> getFrequencyOfFourthNum() {
        return statBonusService.getFrequencyOfFourthNum();
    }

    @GetMapping("/fifthNum")
    public List<Map<String, Object>> getFrequencyOfFifthNum() {
        return statBonusService.getFrequencyOfFifthNum();
    }

    @GetMapping("/sixthNum")
    public List<Map<String, Object>> getFrequencyOfSixthNum() {
        return statBonusService.getFrequencyOfSixthNum();
    }
}
