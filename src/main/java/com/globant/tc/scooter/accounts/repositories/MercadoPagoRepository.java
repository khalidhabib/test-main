package com.globant.tc.scooter.accounts.repositories;

import com.globant.tc.scooter.accounts.entity.MercadoPagoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercadoPagoRepository extends CrudRepository<MercadoPagoEntity,Long> {
}
