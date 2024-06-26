package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.repository.PensionBonusNumRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class BonusServiceImplTest {
    @Mock
    private PensionBonusNumRepo pensionBonusNumRepo;

    @InjectMocks
    private BonusServiceImpl bonusSrv;

    private List<PensionBonusNum> sampleBonuses;

    @BeforeEach
    void setUp() {
        sampleBonuses = Arrays.asList(
                PensionBonusNum.builder()
                        .id(1L)
                        .drawRound(1)
                        .firstNum(1)
                        .secondNum(2)
                        .thirdNum(3)
                        .fourthNum(4)
                        .fifthNum(5)
                        .sixthNum(6)
                        .drawDate(LocalDate.of(2021, 1, 1))
                        .build(),
                PensionBonusNum.builder()
                        .id(2L)
                        .drawRound(2)
                        .firstNum(7)
                        .secondNum(8)
                        .thirdNum(9)
                        .fourthNum(10)
                        .fifthNum(11)
                        .sixthNum(12)
                        .drawDate(LocalDate.of(2021, 1, 8))
                        .build()
        );
    }

    @Test
    void getBonusByDate() {
        LocalDate date = LocalDate.of(2021, 1, 1);
        when(pensionBonusNumRepo.findBonusByDrawDate(date)).thenReturn(Arrays.asList(sampleBonuses.get(0)));

        List<PensionBonusNum> result = bonusSrv.getBonusByDate(date);
        assertEquals(1, result.size());
        assertEquals(sampleBonuses.get(0), result.get(0));

    }

    @Test
    void getBonusByRound() {
        int round = 1;
        when(pensionBonusNumRepo.findBonusByDrawRound(round)).thenReturn(Arrays.asList(sampleBonuses.get(0)));

        List<PensionBonusNum> result = bonusSrv.getBonusByRound(round);
        assertEquals(1, result.size());
        assertEquals(sampleBonuses.get(0), result.get(0));

    }

    @Test
    void getAllBonusNum() {
        when(pensionBonusNumRepo.findAll()).thenReturn(sampleBonuses);

        List<PensionBonusNum> result = bonusSrv.getAllBonusNum();
        assertEquals(2, result.size());
        assertEquals(sampleBonuses, result);

    }
}