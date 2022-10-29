package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.PatientInfo;
import com.zishala.healthcode.dao.PatientInfoDao;
import com.zishala.healthcode.service.IPatientInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 确诊人员信息 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class PatientInfoServiceImpl extends ServiceImpl<PatientInfoDao, PatientInfo> implements IPatientInfoService {

}
