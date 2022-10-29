package com.zishala.healthcode.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import java.time.LocalTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 常态化核酸检测点
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_long_test_site")
public class LongTestSite implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 常态化核酸检测点id
     */
    @TableId(value = "long_test_site_id", type = IdType.ASSIGN_ID)
    private Long longTestSiteId;

    /**
     * 核酸检测机构id
     */
    private Long institutionId;

    /**
     * 区域id
     */
    private Long areaId;

    /**
     * 负责人姓名
     */
    private String chargePerson;

    /**
     * 负责人手机号
     */
    private String chargePhone;

    /**
     * 检测台数量
     */
    private Integer tableNum;

    /**
     * 周一开始时间
     */
    private LocalTime mondayStart;

    /**
     * 周一结束时间
     */
    private LocalTime mondayEnd;

    /**
     * 周二开始时间
     */
    private LocalTime tuesdayStart;

    /**
     * 周二结束时间
     */
    private LocalTime tuesdayEnd;

    /**
     * 周三开始时间
     */
    private LocalTime wednsdayStart;

    /**
     * 周三结束时间
     */
    private LocalTime wednsdayEnd;

    /**
     * 周四开始时间
     */
    private LocalTime thursdayStart;

    /**
     * 周四结束时间
     */
    private LocalTime thursdayEnd;

    /**
     * 周五开始时间
     */
    private LocalTime fridayStart;

    /**
     * 周五结束时间
     */
    private LocalTime fridayEnd;

    /**
     * 周六开始时间
     */
    private LocalTime saturdayStart;

    /**
     * 周六结束时间
     */
    private LocalTime saturdayEnd;

    /**
     * 周日开始时间
     */
    private LocalTime sundayStart;

    /**
     * 周日结束时间
     */
    private LocalTime sundayEnd;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
