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
 * 行程码信息表（测试用）
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_trip_info")
public class TripInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "trip_id", type = IdType.ASSIGN_ID)
    private Long tripId;

    private Long userId;

    private String tripInfo;

    private LocalDateTime tripTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
