package org.example.service.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.service.CpuService;

/**
 * @author liuhaifeng
 * @date 2024/05/27/21:33
 */
@DubboService
@Slf4j
public class CpuServiceImpl implements CpuService {
    @Override
    public String getCpuInfo() {
        log.info("service被调用");
        return "Hello";
    }
}
