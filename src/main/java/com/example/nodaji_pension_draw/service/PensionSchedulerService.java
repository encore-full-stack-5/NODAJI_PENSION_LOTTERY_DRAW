package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.entity.PensionWinNum;

public interface PensionSchedulerService {
    public void generateScheduledDraw();

    //    public PensionBonusNum redrawLastDigit(PensionBonusNum bonusNum) {
    //        Random random = new Random();
    //        int newSixthNum = random.nextInt(10);
    //        bonusNum.setSixthNum(newSixthNum);
    //        return bonusNum;
    //    }
    PensionBonusNum redrawLastDigit(PensionBonusNum bonusNum);

    public PensionBonusNum createBonusDraw();
    public PensionWinNum createDraw();

}
