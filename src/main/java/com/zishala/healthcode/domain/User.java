package com.zishala.healthcode.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 健康码使用者信息表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "user_id", type = IdType.ASSIGN_ID)
    private Long userId;

    /**
     * 健康码二维码链接
     */
    private String healthCode;

    /**
     * 健康码状态（g/y/r）
     */
    private String healthState;

    /**
     * 电话号码
     */
    private String userPhoneNumber;

    /**
     * 身份证号
     */
    private String userIdCard;

    /**
     * 名字
     */
    private String userName;

    /**
     * 性别f/m
     */
    private String userGender;

    /**
     * 区域
     */
    private Long areaId;

    /**
     * 地址
     */
    private String userAddr;

    /**
     * 民族
     */
    private String userNation;

    private Long roleId;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
