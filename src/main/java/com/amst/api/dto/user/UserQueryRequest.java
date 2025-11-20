package com.amst.api.dto.user;


import com.amst.api.common.request.PageRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户查询请求
 * 用于分页查询用户信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "用户查询请求参数")
public class UserQueryRequest extends PageRequest implements Serializable {
    /**
     * id
     */
    @Schema(description = "用户ID")
    private Long id;

    /**
     * 开放平台id
     */
    @Schema(description = "开放平台ID")
    private String unionId;

    /**
     * 公众号openId
     */
    @Schema(description = "公众号OpenID")
    private String mpOpenId;

    /**
     * 用户昵称
     */
    @Schema(description = "用户昵称")
    private String userName;

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

    @Serial
    private static final long serialVersionUID = 1L;
}