package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionWinNum;

import java.time.LocalDate;
import java.util.List;

public interface PensionWinNumSrv {
    PensionWinNum getDrawByDate(LocalDate date);
    PensionWinNum  getDrawByRound(int round);
    List<PensionWinNum> getAllDraws();


}
