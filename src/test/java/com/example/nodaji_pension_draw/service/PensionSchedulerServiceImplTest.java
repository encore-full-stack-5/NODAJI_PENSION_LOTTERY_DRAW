package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.repository.PensionWinNumRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDate;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.junit.jupiter.api.Assertions.*;

class PensionSchedulerServiceImplTest {

    @Mock
    private PensionWinNumRepo pensionWinNumRepo;

    @InjectMocks
    private PensionSchedulerServiceImpl pensionSchedulerServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void generateScheduledDraw_shouldIncrementDrawRoundAndSaveDraw() {
        // Arrange
        pensionSchedulerServiceImpl.drawRound = 1;
        LocalDate initialDate = LocalDate.of(2023, 6, 12);
        pensionSchedulerServiceImpl.date = initialDate;

        // Act
        pensionSchedulerServiceImpl.generateScheduledDraw();

        // Assert
        assertEquals(2, pensionSchedulerServiceImpl.drawRound);
        assertEquals(LocalDate.now(), pensionSchedulerServiceImpl.date);

        // Capture the argument passed to save
        ArgumentCaptor<PensionWinNum> captor = ArgumentCaptor.forClass(PensionWinNum.class);
        verify(pensionWinNumRepo, times(1)).save(captor.capture());

        // Verify the contents of the captured argument
        PensionWinNum savedDraw = captor.getValue();
        assertEquals(2, savedDraw.getDrawRound());
        assertEquals(LocalDate.now(), savedDraw.getDrawDate());
        assertNotNull(savedDraw);
        assertTrue(savedDraw.getFirstNum() >= 0 && savedDraw.getFirstNum() < 10);
        assertTrue(savedDraw.getSecondNum() >= 0 && savedDraw.getSecondNum() < 10);
        assertTrue(savedDraw.getThirdNum() >= 0 && savedDraw.getThirdNum() < 10);
        assertTrue(savedDraw.getFourthNum() >= 0 && savedDraw.getFourthNum() < 10);
        assertTrue(savedDraw.getFifthNum() >= 0 && savedDraw.getFifthNum() < 10);
        assertTrue(savedDraw.getSixthNum() >= 0 && savedDraw.getSixthNum() < 10);
        assertTrue(savedDraw.getGroupNum() >= 1 && savedDraw.getGroupNum() <= 4);
    }

    @Test
    void createDraw_shouldReturnPensionWinNumWithRandomNumbers() {
        // Act
        PensionWinNum result = pensionSchedulerServiceImpl.createDraw();

        // Assert
        assertNotNull(result);
        assertEquals(pensionSchedulerServiceImpl.drawRound, result.getDrawRound());
        assertEquals(pensionSchedulerServiceImpl.date, result.getDrawDate());
        assertTrue(result.getFirstNum() >= 0 && result.getFirstNum() < 10);
        assertTrue(result.getSecondNum() >= 0 && result.getSecondNum() < 10);
        assertTrue(result.getThirdNum() >= 0 && result.getThirdNum() < 10);
        assertTrue(result.getFourthNum() >= 0 && result.getFourthNum() < 10);
        assertTrue(result.getFifthNum() >= 0 && result.getFifthNum() < 10);
        assertTrue(result.getSixthNum() >= 0 && result.getSixthNum() < 10);
        assertTrue(result.getGroupNum() >= 1 && result.getGroupNum() <= 4);
    }

}
