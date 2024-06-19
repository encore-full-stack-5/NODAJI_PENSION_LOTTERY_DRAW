package com.example.nodaji_pension_draw.dto;

import com.example.nodaji_pension_draw.entity.PensionWinNum;

import java.time.LocalDate;

public record  PensionWinNumDto(
        Long id,
        LocalDate drawDate,
        int drawRound,
        int firstNum,
        int secondNum,
        int thirdNum,
        int fourthNum,
        int fifthNum,
        int sixthNum,
        int groupNum
) {
    public PensionWinNum toDto(){
            return PensionWinNum.builder()
//                    .id(id)
                    .drawDate(drawDate)
                    .drawRound(drawRound)
                    .firstNum(firstNum)
                    .secondNum(secondNum)
                    .thirdNum(thirdNum)
                    .fourthNum(fourthNum)
                    .fifthNum(fifthNum)
                    .sixthNum(sixthNum)
                    .groupNum(groupNum)
                    .build();
    }
}
