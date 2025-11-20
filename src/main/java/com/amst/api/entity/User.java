package com.amst.api.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * 对应数据库表"user"
 */
@TableName(value = "user")
@Data
@Schema(description = "用户实体")
public class User implements Serializable {

    /**
     * 主键ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    @Schema(description = "主键ID")
    private Long id;

    /**
     * 用户账号
     */
    @Schema(description = "用户账号")
    private String userAccount;

    /**
     * 用户密码
     */
    @Schema(description = "用户密码")
    private String userPassword;

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

    /**
     * 更新时间
     */
    @Schema(description = "更新时间")
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    @Schema(description = "逻辑删除标识(0-未删除，1-已删除)")
    private Integer isDelete;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}