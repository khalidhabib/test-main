package com.globant.tc.scooter.accounts.entity;

import javax.persistence.*;

@Entity
public class MercadoPagoEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String mercadoPago;

    public MercadoPagoEntity(Long id, String mercadoPago) {
        this.id = id;
        this.mercadoPago = mercadoPago;
    }

    public MercadoPagoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMercadoPago() {
        return mercadoPago;
    }

    public void setMercadoPago(String mercadoPago) {
        this.mercadoPago = mercadoPago;
    }
}
