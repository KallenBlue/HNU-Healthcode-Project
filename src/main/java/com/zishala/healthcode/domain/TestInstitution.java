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
 * 核酸检测机构
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_test_institution")
public class TestInstitution implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 核酸检测机构id
     */
    @TableId(value = "institution_id", type = IdType.ASSIGN_ID)
    private Long institutionId;

    /**
     * 用户名
     */
    private String institutionUsername;

    /**
     * 密码
     */
    private String institutionPassword;

    /**
     * 负责人姓名
     */
    private String institutionChargePerson;

    /**
     * 负责人电话
     */
    private String institutionPhoneNum;

    private Long roleId;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
