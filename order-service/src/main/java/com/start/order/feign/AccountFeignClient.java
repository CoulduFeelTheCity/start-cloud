package com.start.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * Program Name: springcloud-nacos-seata
 * <p>
 * Description:
 * <p>
 *
 */
@FeignClient(name = "account-service")
public interface AccountFeignClient {

    @GetMapping("/account/decrease")
    String decrease(@RequestParam("userId") String userId, @RequestParam("money") BigDecimal money);
}
