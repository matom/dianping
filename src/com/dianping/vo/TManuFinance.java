package com.dianping.vo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: matom
 * Date: 13-2-1
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "t_manu_finance", schema = "", catalog = "dianping")
@Entity
public class TManuFinance {
    private String id;

    @javax.persistence.Column(name = "ID")
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String manuId;

    @javax.persistence.Column(name = "MANU_ID")
    @Basic
    public String getManuId() {
        return manuId;
    }

    public void setManuId(String manuId) {
        this.manuId = manuId;
    }

    private String code;

    @javax.persistence.Column(name = "CODE")
    @Basic
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private BigDecimal sellSum;

    @javax.persistence.Column(name = "SELL_SUM")
    @Basic
    public BigDecimal getSellSum() {
        return sellSum;
    }

    public void setSellSum(BigDecimal sellSum) {
        this.sellSum = sellSum;
    }

    private BigDecimal collect;

    @javax.persistence.Column(name = "COLLECT")
    @Basic
    public BigDecimal getCollect() {
        return collect;
    }

    public void setCollect(BigDecimal collect) {
        this.collect = collect;
    }

    private BigDecimal debt;

    @javax.persistence.Column(name = "DEBT")
    @Basic
    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    private String type;

    @javax.persistence.Column(name = "TYPE")
    @Basic
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

        TManuFinance that = (TManuFinance) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (collect != null ? !collect.equals(that.collect) : that.collect != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (debt != null ? !debt.equals(that.debt) : that.debt != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (manuId != null ? !manuId.equals(that.manuId) : that.manuId != null) return false;
        if (sellSum != null ? !sellSum.equals(that.sellSum) : that.sellSum != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (manuId != null ? manuId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (sellSum != null ? sellSum.hashCode() : 0);
        result = 31 * result + (collect != null ? collect.hashCode() : 0);
        result = 31 * result + (debt != null ? debt.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        return result;
    }
}
