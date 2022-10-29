package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.HospitalInfo;
import com.zishala.healthcode.dao.HospitalInfoDao;
import com.zishala.healthcode.service.IHospitalInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 医院信息表 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class HospitalInfoServiceImpl extends ServiceImpl<HospitalInfoDao, HospitalInfo> implements IHospitalInfoService {

}
