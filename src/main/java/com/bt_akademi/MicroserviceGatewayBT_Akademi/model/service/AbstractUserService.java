package com.bt_akademi.MicroserviceGatewayBT_Akademi.model.service;

import com.bt_akademi.MicroserviceGatewayBT_Akademi.model.entity.User;
import com.bt_akademi.MicroserviceGatewayBT_Akademi.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public abstract class AbstractUserService implements EntityService<User, Integer> {

    @Autowired
    protected UserRepository userRepository;

    public abstract User findByUsername(String userName);

    @Autowired
    protected PasswordEncoder passwordEncoder;

}
