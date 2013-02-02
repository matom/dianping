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
@javax.persistence.Table(name = "t_stock", schema = "", catalog = "dianping")
@Entity
public class TStock {
    private String id;

    @javax.persistence.Column(name = "ID")
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String productId;

    @javax.persistence.Column(name = "PRODUCT_ID")
    @Basic
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    private String batch;

    @javax.persistence.Column(name = "BATCH")
    @Basic
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    private BigDecimal importPrice;

    @javax.persistence.Column(name = "IMPORT_PRICE")
    @Basic
    public BigDecimal getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(BigDecimal importPrice) {
        this.importPrice = importPrice;
    }

    private BigDecimal wholesalePrice;

    @javax.persistence.Column(name = "WHOLESALE_PRICE")
    @Basic
    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    private BigDecimal salePrice;

    @javax.persistence.Column(name = "SALE_PRICE")
    @Basic
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    private int stock;

    @javax.persistence.Column(name = "STOCK")
    @Basic
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    private Timestamp lastedUpdate;

    @javax.persistence.Column(name = "LASTED_UPDATE")
    @Basic
    public Timestamp getLastedUpdate() {
        return lastedUpdate;
    }

    public void setLastedUpdate(Timestamp lastedUpdate) {
        this.lastedUpdate = lastedUpdate;
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

        TStock tStock = (TStock) o;

        if (stock != tStock.stock) return false;
        if (batch != null ? !batch.equals(tStock.batch) : tStock.batch != null) return false;
        if (created != null ? !created.equals(tStock.created) : tStock.created != null) return false;
        if (createdBy != null ? !createdBy.equals(tStock.createdBy) : tStock.createdBy != null) return false;
        if (id != null ? !id.equals(tStock.id) : tStock.id != null) return false;
        if (importPrice != null ? !importPrice.equals(tStock.importPrice) : tStock.importPrice != null) return false;
        if (lastedUpdate != null ? !lastedUpdate.equals(tStock.lastedUpdate) : tStock.lastedUpdate != null)
            return false;
        if (productId != null ? !productId.equals(tStock.productId) : tStock.productId != null) return false;
        if (salePrice != null ? !salePrice.equals(tStock.salePrice) : tStock.salePrice != null) return false;
        if (wholesalePrice != null ? !wholesalePrice.equals(tStock.wholesalePrice) : tStock.wholesalePrice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (batch != null ? batch.hashCode() : 0);
        result = 31 * result + (importPrice != null ? importPrice.hashCode() : 0);
        result = 31 * result + (wholesalePrice != null ? wholesalePrice.hashCode() : 0);
        result = 31 * result + (salePrice != null ? salePrice.hashCode() : 0);
        result = 31 * result + stock;
        result = 31 * result + (lastedUpdate != null ? lastedUpdate.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        return result;
    }
}
