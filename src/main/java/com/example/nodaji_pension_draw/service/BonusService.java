package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;

import java.time.LocalDate;
import java.util.List;

public interface BonusService {
    List<PensionBonusNum> getBonusByDate(LocalDate date);
    List<PensionBonusNum> getBonusByRound(int round);
    List<PensionBonusNum> getAllBonusNum();
}
