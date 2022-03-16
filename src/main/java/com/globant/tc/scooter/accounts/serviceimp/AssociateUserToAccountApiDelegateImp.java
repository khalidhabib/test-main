package com.globant.tc.scooter.accounts.serviceimp;

import com.globant.tc.scooter.accounts.api.AssociateUserToAccountApi;
import com.globant.tc.scooter.accounts.constant.Constant;
import com.globant.tc.scooter.accounts.entity.AccountsUsersEntity;
import com.globant.tc.scooter.accounts.model.AssociateUserToAccount;
import com.globant.tc.scooter.accounts.repositories.AccountUsersRepository;
import com.globant.tc.scooter.accounts.services.AssociateUserToAccountApiDelegate;
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
     * @param associateUserToAccount (required)
     * @return Operation success (status code 200)
     * @see AssociateUserToAccountApi#associateUserToAccountPost
     */
    @Override
    public ResponseEntity<AccountsUsersEntity> associateUserToAccountPost(AssociateUserToAccount associateUserToAccount) {
        AccountsUsersEntity associateAccount = new AccountsUsersEntity(
                new Long(associateUserToAccount.getUserId()),
                new Long(associateUserToAccount.getAccountId())
        );
        accountUsersRepository.save(associateAccount);
        return new ResponseEntity(Constant.SuccessMessage, HttpStatus.OK);
    }

}
