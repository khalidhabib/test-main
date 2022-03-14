package com.globant.tc.scooter.accounts.entity;

import javax.persistence.*;

@Entity
public class MercadoPagoAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long accountId;
    private Long mercadoPagoId;

    public MercadoPagoAccount( Long accountId, Long mercadoPagoId) {
        this.accountId = accountId;
        this.mercadoPagoId = mercadoPagoId;
    }

    public MercadoPagoAccount() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getMercadoPagoId() {
        return mercadoPagoId;
    }

    public void setMercadoPagoId(Long mercadoPagoId) {
        this.mercadoPagoId = mercadoPagoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
