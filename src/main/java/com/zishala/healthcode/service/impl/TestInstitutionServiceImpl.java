package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.TestInstitution;
import com.zishala.healthcode.dao.TestInstitutionDao;
import com.zishala.healthcode.service.ITestInstitutionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 核酸检测机构 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class TestInstitutionServiceImpl extends ServiceImpl<TestInstitutionDao, TestInstitution> implements ITestInstitutionService {

}
