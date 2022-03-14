package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.model.InlineObject1;
import com.globant.tc.scooter.accounts.repositories.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddCreditsToAccountApiDelegateImp implements AddCreditsToAccountApiDelegate {

    @Autowired
    AccountsRepository accountsRepository;


    @Override
    public ResponseEntity<AccountEntity> addCreditsToAccountPost(InlineObject1 inlineObject1) {

        AccountEntity account = new AccountEntity(
                new Long(inlineObject1.getAccountId()),
                inlineObject1.getCredits(),
                true,
                null
        );

        return new ResponseEntity<>(
                accountsRepository.save(account), HttpStatus.OK
        );

    }
}
