package com.globant.tc.scooter.accounts.repositories;

import com.globant.tc.scooter.accounts.entity.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<AccountEntity,Long> {
}
