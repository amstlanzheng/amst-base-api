package com.amst.api.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Schema(description = "用户注册请求")
public class UserRegisterRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    @Schema(description = "用户账号")
    private String userAccount;

    /**
     * 密码
     */
    @Schema(description = "用户密码")
    private String userPassword;

    /**
     * 确认密码
     */
    @Schema(description = "确认密码")
    private String checkPassword;
}