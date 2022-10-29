package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.Policy;
import com.zishala.healthcode.dao.PolicyDao;
import com.zishala.healthcode.service.IPolicyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 防疫政策表 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class PolicyServiceImpl extends ServiceImpl<PolicyDao, Policy> implements IPolicyService {

}
