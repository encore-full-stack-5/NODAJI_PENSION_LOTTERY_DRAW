package com.example.nodaji_pension_draw.api;

import com.example.nodaji_pension_draw.dto.request.PensionWinAndBonus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "feignMatching", url = "34.44.4.146:31000")
public interface FeignMatching {

    @PostMapping("/api/v1/pension/matching")
    void matchingTicket(@RequestBody PensionWinAndBonus drawResult);
}
