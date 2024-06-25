package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.repository.PensionWinNumRepo;
import org.bouncycastle.crypto.agreement.jpake.JPAKEUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PensionWinNumSrvImplTest {
    @Mock
    private PensionWinNumRepo pensionWinNumRepo;
    @InjectMocks
    private PensionWinNumSrvImpl pensionWinNumSrv;

    private List<PensionWinNum> sampleDraws;


    @BeforeEach
    void setUp() {
        sampleDraws = Arrays.asList(
                PensionWinNum.builder()
                        .id(1L)
                        .drawRound(1)
                        .firstNum(1)
                        .secondNum(2)
                        .thirdNum(3)
                        .fourthNum(4)
                        .fifthNum(5)
                        .sixthNum(6)
                        .groupNum(7)
                        .drawDate(LocalDate.of(2021, 1, 1))
                        .build(),
                PensionWinNum.builder()
                        .id(2L)
                        .drawRound(2)
                        .firstNum(8)
                        .secondNum(9)
                        .thirdNum(10)
                        .fourthNum(11)
                        .fifthNum(12)
                        .sixthNum(13)
                        .groupNum(14)
                        .drawDate(LocalDate.of(2021, 1, 8))
                        .build());
    };


    @Test
    void getDrawByDate() {
        LocalDate date = LocalDate.of(2021, 1, 1);
        when(pensionWinNumRepo.findByDrawDate(date)).thenReturn(Arrays.asList(sampleDraws.get(0)));

        List<PensionWinNum> result = pensionWinNumSrv.getDrawByDate(date);
        assertEquals(1, result.size());
        assertEquals(sampleDraws.get(0), result.get(0));
    }

    @Test
    void getDrawByRound() {
        int round = 1;
        when(pensionWinNumRepo.findByDrawRound(round)).thenReturn(Arrays.asList(sampleDraws.get(0)));

        List<PensionWinNum> result = pensionWinNumSrv.getDrawByRound(round);
        assertEquals(1, result.size());
        assertEquals(sampleDraws.get(0), result.get(0));
    }

    @Test
    void getAllDraws() {
        when(pensionWinNumRepo.findAll()).thenReturn(sampleDraws);

        List<PensionWinNum> result = pensionWinNumSrv.getAllDraws();
        assertEquals(2, result.size());
        assertEquals(sampleDraws, result);
    }
}