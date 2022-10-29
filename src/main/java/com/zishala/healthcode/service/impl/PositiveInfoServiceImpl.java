package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.PositiveInfo;
import com.zishala.healthcode.dao.PositiveInfoDao;
import com.zishala.healthcode.service.IPositiveInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 初筛阳性人员信息 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class PositiveInfoServiceImpl extends ServiceImpl<PositiveInfoDao, PositiveInfo> implements IPositiveInfoService {

}
