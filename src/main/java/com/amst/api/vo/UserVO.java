package com.amst.api.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户视图（脱敏）
 * 用于向前端返回脱敏后的用户信息
 */
@Data
@Schema(description = "用户视图对象(脱敏后)")
public class UserVO implements Serializable {

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
     * 用户简介
     */
    @Schema(description = "用户简介")
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    @Schema(description = "用户角色(user/admin/ban)")
    private String userRole;

    /**
     * 创建时间
     */
    @Schema(description = "创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}