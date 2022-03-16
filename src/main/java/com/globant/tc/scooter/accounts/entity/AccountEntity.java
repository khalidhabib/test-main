package com.globant.tc.scooter.accounts.entity;

import javax.persistence.*;

/**
 * Account
 */
@Entity(name = "account")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private Double balance = null;
    private Boolean active;
    private String mercadoPagoAccount;

    /**
     *
     * @param id
     * @param balance
     * @param active
     * @param mercadoPagoAccount
     */
    public AccountEntity(Long id, Double balance, Boolean active, String mercadoPagoAccount) {
        this.id = id;
        this.balance = balance;
        this.active = active;
        this.mercadoPagoAccount = mercadoPagoAccount;
    }


    public AccountEntity() {}



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    public String getMercadoPagoAccount() {
        return mercadoPagoAccount;
    }

    public void setMercadoPagoAccount(String mercadoPagoAccount) {
        this.mercadoPagoAccount = mercadoPagoAccount;
    }
}

