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
@javax.persistence.Table(name = "t_wholesale", schema = "", catalog = "dianping")
@Entity
public class TWholesale {
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

    private String wholesaleFinanceId;

    @javax.persistence.Column(name = "WHOLESALE_FINANCE_ID")
    @Basic
    public String getWholesaleFinanceId() {
        return wholesaleFinanceId;
    }

    public void setWholesaleFinanceId(String wholesaleFinanceId) {
        this.wholesaleFinanceId = wholesaleFinanceId;
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

        TWholesale that = (TWholesale) o;

        if (sellCount != that.sellCount) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (sellDate != null ? !sellDate.equals(that.sellDate) : that.sellDate != null) return false;
        if (stockId != null ? !stockId.equals(that.stockId) : that.stockId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (wholesaleFinanceId != null ? !wholesaleFinanceId.equals(that.wholesaleFinanceId) : that.wholesaleFinanceId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (stockId != null ? stockId.hashCode() : 0);
        result = 31 * result + (wholesaleFinanceId != null ? wholesaleFinanceId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + sellCount;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (sellDate != null ? sellDate.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        return result;
    }
}
