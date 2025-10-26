package com.afnan.sso.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID", columnDefinition = "BINARY(16)")
    private UUID userId;

    @Column(name = "USER_NAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "FAILED_LOGIN_ATTEMPTS")
    private Long failedLoginAttempts;

    @Column(name = "ACTIVE")
    private Long active;

    public User() {
    }

    public User(UUID userId, String username, String password, Long failedLoginAttempts, Long active) {
        super();
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.failedLoginAttempts = failedLoginAttempts;
        this.active = active;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Long getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public Long getActive() {
        return active;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFailedLoginAttempts(Long failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public void setActive(Long active) {
        this.active = active;
    }
}
