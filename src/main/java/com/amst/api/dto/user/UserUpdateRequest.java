package com.amst.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户更新请求
 * 用于管理员更新用户信息
 */
@Data
@Schema(description = "用户更新请求参数")
public class UserUpdateRequest implements Serializable {
    /**
     * id
     */
    @Schema(description = "用户ID")
    private Long id;

    /**
     * 用户昵称
     */
    @Schema(description = "用户昵称")
    private String userName;

    /**
     * 用户头像
     */
    @Schema(description = "用户头像URL")
    private String userAvatar;

    /**
     * 简介
     */
    @Schema(description = "用户简介")
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    @Schema(description = "用户角色(user/admin/ban)")
    private String userRole;

    private static final long serialVersionUID = 1L;
}