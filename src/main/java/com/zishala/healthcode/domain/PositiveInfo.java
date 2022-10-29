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
 * 初筛阳性人员信息
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_positive_info")
public class PositiveInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 初筛阳性信息id
     */
    @TableId(value = "positive_info_id", type = IdType.ASSIGN_ID)
    private Long positiveInfoId;

    /**
     * 人员id
     */
    private Long userId;

    /**
     * 医院id
     */
    private Long hospitalId;

    /**
     * 收治时间
     */
    private LocalDateTime receiveTime;

    /**
     * 试管编号
     */
    private Long testTubeId;

    /**
     * 结果
     */
    private Boolean result;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
