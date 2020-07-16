package com.tnn.study.spring.boot.repository;


import com.tnn.study.spring.boot.model.ApplicationUser;

import java.util.List;

public interface ApplicationUserRepository {
    /**
     * read list user
     * @return {@link List< ApplicationUser >}
     */
    List<ApplicationUser> readApplicationUserList();

    /**
     * read user by userID
     *
     * @param username
     * @return {@link ApplicationUser}
     */
    ApplicationUser readApplicationUser(String username);
}
