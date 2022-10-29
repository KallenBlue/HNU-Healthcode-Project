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
 * 医院信息表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_hospital_info")
public class HospitalInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 医院id
     */
    @TableId(value = "hospital_id", type = IdType.ASSIGN_ID)
    private Long hospitalId;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 用户名
     */
    private String hospitalUsername;

    /**
     * 密码
     */
    private String hospitalPassword;

    /**
     * 地址
     */
    private String hospitalAddr;

    /**
     * 负责人姓名
     */
    private String hospitalChargePerson;

    /**
     * 负责人电话
     */
    private String hospitalPhoneNum;

    private Long roleId;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
