package com.example.nodaji_pension_draw.controller;
import com.example.nodaji_pension_draw.entity.PensionWinNum;
import com.example.nodaji_pension_draw.service.PensionWinNumSvc;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "*"
        ,methods = {
        RequestMethod.GET,
        RequestMethod.POST,
        RequestMethod.DELETE,
        RequestMethod.PUT,
        RequestMethod.OPTIONS}, allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/pension-win")
@RequiredArgsConstructor
public class PensionNumController {

    private final PensionWinNumSvc pensionWinNumSvc;

    @GetMapping("/date")
    public List<PensionWinNum> getDrawByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {

        return pensionWinNumSvc.getDrawByDate(date);
    }

    @GetMapping("/round")
    public List<PensionWinNum> getDrawByRound(@RequestParam(value = "round") int round) {
        return pensionWinNumSvc.getDrawByRound(round);

    }

    @GetMapping("/all")
    public List<PensionWinNum> getAllDraws() {
        return pensionWinNumSvc.getAllDraws();

    }
}
