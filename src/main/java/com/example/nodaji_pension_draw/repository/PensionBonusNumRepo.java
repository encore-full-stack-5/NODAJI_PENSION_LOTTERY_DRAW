package com.example.nodaji_pension_draw.repository;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Repository
public interface PensionBonusNumRepo extends JpaRepository<PensionBonusNum, Long> {
    List<PensionBonusNum> findBonusByDrawDate(LocalDate drawDate);
    List<PensionBonusNum> findBonusByDrawRound(int drawRound);

    @Query("SELECT p.firstNum AS number, COUNT(p.firstNum) AS frequency FROM PensionBonusNum p GROUP BY p.firstNum ORDER BY frequency DESC")
    List<Map<String, Object>> countFrequencyOfFirstNum();

    @Query("SELECT p.secondNum AS number, COUNT(p.secondNum) AS frequency FROM PensionBonusNum p GROUP BY p.secondNum ORDER BY frequency DESC")
    List<Map<String, Object>> countFrequencyOfSecondNum();

    @Query("SELECT p.thirdNum AS number, COUNT(p.thirdNum) AS frequency FROM PensionBonusNum p GROUP BY p.thirdNum ORDER BY frequency DESC")
    List<Map<String, Object>> countFrequencyOfThirdNum();

    @Query("SELECT p.fourthNum AS number, COUNT(p.fourthNum) AS frequency FROM PensionBonusNum p GROUP BY p.fourthNum ORDER BY frequency DESC")
    List<Map<String, Object>> countFrequencyOfFourthNum();

    @Query("SELECT p.fifthNum AS number, COUNT(p.fifthNum) AS frequency FROM PensionBonusNum p GROUP BY p.fifthNum ORDER BY frequency DESC")
    List<Map<String, Object>> countFrequencyOfFifthNum();

    @Query("SELECT p.sixthNum AS number, COUNT(p.sixthNum) AS frequency FROM PensionBonusNum p GROUP BY p.sixthNum ORDER BY frequency DESC")
    List<Map<String, Object>> countFrequencyOfSixthNum();

}
