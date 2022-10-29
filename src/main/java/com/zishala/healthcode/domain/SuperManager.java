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
 * 超级管理者
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_super_manager")
public class SuperManager implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 超级管理者id
     */
    @TableId(value = "super_manager_id", type = IdType.ASSIGN_ID)
    private Long superManagerId;

    /**
     * 区域id
     */
    private Long areaId;

    /**
     * 账号
     */
    private String superManagerUsername;

    /**
     * 密码
     */
    private String superManagerPassword;

    /**
     * 名字
     */
    private String superManagerName;

    /**
     * 负责人姓名
     */
    private String superManagerChargePerson;

    /**
     * 负责人电话
     */
    private String superManagerPhoneNum;

    private Long roleId;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
