package com.serhatkorkmaz.api.service;

import com.serhatkorkmaz.api.entity.User;
import com.serhatkorkmaz.api.entity.enums.Role;

import java.util.List;

public interface IUserService extends IService<User>{
    List<User> getUsersByRole(Role role);
    List<User> getPotentialUsers(List<Integer> ids);
}
