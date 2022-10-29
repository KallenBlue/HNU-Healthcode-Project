package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.Tester;
import com.zishala.healthcode.dao.TesterDao;
import com.zishala.healthcode.service.ITesterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 核酸检测人员表 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class TesterServiceImpl extends ServiceImpl<TesterDao, Tester> implements ITesterService {

}
