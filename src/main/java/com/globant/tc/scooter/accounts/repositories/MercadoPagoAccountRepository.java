package com.globant.tc.scooter.accounts.repositories;

import com.globant.tc.scooter.accounts.entity.MercadoPagoAccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercadoPagoAccountRepository extends CrudRepository<MercadoPagoAccountEntity,Long> {
}
