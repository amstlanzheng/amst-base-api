package com.amst.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户创建请求
 * 用于管理员创建新用户
 */
@Data
@Schema(description = "用户创建请求参数")
public class UserAddRequest implements Serializable {

    /**
     * 用户昵称
     */
    @Schema(description = "用户昵称")
    private String userName;

    /**
     * 账号
     */
    @Schema(description = "用户账号")
    private String userAccount;

    /**
     * 用户头像
     */
    @Schema(description = "用户头像URL")
    private String userAvatar;

    /**
     * 用户角色: user, admin
     */
    @Schema(description = "用户角色(user/admin)")
    private String userRole;

    private static final long serialVersionUID = 1L;
}