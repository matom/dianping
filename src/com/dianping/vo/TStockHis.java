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
@javax.persistence.Table(name = "t_stock_his", schema = "", catalog = "dianping")
@Entity
public class TStockHis {
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

    private int modifyCount;

    @javax.persistence.Column(name = "MODIFY_COUNT")
    @Basic
    public int getModifyCount() {
        return modifyCount;
    }

    public void setModifyCount(int modifyCount) {
        this.modifyCount = modifyCount;
    }

    private String modifyId;

    @javax.persistence.Column(name = "MODIFY_ID")
    @Basic
    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId;
    }

    private String modifyReason;

    @javax.persistence.Column(name = "MODIFY_REASON")
    @Basic
    public String getModifyReason() {
        return modifyReason;
    }

    public void setModifyReason(String modifyReason) {
        this.modifyReason = modifyReason;
    }

    private Timestamp modifyDate;

    @javax.persistence.Column(name = "MODIFY_DATE")
    @Basic
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    private String modifyBy;

    @javax.persistence.Column(name = "MODIFY_BY")
    @Basic
    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TStockHis tStockHis = (TStockHis) o;

        if (modifyCount != tStockHis.modifyCount) return false;
        if (stock != tStockHis.stock) return false;
        if (batch != null ? !batch.equals(tStockHis.batch) : tStockHis.batch != null) return false;
        if (id != null ? !id.equals(tStockHis.id) : tStockHis.id != null) return false;
        if (importPrice != null ? !importPrice.equals(tStockHis.importPrice) : tStockHis.importPrice != null)
            return false;
        if (modifyBy != null ? !modifyBy.equals(tStockHis.modifyBy) : tStockHis.modifyBy != null) return false;
        if (modifyDate != null ? !modifyDate.equals(tStockHis.modifyDate) : tStockHis.modifyDate != null) return false;
        if (modifyId != null ? !modifyId.equals(tStockHis.modifyId) : tStockHis.modifyId != null) return false;
        if (modifyReason != null ? !modifyReason.equals(tStockHis.modifyReason) : tStockHis.modifyReason != null)
            return false;
        if (productId != null ? !productId.equals(tStockHis.productId) : tStockHis.productId != null) return false;
        if (salePrice != null ? !salePrice.equals(tStockHis.salePrice) : tStockHis.salePrice != null) return false;
        if (stockId != null ? !stockId.equals(tStockHis.stockId) : tStockHis.stockId != null) return false;
        if (wholesalePrice != null ? !wholesalePrice.equals(tStockHis.wholesalePrice) : tStockHis.wholesalePrice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (stockId != null ? stockId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (batch != null ? batch.hashCode() : 0);
        result = 31 * result + (importPrice != null ? importPrice.hashCode() : 0);
        result = 31 * result + (wholesalePrice != null ? wholesalePrice.hashCode() : 0);
        result = 31 * result + (salePrice != null ? salePrice.hashCode() : 0);
        result = 31 * result + stock;
        result = 31 * result + modifyCount;
        result = 31 * result + (modifyId != null ? modifyId.hashCode() : 0);
        result = 31 * result + (modifyReason != null ? modifyReason.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (modifyBy != null ? modifyBy.hashCode() : 0);
        return result;
    }
}
