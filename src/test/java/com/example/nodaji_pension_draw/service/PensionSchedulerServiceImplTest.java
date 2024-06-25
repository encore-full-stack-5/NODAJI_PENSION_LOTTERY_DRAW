package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.repository.PensionBonusNumRepo;
import com.example.nodaji_pension_draw.repository.PensionWinNumRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class PensionSchedulerServiceImplTest {

    @Mock
    private PensionWinNumRepo pensionWinNumRepo;

    @Mock
    private PensionBonusNumRepo pensionBonusNumRepo;

    @InjectMocks
    private PensionSchedulerServiceImpl pensionSchedulerService;

    @Captor
    private ArgumentCaptor<PensionWinNum> drawCaptor;

    @Captor
    private ArgumentCaptor<PensionBonusNum> bonusNumCaptor;

    private LocalDate testDate = LocalDate.now().with(DayOfWeek.THURSDAY);






    @Test
    void redrawLastDigit() {
        // Arrange
        PensionBonusNum bonusNum = pensionSchedulerService.createBonusDraw();
        int l  = bonusNum.getSixthNum();

        // Act
        PensionBonusNum redrawnBonusNum = pensionSchedulerService.redrawLastDigit(bonusNum);
        int r = redrawnBonusNum.getSixthNum();

        // Assert
        assertNotEquals(l,r);

    }




    @Test
    void createBonusDraw() {
        // Act
        PensionBonusNum bonusNum = pensionSchedulerService.createBonusDraw();

        // Assert
        assertNotNull(bonusNum);
        assertEquals(LocalDate.now(), bonusNum.getDrawDate());
        assertEquals(pensionSchedulerService.drawRound, bonusNum.getDrawRound());
    }

    @Test
    void createDraw() {
        // Act
        PensionWinNum winNum = pensionSchedulerService.createDraw();

        // Assert
        assertNotNull(winNum);
        assertEquals(LocalDate.now(), winNum.getDrawDate());
        assertEquals(pensionSchedulerService.drawRound, winNum.getDrawRound());
    }

//    private PensionWinNum createMockPensionWinNum() {
//        return PensionWinNum.builder()
//                .drawRound(1)
//                .firstNum(1)
//                .secondNum(2)
//                .thirdNum(3)
//                .fourthNum(4)
//                .fifthNum(5)
//                .sixthNum(6)
//                .groupNum(1)
//                .drawDate(LocalDate.now())
//                .build();
//    }

//    private PensionBonusNum createMockPensionBonusNum() {
//        return PensionBonusNum.builder()
//                .drawRound(1)
//                .firstNum(1)
//                .secondNum(2)
//                .thirdNum(3)
//                .fourthNum(4)
//                .fifthNum(5)
//                .sixthNum(6)
//                .drawDate(LocalDate.now())
//                .build();
//    }
//
//    private PensionBonusNum createMockRedrawnPensionBonusNum() {
//        return PensionBonusNum.builder()
//                .drawRound(1)
//                .firstNum(1)
//                .secondNum(2)
//                .thirdNum(3)
//                .fourthNum(4)
//                .fifthNum(5)
//                .sixthNum(7) // Different sixth number to simulate redraw
//                .drawDate(LocalDate.now())
//                .build();
//    }
}
