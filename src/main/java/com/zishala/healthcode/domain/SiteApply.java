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
 * 场所码申请表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_site_apply")
public class SiteApply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 场所码申请id
     */
    @TableId(value = "apply_id", type = IdType.ASSIGN_ID)
    private Long applyId;

    /**
     * 申请人id
     */
    private Long userId;

    /**
     * 申请时间
     */
    private LocalDateTime appTime;

    /**
     * 场所名称
     */
    private String siteName;

    /**
     * 区域id
     */
    private Long areaId;

    /**
     * 详细地址
     */
    private String detailAddr;

    /**
     * 描述
     */
    private String description;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
