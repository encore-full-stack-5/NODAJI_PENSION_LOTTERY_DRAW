package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.repository.PensionWinNumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class StatService {

    private final PensionWinNumRepo pensionWinNumRepo;


    public List<Map<String, Object>> getFrequencyOfFirstNum() {

        return pensionWinNumRepo.countFrequencyOfFirstNum();
    }

    public List<Map<String, Object>> getFrequencyOfSecondNum() {
        return pensionWinNumRepo.countFrequencyOfSecondNum();
    }

    public List<Map<String, Object>> getFrequencyOfThirdNum() {
        return pensionWinNumRepo.countFrequencyOfThirdNum();
    }

    public List<Map<String, Object>> getFrequencyOfFourthNum() {
        return pensionWinNumRepo.countFrequencyOfFourthNum();
    }

    public List<Map<String, Object>> getFrequencyOfFifthNum() {
        return pensionWinNumRepo.countFrequencyOfFifthNum();
    }

    public List<Map<String, Object>> getFrequencyOfSixthNum() {
        return pensionWinNumRepo.countFrequencyOfSixthNum();
    }

    public List<Map<String, Object>> getFrequencyOfGroupNum() {
        return pensionWinNumRepo.countFrequencyOfGroupNum();
    }


   

}
