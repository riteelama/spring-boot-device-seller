package com.ritee.springbootdeviceseller.service;

import com.ritee.springbootdeviceseller.model.User;

public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
