package com.fmattaperdomo.marketApp.persitences.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InvoiceProductPK implements Serializable {
    @Column(name = "id_invoice")
    private Integer idInvoice;

    @Column(name = "id_product")
    private Integer idProduct;

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }
}
