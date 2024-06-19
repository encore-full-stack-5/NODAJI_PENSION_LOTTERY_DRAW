package com.example.nodaji_pension_draw.service;
//import com.example.nodaji_pension_draw.api.ApiMatching;
import com.example.nodaji_pension_draw.dto.PensionWinNumDto;
import com.example.nodaji_pension_draw.dto.request.PensionWinAndBonus;
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
//    private final ApiMatching apiMatching;

    public int drawRound = 1;
    public LocalDate date = LocalDate.now();

    @Override
//    @Scheduled(cron = "0 0 10 ? * THU")
    @Scheduled(cron = "0 */1 * * * *")
    public void generateScheduledDraw() {
        date = LocalDate.now();
        PensionWinNum draw =  createDraw();
        pensionWinNumRepo.save(draw);
        PensionBonusNum  bonusNum = createBonusDraw();
        pensionBonusNumRepo.save(bonusNum);

//        PensionWinAndBonus pensionWinAndBonus = new PensionWinAndBonus(draw, bonusNum);
//        apiMatching.sendWinAndBonusResult(pensionWinAndBonus);

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

        PensionWinNumDto pwDto = new PensionWinNumDto(
                null, // id will be auto-generated or set to null initially
                date,
                drawRound,
                random.nextInt(10),  // Numbers from 0 to 9
                random.nextInt(10),
                random.nextInt(10),
                random.nextInt(10),
                random.nextInt(10),
                random.nextInt(10),
                random.nextInt(4) + 1  // Group number from 1 to 4
        );

        return pwDto.toDto();
    }

}
