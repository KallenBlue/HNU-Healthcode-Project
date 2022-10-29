package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.Authority;
import com.zishala.healthcode.dao.AuthorityDao;
import com.zishala.healthcode.service.IAuthorityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class AuthorityServiceImpl extends ServiceImpl<AuthorityDao, Authority> implements IAuthorityService {

}
