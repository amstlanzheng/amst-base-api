package com.amst.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 * 用于新用户注册
 */
@Data
@Schema(description = "用户注册请求参数")
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    @Schema(description = "用户账号")
    private String userAccount;

    @Schema(description = "用户密码")
    private String userPassword;

    @Schema(description = "确认密码")
    private String checkPassword;
}