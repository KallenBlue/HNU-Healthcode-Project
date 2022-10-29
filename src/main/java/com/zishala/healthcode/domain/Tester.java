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
 * 核酸检测人员表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_tester")
public class Tester implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 核酸检测人员id
     */
    @TableId(value = "tester_id", type = IdType.ASSIGN_ID)
    private Long testerId;

    /**
     * 检测人员姓名
     */
    private String testerName;

    /**
     * 检测人员电话
     */
    private String testerPhone;

    /**
     * 检测机构id
     */
    private Long institutionId;

    /**
     * 检测人员用户名
     */
    private String testerUsername;

    /**
     * 检测人员密码
     */
    private String testerPassword;

    /**
     * 检测人员民族
     */
    private String testerNation;

    private Long roleId;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
