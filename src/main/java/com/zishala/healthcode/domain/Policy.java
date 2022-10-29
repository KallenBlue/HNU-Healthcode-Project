package com.zishala.healthcode.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 防疫政策表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_policy")
public class Policy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 防疫政策id
     */
    @TableId(value = "policy_id", type = IdType.ASSIGN_ID)
    private Long policyId;

    /**
     * 防疫政策内容
     */
    private String policyContent;

    /**
     * 发布者id
     */
    private Long superManagerId;

    /**
     * 发布时间
     */
    private LocalDateTime publishTime;

    /**
     * 是否生效
     */
    private Boolean ifValid;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
