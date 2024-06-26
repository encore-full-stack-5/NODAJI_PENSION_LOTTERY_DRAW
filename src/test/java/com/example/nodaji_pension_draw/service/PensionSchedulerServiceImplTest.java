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


}
