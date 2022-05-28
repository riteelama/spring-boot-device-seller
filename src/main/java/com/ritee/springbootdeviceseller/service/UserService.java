package com.ritee.springbootdeviceseller.service;

import com.ritee.springbootdeviceseller.model.Role;
import com.ritee.springbootdeviceseller.model.User;

import java.util.Optional;

public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
