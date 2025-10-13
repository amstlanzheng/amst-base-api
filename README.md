# AMST基础API项目

## 项目介绍

这是一个基于Spring Boot 3开发的基础API项目模板，包含了构建现代Web应用程序所需的核心功能模块。

### 核心特性

- **统一异常管理**: 全局异常处理器，标准化错误响应格式
- **统一返回结果**: 规范化的API响应结构，便于前端处理
- **跨域请求配置**: 支持跨域请求，方便前后端分离开发
- **数据库配置**: 集成MySQL数据库，使用MyBatis-Flex作为ORM框架
- **Redis集成**: 集成Redis用于缓存和会话管理
- **用户认证授权**: 完整的用户注册、登录、权限控制机制
- **接口文档**: 集成Swagger/Knife4j自动生成API文档
- **代码生成**: 内置MyBatis代码生成器，提高开发效率

## 技术栈

### 后端技术
- **核心框架**: Spring Boot 3.4.9
- **编程语言**: Java 21
- **数据库**: MySQL 8
- **持久层**: MyBatis-Flex 1.11.0
- **缓存**: Redis
- **接口文档**: Knife4j + SpringDoc OpenAPI 3
- **工具库**: Hutool、Apache Commons Lang3
- **其他**: Lombok 1.18.38、AOP、Session管理

## 环境要求

- JDK 21
- MySQL 8+
- Redis
- Maven 3.6+

## 快速开始

### 1. 环境配置

在运行项目之前，需要配置以下环境变量或修改[application.yml](file:///C:/project/java/amst-agent/amst-base-api/src/main/resources/application.yml)文件:

```bash
MYSQL_HOST=localhost      # MySQL服务器地址
MYSQL_PORT=3306          # MySQL端口号
MYSQL_DATABASE=amst_db   # 数据库名
MYSQL_USER=root          # 数据库用户名
MYSQL_PASSWORD=password  # 数据库密码

REDIS_HOST=localhost     # Redis服务器地址
REDIS_PORT=6379          # Redis端口号
REDIS_PASSWORD=          # Redis密码(如果有的话)
```

### 2. 数据库初始化

执行SQL脚本[src/main/resources/sql/schema.sql](file:///C:/project/java/amst-agent/amst-base-api/src/main/resources/sql/schema.sql)创建数据库表结构。

### 3. 项目启动

使用Maven命令启动项目:

```bash
mvn clean install
mvn spring-boot:run
```

或者在IDE中直接运行[AmstBaseApiApplication.java](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/AmstBaseApiApplication.java)主类。

### 4. 访问接口

项目启动后，可通过以下地址访问:

- API根路径: http://localhost:8866/api
- API文档: http://localhost:8866/api/swagger-ui.html

## 项目结构

```
src/main/java/com/amst/api/
├── annotation/     # 自定义注解
├── aop/            # 切面编程
├── common/         # 公共模块
│   ├── config/     # 配置类
│   ├── constant/   # 常量定义
│   ├── exception/  # 异常处理
│   └── response/   # 统一响应
├── controller/     # 控制层
├── mapper/         # 数据访问层
├── model/          # 数据模型
│   ├── dto/        # 数据传输对象
│   ├── entity/     # 实体类
│   └── vo/         # 视图对象
├── service/        # 业务逻辑层
└── AmstBaseApiApplication.java  # 启动类
```

## 功能模块

### 用户模块

- 用户注册 [/api/user/register](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/controller/UserController.java#L42-L50)
- 用户登录 [/api/user/login](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/controller/UserController.java#L57-L65)
- 获取当前登录用户 [/api/user/get/login](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/controller/UserController.java#L72-L76)
- 用户注销 [/api/user/logout](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/controller/UserController.java#L83-L89)
- 创建用户 [/api/user/add](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/controller/UserController.java#L93-L105)
- 获取用户信息 [/api/user/get](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/controller/UserController.java#L112-L120)
- 删除用户 [/api/user/delete](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/controller/UserController.java#L145-L154)
- 更新用户 [/api/user/update](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/controller/UserController.java#L160-L171)
- 分页查询用户 [/api/user/list/page/vo](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/controller/UserController.java#L182-L195)

## 开发指南

### 代码规范

- 使用Lombok简化Java代码
- 使用统一的异常处理机制
- 使用DTO进行数据传输
- 使用VO进行数据展示

### 权限控制

通过[@AuthCheck](file:///C:/project/java/amst-agent/amst-base-api/src/main/java/com/amst/api/annotation/AuthCheck.java)注解实现接口级别的权限控制:

```java
@AuthCheck(mustRole = UserConstant.ADMIN_ROLE) // 仅管理员可访问
```

### 注意事项

1. JDK版本和SpringBoot版本可根据需求调整，但需注意Lombok版本兼容性
2. 修改YAML配置或设置相应环境变量以匹配实际部署环境
3. 生产环境中应关闭开发工具(devtools)并加强安全配置
4. 数据库连接池使用HikariCP，默认配置可根据实际负载情况调优