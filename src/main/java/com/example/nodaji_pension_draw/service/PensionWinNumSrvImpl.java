package com.example.nodaji_pension_draw.service;
import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.repository.PensionWinNumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;


@Service
@RequiredArgsConstructor
public class PensionWinNumSrvImpl implements PensionWinNumSrv {
    private final PensionWinNumRepo pensionWinNumRepo;


    @Override
    public PensionWinNum getDrawByDate(LocalDate date) {
      return  pensionWinNumRepo.findByDrawDate(date);

    }

    @Override
    public PensionWinNum getDrawByRound(int round) {
        return pensionWinNumRepo.findByDrawRound(round);
    }

    @Override
    public List<PensionWinNum> getAllDraws() {
        pensionWinNumRepo.findAll().forEach(System.out::println);
        return List.of();
    }
}
