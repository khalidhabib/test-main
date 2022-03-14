package com.globant.tc.scooter.accounts.repositories;

import com.globant.tc.scooter.accounts.entity.MercadoPago;
import com.globant.tc.scooter.accounts.entity.MercadoPagoAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercadoPagoRepository extends CrudRepository<MercadoPago,Long> {
}
