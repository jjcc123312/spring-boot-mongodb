package com.study.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Leo
 * @version 1.0
 * @className UserInfoDO
 * @description TODO
 * @date 2022/4/16 17:35
 **/
@Document("userInfo")
@Data
public class UserInfoDO {

    /*** 自定义mongo主键 加此注解可自定义主键类型以及自定义自增规则
     *  若不加 插入数据数会默认生成 ObjectId 类型的_id 字段
     *  org.springframework.data.annotation.Id 包下
     *  mongo库主键字段还是为_id 。不必细究(本文实体类中为id）
     */
    @Id
    private String id;

    private String name;

    private String sex;

    private String city;

    private Date dateBirth;

    private Date gmtCreate;
}
