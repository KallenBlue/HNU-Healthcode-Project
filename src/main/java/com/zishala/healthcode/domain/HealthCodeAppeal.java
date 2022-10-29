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
 * 健康码申诉表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_health_code_appeal")
public class HealthCodeAppeal implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 健康码申诉id
     */
    @TableId(value = "appeal_id", type = IdType.ASSIGN_ID)
    private Long appealId;

    /**
     * 申请人id
     */
    private Long userId;

    /**
     * 申请时间
     */
    private LocalDateTime appTime;

    /**
     * 申请理由
     */
    private String reason;

    /**
     * 是否解决
     */
    private Boolean appealState;

    /**
     * 解决时间
     */
    private LocalDateTime appealTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
