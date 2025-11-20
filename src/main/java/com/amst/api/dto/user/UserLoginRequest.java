package com.amst.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 * 用于用户登录认证
 */
@Data
@Schema(description = "用户登录请求参数")
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    @Schema(description = "用户账号")
    private String userAccount;

    @Schema(description = "用户密码")
    private String userPassword;
}