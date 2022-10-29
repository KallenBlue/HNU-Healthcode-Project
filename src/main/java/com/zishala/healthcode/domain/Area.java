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
 * 区域表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_area")
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域id
     */
    @TableId(value = "area_id", type = IdType.ASSIGN_ID)
    private Long areaId;

    /**
     * 行政区县名
     */
    private String districtName;

    /**
     * 所属区县防疫办id
     */
    private Long districtManagerId;

    /**
     * 地级市名称
     */
    private String cityName;

    /**
     * 省名
     */
    private String provinceName;

    /**
     * 风险
     */
    private String risk;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
