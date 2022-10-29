package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.TestTube;
import com.zishala.healthcode.dao.TestTubeDao;
import com.zishala.healthcode.service.ITestTubeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 核酸检测试管表 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class TestTubeServiceImpl extends ServiceImpl<TestTubeDao, TestTube> implements ITestTubeService {

}
