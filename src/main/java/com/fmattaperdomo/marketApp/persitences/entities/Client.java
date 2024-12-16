package com.fmattaperdomo.marketApp.persitences.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Columns;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    private String id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private Long cellphone;
    private String address;
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Invoice> invoices;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getCellphone() {
        return cellphone;
    }

    public void setCellphone(Long cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
