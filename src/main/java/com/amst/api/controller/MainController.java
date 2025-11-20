package com.amst.api.controller;

import com.amst.api.common.response.BaseResponse;
import com.amst.api.common.response.ResultUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查控制器
 * 提供系统健康状态检查接口
 *
 * @author lanzhs
 * @date 2025/10/15
 * @version 1.0
 */
@RestController
@RequestMapping("/")
@Tag(name = "健康检查接口", description = "提供系统运行状态检查相关接口")
public class MainController {

    /**
     * 健康检查接口
     * 检查系统是否正常运行
     *
     * @return 系统状态，返回"ok"表示系统正常运行
     */
    @GetMapping("/health")
    @Operation(summary = "健康检查", description = "检查系统是否正常运行")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}