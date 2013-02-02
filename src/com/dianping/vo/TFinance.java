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
@javax.persistence.Table(name = "t_finance", schema = "", catalog = "dianping")
@Entity
public class TFinance {
    private String id;

    @javax.persistence.Column(name = "ID")
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    private String item;

    @javax.persistence.Column(name = "ITEM")
    @Basic
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    private BigDecimal moneyIn;

    @javax.persistence.Column(name = "MONEY_IN")
    @Basic
    public BigDecimal getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(BigDecimal moneyIn) {
        this.moneyIn = moneyIn;
    }

    private BigDecimal moneyOut;

    @javax.persistence.Column(name = "MONEY_OUT")
    @Basic
    public BigDecimal getMoneyOut() {
        return moneyOut;
    }

    public void setMoneyOut(BigDecimal moneyOut) {
        this.moneyOut = moneyOut;
    }

    private String payment;

    @javax.persistence.Column(name = "PAYMENT")
    @Basic
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    private String income;

    @javax.persistence.Column(name = "INCOME")
    @Basic
    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    private boolean isDelete;

    @javax.persistence.Column(name = "IS_DELETE")
    @Basic
    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    private Timestamp operationDate;

    @javax.persistence.Column(name = "OPERATION_DATE")
    @Basic
    public Timestamp getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Timestamp operationDate) {
        this.operationDate = operationDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TFinance tFinance = (TFinance) o;

        if (isDelete != tFinance.isDelete) return false;
        if (id != null ? !id.equals(tFinance.id) : tFinance.id != null) return false;
        if (income != null ? !income.equals(tFinance.income) : tFinance.income != null) return false;
        if (item != null ? !item.equals(tFinance.item) : tFinance.item != null) return false;
        if (moneyIn != null ? !moneyIn.equals(tFinance.moneyIn) : tFinance.moneyIn != null) return false;
        if (moneyOut != null ? !moneyOut.equals(tFinance.moneyOut) : tFinance.moneyOut != null) return false;
        if (note != null ? !note.equals(tFinance.note) : tFinance.note != null) return false;
        if (operationDate != null ? !operationDate.equals(tFinance.operationDate) : tFinance.operationDate != null)
            return false;
        if (payment != null ? !payment.equals(tFinance.payment) : tFinance.payment != null) return false;
        if (type != null ? !type.equals(tFinance.type) : tFinance.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (moneyIn != null ? moneyIn.hashCode() : 0);
        result = 31 * result + (moneyOut != null ? moneyOut.hashCode() : 0);
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (income != null ? income.hashCode() : 0);
        result = 31 * result + (isDelete ? 1 : 0);
        result = 31 * result + (operationDate != null ? operationDate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
