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
 * 核酸检测点（总表）
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_test_site")
public class TestSite implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "test_site_id", type = IdType.ASSIGN_ID)
    private Long testSiteId;

    private Long longTestSiteId;

    private Long shortTestSiteId;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
