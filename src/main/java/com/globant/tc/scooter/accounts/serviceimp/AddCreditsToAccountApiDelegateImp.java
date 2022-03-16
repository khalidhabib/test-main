package com.globant.tc.scooter.accounts.serviceimp;

import com.globant.tc.scooter.accounts.constant.Constant;
import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.model.CreditsToAccount;
import com.globant.tc.scooter.accounts.repositories.AccountsRepository;
import com.globant.tc.scooter.accounts.services.AddCreditsToAccountApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddCreditsToAccountApiDelegateImp implements AddCreditsToAccountApiDelegate {

    @Autowired
    AccountsRepository accountsRepository;


    @Override
    public ResponseEntity<AccountEntity> addCreditsToAccountPost(CreditsToAccount inlineObject1) {

        AccountEntity account = new AccountEntity(
                new Long(inlineObject1.getAccountId()),
                inlineObject1.getCredits(),
                true,
                null
        );

        accountsRepository.save(account);
        return new ResponseEntity(Constant.SuccessMessage, HttpStatus.OK);
    }
}
