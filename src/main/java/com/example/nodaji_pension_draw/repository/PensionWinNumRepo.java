package com.example.nodaji_pension_draw.repository;

import com.example.nodaji_pension_draw.entity.PensionWinNum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface PensionWinNumRepo extends JpaRepository<PensionWinNum, Long> {
    PensionWinNum findByDrawDate(LocalDate drawDate);
    PensionWinNum findByDrawRound(int drawRound);
}
