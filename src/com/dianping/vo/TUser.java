package com.dianping.vo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: matom
 * Date: 13-2-1
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "t_user", schema = "", catalog = "dianping")
@Entity
public class TUser {
    private String id;

    @javax.persistence.Column(name = "ID")
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String loginName;

    @javax.persistence.Column(name = "LOGIN_NAME")
    @Basic
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    private String userName;

    @javax.persistence.Column(name = "USER_NAME")
    @Basic
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String password;

    @javax.persistence.Column(name = "PASSWORD")
    @Basic
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean isUse;

    @javax.persistence.Column(name = "IS_USE")
    @Basic
    public boolean isUse() {
        return isUse;
    }

    public void setUse(boolean use) {
        isUse = use;
    }

    private Timestamp created;

    @javax.persistence.Column(name = "CREATED")
    @Basic
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUser tUser = (TUser) o;

        if (isUse != tUser.isUse) return false;
        if (created != null ? !created.equals(tUser.created) : tUser.created != null) return false;
        if (id != null ? !id.equals(tUser.id) : tUser.id != null) return false;
        if (loginName != null ? !loginName.equals(tUser.loginName) : tUser.loginName != null) return false;
        if (password != null ? !password.equals(tUser.password) : tUser.password != null) return false;
        if (userName != null ? !userName.equals(tUser.userName) : tUser.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (isUse ? 1 : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        return result;
    }
}
