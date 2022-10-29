package com.zishala.healthcode.service.impl;

import com.zishala.healthcode.domain.User;
import com.zishala.healthcode.dao.UserDao;
import com.zishala.healthcode.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 健康码使用者信息表 服务实现类
 * </p>
 *
 * @author kallen
 * @since 2022-10-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
