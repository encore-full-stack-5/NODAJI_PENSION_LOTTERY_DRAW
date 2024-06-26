package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionWinNum;

import java.time.LocalDate;
import java.util.List;

public interface PensionWinNumSvc {
    List<PensionWinNum> getDrawByDate(LocalDate date);
    List<PensionWinNum>  getDrawByRound(int round);
    List<PensionWinNum> getAllDraws();


}
