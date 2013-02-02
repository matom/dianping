package com.dianping.vo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: matom
 * Date: 13-2-1
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "t_customer", schema = "", catalog = "dianping")
@Entity
public class TCustomer {
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

    private String level;

    @javax.persistence.Column(name = "LEVEL")
    @Basic
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    private Date birthday;

    @javax.persistence.Column(name = "BIRTHDAY")
    @Basic
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private String cardId;

    @javax.persistence.Column(name = "CARD_ID")
    @Basic
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    private String phone;

    @javax.persistence.Column(name = "PHONE")
    @Basic
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String qq;

    @javax.persistence.Column(name = "QQ")
    @Basic
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    private String email;

    @javax.persistence.Column(name = "EMAIL")
    @Basic
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String postalCode;

    @javax.persistence.Column(name = "POSTAL_CODE")
    @Basic
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private String address;

    @javax.persistence.Column(name = "ADDRESS")
    @Basic
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String note;

    @javax.persistence.Column(name = "NOTE")
    @Basic
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    private String createdBy;

    @javax.persistence.Column(name = "CREATED_BY")
    @Basic
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCustomer tCustomer = (TCustomer) o;

        if (address != null ? !address.equals(tCustomer.address) : tCustomer.address != null) return false;
        if (birthday != null ? !birthday.equals(tCustomer.birthday) : tCustomer.birthday != null) return false;
        if (cardId != null ? !cardId.equals(tCustomer.cardId) : tCustomer.cardId != null) return false;
        if (created != null ? !created.equals(tCustomer.created) : tCustomer.created != null) return false;
        if (createdBy != null ? !createdBy.equals(tCustomer.createdBy) : tCustomer.createdBy != null) return false;
        if (email != null ? !email.equals(tCustomer.email) : tCustomer.email != null) return false;
        if (id != null ? !id.equals(tCustomer.id) : tCustomer.id != null) return false;
        if (level != null ? !level.equals(tCustomer.level) : tCustomer.level != null) return false;
        if (name != null ? !name.equals(tCustomer.name) : tCustomer.name != null) return false;
        if (note != null ? !note.equals(tCustomer.note) : tCustomer.note != null) return false;
        if (phone != null ? !phone.equals(tCustomer.phone) : tCustomer.phone != null) return false;
        if (postalCode != null ? !postalCode.equals(tCustomer.postalCode) : tCustomer.postalCode != null) return false;
        if (qq != null ? !qq.equals(tCustomer.qq) : tCustomer.qq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (cardId != null ? cardId.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        return result;
    }
}
