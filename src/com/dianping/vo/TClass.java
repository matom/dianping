package com.dianping.vo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: matom
 * Date: 13-2-1
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "t_class", schema = "", catalog = "dianping")
@Entity
public class TClass {
    private String id;

    @javax.persistence.Column(name = "ID")
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;

    @javax.persistence.Column(name = "NAME")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int seq;

    @javax.persistence.Column(name = "SEQ")
    @Basic
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    private String upLevel;

    @javax.persistence.Column(name = "UP_LEVEL")
    @Basic
    public String getUpLevel() {
        return upLevel;
    }

    public void setUpLevel(String upLevel) {
        this.upLevel = upLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TClass tClass = (TClass) o;

        if (seq != tClass.seq) return false;
        if (id != null ? !id.equals(tClass.id) : tClass.id != null) return false;
        if (name != null ? !name.equals(tClass.name) : tClass.name != null) return false;
        if (upLevel != null ? !upLevel.equals(tClass.upLevel) : tClass.upLevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + seq;
        result = 31 * result + (upLevel != null ? upLevel.hashCode() : 0);
        return result;
    }
}
