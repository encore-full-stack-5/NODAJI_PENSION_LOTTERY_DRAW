package com.example.nodaji_pension_draw.controller;

import com.example.nodaji_pension_draw.service.StatService;
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
@RequestMapping("/api/v1/statistics/pension")
@RequiredArgsConstructor
public class PensionWinNumStatisticsController {
    private final StatService statService;

    @GetMapping("/firstNum")
    public List<Map<String, Object>> getFrequencyOfFirstNum() {
        return statService.getFrequencyOfFirstNum();
    }

    @GetMapping("/secondNum")
    public List<Map<String, Object>> getFrequencyOfSecondNum() {
        return statService.getFrequencyOfSecondNum();
    }

    @GetMapping("/thirdNum")
    public List<Map<String, Object>> getFrequencyOfThirdNum() {
        return statService.getFrequencyOfThirdNum();
    }

    @GetMapping("/fourthNum")
    public List<Map<String, Object>> getFrequencyOfFourthNum() {
        return statService.getFrequencyOfFourthNum();
    }

    @GetMapping("/fifthNum")
    public List<Map<String, Object>> getFrequencyOfFifthNum() {
        return statService.getFrequencyOfFifthNum();
    }

    @GetMapping("/sixthNum")
    public List<Map<String, Object>> getFrequencyOfSixthNum() {
        return statService.getFrequencyOfSixthNum();
    }

    @GetMapping("/groupNum")
    public List<Map<String, Object>> getFrequencyOfGroupNum() {
        return statService.getFrequencyOfGroupNum();
    }
}
