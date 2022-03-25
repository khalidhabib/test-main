package com.globant.tc.scooter.accounts.entity;

import javax.persistence.*;

/**
 * User
 */
@Entity()
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String preferredPayment;

    public UserEntity(Long id, String name, String preferredPayment) {
        this.id = id;
        this.name = name;
        this.preferredPayment = preferredPayment;
    }

    public UserEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreferredPayment() {
        return preferredPayment;
    }

    public void setPreferredPayment(String preferredPayment) {
        this.preferredPayment = preferredPayment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public AccountEntity getBody() {
		// TODO Auto-generated method stub
		return null;
	}


}

