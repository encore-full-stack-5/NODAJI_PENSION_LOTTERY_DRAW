//package com.example.nodaji_pension_draw.api;
//
//import com.example.nodaji_pension_draw.dto.request.PensionWinAndBonus;
//import lombok.RequiredArgsConstructor;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class ApiMatching {
//
//    public final FeignMatching feignMatching;
//
//    @Async
//    public void sendWinAndBonusResult(PensionWinAndBonus pensionWinAndBonus){
//        try {
//            feignMatching.matchingTicket(pensionWinAndBonus);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
