package com.amst.api.controller;

import com.amst.api.common.response.BaseResponse;
import com.amst.api.common.response.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanzhs
 * @date 2025/10/15
 * @description 健康检查
 * @version 1.0
 */
@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
