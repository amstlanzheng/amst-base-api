package com.amst.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户更新个人信息请求
 * 用于用户更新自己的基本信息
 */
@Data
@Schema(description = "用户更新个人信息请求参数")
public class UserUpdateMyRequest implements Serializable {

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

    private static final long serialVersionUID = 1L;
}