package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.TestSite;
import com.zishala.healthcode.dao.TestSiteDao;
import com.zishala.healthcode.service.ITestSiteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 核酸检测点（总表） 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class TestSiteServiceImpl extends ServiceImpl<TestSiteDao, TestSite> implements ITestSiteService {

}
