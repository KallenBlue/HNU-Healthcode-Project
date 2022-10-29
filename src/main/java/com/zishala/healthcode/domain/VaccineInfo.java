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
 * 用户疫苗信息表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_vaccine_info")
public class VaccineInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户疫苗信息id
     */
    @TableId(value = "vaccine_info_id", type = IdType.ASSIGN_ID)
    private Long vaccineInfoId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 接种时间
     */
    private LocalDateTime injectTime;

    /**
     * 疫苗品牌
     */
    private String vaccineBrand;

    /**
     * 接种地点
     */
    private String injectSite;

    /**
     * 第几针
     */
    private String count;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
