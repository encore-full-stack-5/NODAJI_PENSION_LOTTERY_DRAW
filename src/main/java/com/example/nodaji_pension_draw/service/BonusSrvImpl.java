package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.repository.PensionBonusNumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BonusSrvImpl implements BonusSrv {
    private final PensionBonusNumRepo pensionBonusNumRepo;

    @Override
    public PensionBonusNum getBonusByDate(LocalDate date) {
        pensionBonusNumRepo.getBonusByDate(date);
        return  pensionBonusNumRepo.getBonusByDate(date);
    }

    @Override
    public PensionBonusNum getBonusByRound(int round) {
        pensionBonusNumRepo.getBonusByRound(round);
        return pensionBonusNumRepo.getBonusByRound(round);
    }

    @Override
    public List<PensionBonusNum> getAllBonusNum() {
       return pensionBonusNumRepo.findAll();

    }
}
