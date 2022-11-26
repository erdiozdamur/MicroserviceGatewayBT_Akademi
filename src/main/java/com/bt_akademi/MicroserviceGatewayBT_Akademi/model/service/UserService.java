package com.bt_akademi.MicroserviceGatewayBT_Akademi.model.service;

import com.bt_akademi.MicroserviceGatewayBT_Akademi.model.entity.User;
import com.bt_akademi.MicroserviceGatewayBT_Akademi.security.SecurityConfig;
import com.bt_akademi.MicroserviceGatewayBT_Akademi.utility.Util;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService extends AbstractUserService {

    @Override
    public User findByUsername(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        try
        {

            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setCreated(new Date());

            return userRepository.save(user);
        }
        catch (IllegalArgumentException e)
        {
            Util.showGeneralExceptionInfo(e);
            return null;
        }
        catch (OptimisticLockingFailureException e)
        {
            Util.showGeneralExceptionInfo(e);
            return null;
        }
    }

    @Override
    public void deleteById(Integer userID) {
        try
        {
            userRepository.deleteById(userID);
        }
        catch (IllegalArgumentException e)
        {
            Util.showGeneralExceptionInfo(e);
        }
    }
}