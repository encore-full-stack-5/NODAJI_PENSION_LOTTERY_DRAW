package com.example.nodaji_pension_draw.repository;

import com.example.nodaji_pension_draw.entity.PensionWinNum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Repository
public interface PensionWinNumRepo extends JpaRepository<PensionWinNum, Long> {
    List<PensionWinNum> findByDrawDate(LocalDate drawDate);
    List<PensionWinNum> findByDrawRound(int drawRound);


    @Query("SELECT p.firstNum AS number, COUNT(p.firstNum) AS frequency " +
            "FROM PensionWinNum p " +
            "GROUP BY p.firstNum " +
            "ORDER BY p.firstNum ASC")
    List<Map<String, Object>> countFrequencyOfFirstNum();

    @Query("SELECT p.secondNum AS number, COUNT(p.secondNum) AS frequency FROM PensionWinNum p GROUP BY p.secondNum ORDER BY p.secondNum ASC ")
    List<Map<String, Object>> countFrequencyOfSecondNum();


    @Query("SELECT p.thirdNum AS number, COUNT(p.thirdNum) AS frequency FROM PensionWinNum p GROUP BY p.thirdNum ORDER BY p.thirdNum ASC ")
    List<Map<String, Object>> countFrequencyOfThirdNum();

    @Query("SELECT p.fourthNum AS number, COUNT(p.fourthNum) AS frequency FROM PensionWinNum p GROUP BY p.fourthNum ORDER BY p.fourthNum ASC ")
    List<Map<String, Object>> countFrequencyOfFourthNum();

    @Query("SELECT p.fifthNum AS number, COUNT(p.fifthNum) AS frequency FROM PensionWinNum p GROUP BY p.fifthNum ORDER BY p.fifthNum ASC ")
    List<Map<String, Object>> countFrequencyOfFifthNum();

    @Query("SELECT p.sixthNum AS number, COUNT(p.sixthNum) AS frequency FROM PensionWinNum p GROUP BY p.sixthNum ORDER BY p.sixthNum ASC ")
    List<Map<String, Object>> countFrequencyOfSixthNum();

    @Query("SELECT p.groupNum AS number, COUNT(p.groupNum) AS frequency FROM PensionWinNum p GROUP BY p.groupNum ORDER BY p.groupNum ASC ")
    List<Map<String, Object>> countFrequencyOfGroupNum();



}
