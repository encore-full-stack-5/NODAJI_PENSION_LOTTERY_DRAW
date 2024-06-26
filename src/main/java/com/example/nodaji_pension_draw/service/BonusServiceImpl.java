package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.repository.PensionBonusNumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BonusServiceImpl implements BonusService {
    private final PensionBonusNumRepo pensionBonusNumRepo;

    @Override
    public List<PensionBonusNum> getBonusByDate(LocalDate date) {

        return  pensionBonusNumRepo.findBonusByDrawDate(date);
    }

    @Override
    public List<PensionBonusNum> getBonusByRound(int round) {

        return pensionBonusNumRepo.findBonusByDrawRound(round);
    }

    @Override
    public List<PensionBonusNum> getAllBonusNum() {
       return pensionBonusNumRepo.findAll();

    }
}
