package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.example.CpuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhaifeng
 * @date 2024/05/27/21:36
 */
@RestController
@RequestMapping
@Slf4j
public class CpuController {

    @DubboReference
    private CpuService cpuService;

    @GetMapping("/cpu")
    public String getCpuInfo() {
        log.info("请求CPU利用率");
        return cpuService.getCpuInfo();
    }

}
