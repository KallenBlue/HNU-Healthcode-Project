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
 * 用户核酸信息表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_acid_info")
public class AcidInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户核酸信息id
     */
    @TableId(value = "acid_info_id", type = IdType.ASSIGN_ID)
    private Long acidInfoId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 检测时间
     */
    private LocalDateTime testTime;

    /**
     * 检测地点id
     */
    private Long testSiteId;

    /**
     * 检测结果
     */
    private Boolean result;

    /**
     * 是否单采
     */
    private Boolean ifSingle;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
