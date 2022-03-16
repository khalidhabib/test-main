package com.globant.tc.scooter.accounts.repositories;

import com.globant.tc.scooter.accounts.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
}
