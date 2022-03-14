package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.entity.AccountsUsersEntity;
import com.globant.tc.scooter.accounts.model.InlineObject2;
import com.globant.tc.scooter.accounts.repositories.AccountUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AssociateUserToAccountApiDelegateImp implements AssociateUserToAccountApiDelegate {

    @Autowired
    private AccountUsersRepository accountUsersRepository;

    /**
     * associateUserToAccount : Associate User With An Account
     *
     * @param inlineObject2 (required)
     * @return Operation success (status code 200)
     * @see AssociateUserToAccountApi#associateUserToAccountPost
     */
    @Override
    public ResponseEntity<AccountsUsersEntity> associateUserToAccountPost(InlineObject2 inlineObject2) {
        AccountsUsersEntity associateAccount = new AccountsUsersEntity(
                new Long(inlineObject2.getUserId()),
                new Long(inlineObject2.getAccountId())
        );

        return new ResponseEntity<>(
                accountUsersRepository.save(associateAccount), HttpStatus.OK
        );

    }

}
