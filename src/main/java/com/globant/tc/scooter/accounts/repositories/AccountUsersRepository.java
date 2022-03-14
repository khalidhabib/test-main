package com.globant.tc.scooter.accounts.repositories;

import com.globant.tc.scooter.accounts.entity.AccountsUsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountUsersRepository extends CrudRepository<AccountsUsersEntity,Long> {
}
