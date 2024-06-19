package com.example.nodaji_pension_draw.dto.request;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.entity.PensionWinNum;

public record PensionWinAndBonus(
    PensionWinNum pensionWinNum,
    PensionBonusNum pensionBonusNum
) {
}
