package com.globant.tc.scooter.accounts.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class AccountsUsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull
    private Long idUser;
    @NotNull
    private Long idAccount;


    /**
     *
     * @param id
     * @param idUser
     * @param idAccount
     */
    public AccountsUsersEntity( Long idUser, Long idAccount) {
        this.idUser = idUser;
        this.idAccount = idAccount;
    }

    public AccountsUsersEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }
}
