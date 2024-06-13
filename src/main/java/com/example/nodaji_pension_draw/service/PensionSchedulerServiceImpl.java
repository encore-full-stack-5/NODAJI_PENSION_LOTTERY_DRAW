package com.example.nodaji_pension_draw.service;
import com.example.nodaji_pension_draw.entity.PensionBonusNum;
import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.repository.PensionBonusNumRepo;
import com.example.nodaji_pension_draw.repository.PensionWinNumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class PensionSchedulerServiceImpl implements PensionSchedulerService {
    private final PensionWinNumRepo pensionWinNumRepo;
    private final PensionBonusNumRepo pensionBonusNumRepo;

    public int drawRound = 1;
    public LocalDate date = LocalDate.now();

    @Override
//    @Scheduled(cron = "0 0 10 ? * THU")
    @Scheduled(cron = "*/5 * * * * *")
    public void generateScheduledDraw() {
        date = LocalDate.now();
        PensionWinNum draw =  createDraw();
        pensionWinNumRepo.save(draw);
        PensionBonusNum  bonusNum = createBonusDraw();
        pensionBonusNumRepo.save(bonusNum);
        drawRound++;


    }

    @Override
    public PensionBonusNum createBonusDraw() {

        Random random = new Random();
        PensionBonusNum bn = PensionBonusNum.builder()
                .drawRound(drawRound)
                .firstNum(random.nextInt(10))  // Numbers from 0 to 9
                .secondNum(random.nextInt(10))
                .thirdNum(random.nextInt(10))
                .fourthNum(random.nextInt(10))
                .fifthNum(random.nextInt(10))
                .sixthNum(random.nextInt(10))
                .drawDate(date)
                .build();


        return bn;
    }


    @Override
    public PensionWinNum createDraw() {
        Random random = new Random();
        PensionWinNum pw = PensionWinNum.builder()
                .drawRound(drawRound)
                .firstNum(random.nextInt(10))  // Numbers from 0 to 9
                .secondNum(random.nextInt(10))
                .thirdNum(random.nextInt(10))
                .fourthNum(random.nextInt(10))
                .fifthNum(random.nextInt(10))
                .sixthNum(random.nextInt(10))
                .groupNum(random.nextInt(4)+1)  // Group number from 0 to 9
                .drawDate(date)
                .build();

        return pw;
    }

}
