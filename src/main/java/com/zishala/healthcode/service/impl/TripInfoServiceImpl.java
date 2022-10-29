package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.TripInfo;
import com.zishala.healthcode.dao.TripInfoDao;
import com.zishala.healthcode.service.ITripInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 行程码信息表（测试用） 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class TripInfoServiceImpl extends ServiceImpl<TripInfoDao, TripInfo> implements ITripInfoService {

}
