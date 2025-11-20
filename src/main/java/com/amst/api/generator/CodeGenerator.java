package com.amst.api.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.nio.file.Paths;

public class CodeGenerator {

    public static void main(String[] args) {
        // 从环境变量获取数据库连接信息
        String mysqlHost = System.getenv("MYSQL_HOST");
        String username = System.getenv("MYSQL_USER");
        String password = System.getenv("MYSQL_PASSWORD");
        String db = System.getenv("MYSQL_DATABASE");

        // 检查环境变量是否设置
        if (mysqlHost == null || username == null || password == null) {
            throw new IllegalStateException("请设置环境变量 MYSQL_HOST、DB_USERNAME 和 DB_PASSWORD");
        }

        // 构建完整的数据库连接URL
        String url = "jdbc:mysql://" + mysqlHost + ":3344/" + db + "?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";

        // 使用 FastAutoGenerator 快速配置
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> builder
                        .author("lanzhs")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java/generator")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("code")
                        .entity("entity")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .xml("mapper.xml")
                )
                .strategyConfig(builder -> builder
                        .addInclude("t_simple") // 设置需要生成的表名
                        .entityBuilder()
                        .addTableFills(
                                new Column("create_time", FieldFill.INSERT),
                                new Column("update_time", FieldFill.INSERT_UPDATE)
                        )
                        .enableLombok()
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}