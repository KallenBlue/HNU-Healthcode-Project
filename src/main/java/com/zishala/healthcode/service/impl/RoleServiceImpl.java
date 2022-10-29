package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.Role;
import com.zishala.healthcode.dao.RoleDao;
import com.zishala.healthcode.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements IRoleService {

}
