package com.example.nodaji_pension_draw.dto;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;

import java.time.LocalDate;

public record BonusDto(
        Long id,
        int drawRound,
        int firstNum,
        int secondNum,
        int thirdNum,
        int fourthNum,
        int fifthNum,
        int sixthNum,
        LocalDate drawDate,
        PensionWinNumDto pensionWinNumDto
) {
    public PensionBonusNum toEntity() {
        return PensionBonusNum.builder()
                .id(id)
                .drawRound(drawRound)
                .firstNum(firstNum)
                .secondNum(secondNum)
                .thirdNum(thirdNum)
                .fourthNum(fourthNum)
                .fifthNum(fifthNum)
                .sixthNum(sixthNum)
                .drawDate(drawDate)

                .build();
    }
}
