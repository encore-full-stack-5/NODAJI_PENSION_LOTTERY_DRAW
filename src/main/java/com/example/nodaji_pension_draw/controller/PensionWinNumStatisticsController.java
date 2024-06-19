package com.example.nodaji_pension_draw.controller;

import com.example.nodaji_pension_draw.service.StatServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/pension/statistics")
@RequiredArgsConstructor
public class PensionWinNumStatisticsController {
    private final StatServiceImpl statService;

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
