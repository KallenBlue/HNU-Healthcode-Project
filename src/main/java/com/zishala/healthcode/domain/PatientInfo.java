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
 * 确诊人员信息
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table_patient_info")
public class PatientInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 确诊人员信息id
     */
    @TableId(value = "patient_info_id", type = IdType.ASSIGN_ID)
    private Long patientInfoId;

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
     * 房间号
     */
    private String roomNum;

    /**
     * 阴性次数
     */
    private Integer negativeCount;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
