package com.example.nodaji_pension_draw.repository;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionBonusNumRepo extends JpaRepository<PensionBonusNum, Long> {
}