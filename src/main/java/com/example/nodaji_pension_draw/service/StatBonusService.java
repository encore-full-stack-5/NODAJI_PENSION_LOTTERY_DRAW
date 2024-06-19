package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.repository.PensionBonusNumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StatBonusService {
    private final PensionBonusNumRepo pensionBonusNumRepo;

    public List<Map<String, Object>> getFrequencyOfFirstNum() {
        return pensionBonusNumRepo.countFrequencyOfFirstNum();
    }

    public List<Map<String, Object>> getFrequencyOfSecondNum() {
        return pensionBonusNumRepo.countFrequencyOfSecondNum();
    }

    public List<Map<String, Object>> getFrequencyOfThirdNum() {
        return pensionBonusNumRepo.countFrequencyOfThirdNum();
    }

    public List<Map<String, Object>> getFrequencyOfFourthNum() {
        return pensionBonusNumRepo.countFrequencyOfFourthNum();
    }

    public List<Map<String, Object>> getFrequencyOfFifthNum() {
        return pensionBonusNumRepo.countFrequencyOfFifthNum();
    }

    public List<Map<String, Object>> getFrequencyOfSixthNum() {
        return pensionBonusNumRepo.countFrequencyOfSixthNum();
    }
}
