package com.example.nodaji_pension_draw.service;
import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.repository.PensionWinNumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
@RequiredArgsConstructor
public class PensionWinNumSrvImpl implements PensionWinNumSrv {
    private final PensionWinNumRepo pensionWinNumRepo;


    @Override
    public PensionWinNum getDrawByDate(LocalDate date) {
      return  pensionWinNumRepo.findByDrawDate(date);

    }

    @Override
    public PensionWinNum getDrawByRound(int round) {
        return pensionWinNumRepo.findByDrawRound(round);
    }
}
