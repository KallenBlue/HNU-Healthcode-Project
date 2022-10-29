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
 * 场所码信息记录表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_site_code_info")
public class SiteCodeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "addr_id", type = IdType.ASSIGN_ID)
    private Long addrId;

    private Long userId;

    private Long siteCodeId;

    private LocalDateTime scanTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
