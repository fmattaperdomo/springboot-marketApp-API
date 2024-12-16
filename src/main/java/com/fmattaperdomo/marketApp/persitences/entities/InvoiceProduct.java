package com.fmattaperdomo.marketApp.persitences.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "invoices_products")
public class InvoiceProduct {
    @EmbeddedId
    private InvoiceProductPK id;

    private Integer quantity;
    private Double total;
    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "id_invoice", insertable = false, updatable = false)
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;


    public InvoiceProductPK getId() {
        return id;
    }

    public void setId(InvoiceProductPK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
