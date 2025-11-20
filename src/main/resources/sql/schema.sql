-- 创建库
create database if not exists test;

-- 切换库
use test;

-- 用户表
CREATE TABLE IF NOT EXISTS user
(
    id            bigint AUTO_INCREMENT COMMENT 'id' PRIMARY KEY,
    user_account  varchar(256)                           NOT NULL COMMENT '账号',
    user_password varchar(512)                           NOT NULL COMMENT '密码',
    union_id      varchar(256)                           NULL COMMENT '微信开放平台id',
    mp_open_id    varchar(256)                           NULL COMMENT '公众号openId',
    user_name     varchar(256)                           NULL COMMENT '用户昵称',
    user_avatar   varchar(1024)                          NULL COMMENT '用户头像',
    user_profile  varchar(512)                           NULL COMMENT '用户简介',
    user_role     varchar(256) DEFAULT 'user'            NOT NULL COMMENT '用户角色：user/admin/ban',
    create_time   datetime     DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    update_time   datetime     DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    is_delete     tinyint      DEFAULT 0                 NOT NULL COMMENT '是否删除',
    INDEX idx_union_id (union_id)
) COMMENT '用户' COLLATE = utf8mb4_unicode_ci;
-- 插入初始用户 账号：admin 密码：33550336lh.
INSERT INTO `user` VALUES (1991443951525064705, 'admin', '7a79416b26cc411b45e75229d9279738', NULL, NULL, NULL, NULL, NULL, 'admin', '2025-11-20 09:49:30', '2025-11-20 09:52:28', 0);
