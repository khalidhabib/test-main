package com.globant.tc.scooter.accounts.repositories;

import com.globant.tc.scooter.accounts.entity.AccountsUsersEntity;
import com.globant.tc.scooter.accounts.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountUsersRepository extends CrudRepository<AccountsUsersEntity, Long> {
    Optional<AccountsUsersEntity> findByIdUser(Long userId);
}
