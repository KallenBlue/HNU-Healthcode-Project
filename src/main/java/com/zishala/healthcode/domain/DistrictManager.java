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
 * 曲线管理者
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_district_manager")
public class DistrictManager implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区县管理者id
     */
    @TableId(value = "district_manager_id", type = IdType.ASSIGN_ID)
    private Long districtManagerId;

    /**
     * 账号
     */
    private String districtManagerUsername;

    /**
     * 密码
     */
    private String districtManagerPassword;

    /**
     * 区县名
     */
    private String districtName;

    /**
     * 上级管理者id
     */
    private Long superManagerId;

    /**
     * 区域id
     */
    private Long areaId;

    /**
     * 负责人电话
     */
    private String districtManagerPhoneNum;

    private Long roleId;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
