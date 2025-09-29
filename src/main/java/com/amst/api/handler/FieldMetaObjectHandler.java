package com.amst.api.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 公共字段，自动填充值
 *
 * @author 能力开放产品线基础框架
 */
@Component
public class FieldMetaObjectHandler implements MetaObjectHandler {
    /**
     * 创造日期
     */
    private static final  String CREATE_DATE = "createDate";
    /**
     * 更新日期
     */
    private static final String UPDATE_DATE = "updateDate";

    /**
     * 插入填满
     *
     * @param metaObject 元对象
     */
    @Override
    public void insertFill(MetaObject metaObject) {

        Date date = new Date();

        //创建时间
        strictInsertFill(metaObject, CREATE_DATE, Date.class, date);
        //更新时间
        strictInsertFill(metaObject, UPDATE_DATE, Date.class, date);
    }

    /**
     * 更新填满
     *
     * @param metaObject 元对象
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        //更新时间
        strictUpdateFill(metaObject, UPDATE_DATE, Date.class, new Date());
    }
}