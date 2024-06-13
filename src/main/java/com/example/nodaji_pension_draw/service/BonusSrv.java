package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;

import java.time.LocalDate;
import java.util.List;

public interface BonusSrv {
    PensionBonusNum getBonusByDate(LocalDate date);
    PensionBonusNum getBonusByRound(int round);
    List<PensionBonusNum> getAllBonusNum();
}
