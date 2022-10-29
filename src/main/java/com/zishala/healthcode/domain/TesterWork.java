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
 * 核酸检测人员工作表
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_tester_work")
public class TesterWork implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 核酸检测人员工作表id
     */
    @TableId(value = "test_work_id", type = IdType.ASSIGN_ID)
    private Long testWorkId;

    /**
     * 检测人员id
     */
    private Long testerId;

    /**
     * 检测地点id
     */
    private Long testSiteId;

    /**
     * 开始工作的时间
     */
    private LocalDateTime fromTime;

    /**
     * 结束工作时间
     */
    private LocalDateTime toTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
