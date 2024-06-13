package com.example.nodaji_pension_draw.service;

import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.entity.PensionWinNum;

public interface PensionSchedulerService {
    public void generateScheduledDraw();
    public PensionBonusNum createBonusDraw();
    public PensionWinNum createDraw();
}
