package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.repository.PensionWinNumRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class PensionWinNumSrvImplTest {

    @Mock
    private PensionWinNumRepo pensionWinNumRepo;

    @InjectMocks
    private PensionWinNumSrvImpl pensionWinNumSrv;

    public PensionWinNumSrvImplTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getDrawByDate_shouldReturnDrawByDate() {
        // Arrange
        LocalDate date = LocalDate.of(2024, 6, 13);
        PensionWinNum expectedDraw = createPensionWinNum();

        when(pensionWinNumRepo.findByDrawDate(date)).thenReturn(expectedDraw);

        // Act
        PensionWinNum actualDraw = pensionWinNumSrv.getDrawByDate(date);

        // Assert
        assertEquals(expectedDraw, actualDraw);
        verify(pensionWinNumRepo).findByDrawDate(date);
    }

    @Test
    void getDrawByRound_shouldReturnDrawByRound() {
        // Arrange
        int round = 1;
        PensionWinNum expectedDraw = createPensionWinNum();

        when(pensionWinNumRepo.findByDrawRound(round)).thenReturn(expectedDraw);

        // Act
        PensionWinNum actualDraw = pensionWinNumSrv.getDrawByRound(round);

        // Assert
        assertEquals(expectedDraw, actualDraw);
        verify(pensionWinNumRepo).findByDrawRound(round);
    }

    private PensionWinNum createPensionWinNum() {
        return PensionWinNum.builder()
                .id(1L)
                .drawRound(1)
                .firstNum(1)
                .secondNum(2)
                .thirdNum(3)
                .fourthNum(4)
                .fifthNum(5)
                .sixthNum(6)
                .groupNum(1)
                .drawDate(LocalDate.of(2024, 6, 13))
                .build();
    }

    private PensionSchedulerService pensionSchedulerServiceImpl;
    PensionWinNum result = pensionSchedulerServiceImpl.createDraw();
}
