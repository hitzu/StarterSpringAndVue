/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.consultic.Starter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author roberto
 */
@Entity
@Table(name="user_role", uniqueConstraints = @UniqueConstraint(
        columnNames = {"role", "username"}))
public class UserRole {
    
    @Id
    @GeneratedValue
    @Column(name = "user_role_id", unique = true, nullable = false)
    private Integer userRoleId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "username", nullable = false)
    private User user;
    
    @Column(name = "role", nullable = false, length = 45)
    private String role;

    public UserRole() {
    }

    public UserRole(Integer userRoleId, User user, String role) {
        this.userRoleId = userRoleId;
        this.user = user;
        this.role = role;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRole{" + "userRoleId=" + userRoleId + ", user=" + user + ", role=" + role + '}';
    }
    
    
}
