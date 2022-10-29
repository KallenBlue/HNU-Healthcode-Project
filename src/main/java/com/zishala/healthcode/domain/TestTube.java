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
 * 核酸检测试管表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_test_tube")
public class TestTube implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 核酸检测试管id
     */
    @TableId(value = "test_tube_id", type = IdType.ASSIGN_ID)
    private Long testTubeId;

    private Long testSiteId;

    /**
     * 核酸检测机构id
     */
    private Long institutionId;

    /**
     * 检测时间
     */
    private LocalDateTime testTime;

    /**
     * 检测人员
     */
    private Long testerId;

    /**
     * 所有被检测人员id
     */
    private String tested;

    /**
     * 是否被使用
     */
    private Boolean ifUsed;

    /**
     * 结果
     */
    private Boolean result;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
