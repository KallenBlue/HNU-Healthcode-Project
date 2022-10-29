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
 * 场所码表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_site_code")
public class SiteCode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "site_code_id", type = IdType.ASSIGN_ID)
    private Long siteCodeId;

    /**
     * 场所码二维码链接
     */
    private String siteCode;

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

    /**
     * 申请人
     */
    private Long userId;

    /**
     * 申请时间
     */
    private LocalDateTime appTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
