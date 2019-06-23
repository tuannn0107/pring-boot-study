package com.tnn.study.spring.boot.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.List;

public class ApplicationUser extends User {
    private String fullname;
    private String securityToken;
    private String iframeSecurityToken;
    private List<String> role;

    public ApplicationUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public String getIframeSecurityToken() {
        return iframeSecurityToken;
    }

    public void setIframeSecurityToken(String iframeSecurityToken) {
        this.iframeSecurityToken = iframeSecurityToken;
    }

}
