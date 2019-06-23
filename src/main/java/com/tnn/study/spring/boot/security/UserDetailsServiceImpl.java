package com.tnn.study.spring.boot.security;

import com.tnn.study.spring.boot.model.ApplicationUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ttnhan on 8/25/2015.
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) {
        try {
            Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("admin"));

            return new org.springframework.security.core.userdetails.User("admin", bCryptPasswordEncoder.encode("123456"), grantedAuthorities);
        } catch (Exception e) {
            logger.error("Error occurred while load user.", e);
        }
        return new org.springframework.security.core.userdetails.User(null, null, null);
    }
}