package com.globant.tc.scooter.accounts.serviceimp;

import com.globant.tc.scooter.accounts.api.FindUserAccountApi;
import com.globant.tc.scooter.accounts.constant.Constant;
import com.globant.tc.scooter.accounts.entity.AccountsUsersEntity;
import com.globant.tc.scooter.accounts.entity.UserEntity;
import com.globant.tc.scooter.accounts.repositories.AccountUsersRepository;
import com.globant.tc.scooter.accounts.repositories.UserRepository;
import com.globant.tc.scooter.accounts.services.FindUserAccountApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindUserAccountApiDelegateImp implements FindUserAccountApiDelegate {

    @Autowired
    private AccountUsersRepository accountUsersRepository;


    /**
     * GET /findUserAccount/{userId} : Find an account for a redistered user
     *
     * @param userId id of the user (required)
     * @return OK (status code 200)
     * or A user with the specified ID was not found. (status code 404)
     * @see FindUserAccountApi#findUserAccountUserIdGet
     */
    public ResponseEntity<Long> findUserAccountUserIdGet(Long userId) {
        //Need to add repository
        Optional<AccountsUsersEntity> user = accountUsersRepository.findByIdUser(userId);
        if (!user.isPresent()) {
            return new ResponseEntity(Constant.RecordNotFoundMessage, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user.get().getIdAccount(), HttpStatus.OK);

    }
}
