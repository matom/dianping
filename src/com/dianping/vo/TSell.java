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
@javax.persistence.Table(name = "t_sell", schema = "", catalog = "dianping")
@Entity
public class TSell {
    private String id;

    @javax.persistence.Column(name = "ID")
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String stockId;

    @javax.persistence.Column(name = "STOCK_ID")
    @Basic
    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    private String custFinanceId;

    @javax.persistence.Column(name = "CUST_FINANCE_ID")
    @Basic
    public String getCustFinanceId() {
        return custFinanceId;
    }

    public void setCustFinanceId(String custFinanceId) {
        this.custFinanceId = custFinanceId;
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

    private int sellCount;

    @javax.persistence.Column(name = "SELL_COUNT")
    @Basic
    public int getSellCount() {
        return sellCount;
    }

    public void setSellCount(int sellCount) {
        this.sellCount = sellCount;
    }

    private BigDecimal price;

    @javax.persistence.Column(name = "PRICE")
    @Basic
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private Timestamp sellDate;

    @javax.persistence.Column(name = "SELL_DATE")
    @Basic
    public Timestamp getSellDate() {
        return sellDate;
    }

    public void setSellDate(Timestamp sellDate) {
        this.sellDate = sellDate;
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

        TSell tSell = (TSell) o;

        if (sellCount != tSell.sellCount) return false;
        if (created != null ? !created.equals(tSell.created) : tSell.created != null) return false;
        if (createdBy != null ? !createdBy.equals(tSell.createdBy) : tSell.createdBy != null) return false;
        if (custFinanceId != null ? !custFinanceId.equals(tSell.custFinanceId) : tSell.custFinanceId != null)
            return false;
        if (id != null ? !id.equals(tSell.id) : tSell.id != null) return false;
        if (price != null ? !price.equals(tSell.price) : tSell.price != null) return false;
        if (sellDate != null ? !sellDate.equals(tSell.sellDate) : tSell.sellDate != null) return false;
        if (stockId != null ? !stockId.equals(tSell.stockId) : tSell.stockId != null) return false;
        if (type != null ? !type.equals(tSell.type) : tSell.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (stockId != null ? stockId.hashCode() : 0);
        result = 31 * result + (custFinanceId != null ? custFinanceId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + sellCount;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (sellDate != null ? sellDate.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        return result;
    }
}
