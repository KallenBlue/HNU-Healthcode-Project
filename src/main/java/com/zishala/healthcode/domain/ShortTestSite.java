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
 * 临时核酸检测点 （当日）
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_short_test_site")
public class ShortTestSite implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 临时核酸检测点id
     */
    @TableId(value = "short_test_site_id", type = IdType.ASSIGN_ID)
    private Long shortTestSiteId;

    /**
     * 检测机构id
     */
    private Long institutionId;

    /**
     * 区域
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
     * 开始检测时间
     */
    private LocalTime fromTime;

    /**
     * 结束检测时间
     */
    private LocalTime toTime;

    /**
     * 是否在工作
     */
    private Boolean isWorking;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
