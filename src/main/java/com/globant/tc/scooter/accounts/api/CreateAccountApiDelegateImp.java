package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.model.InlineObject;
import com.globant.tc.scooter.accounts.repositories.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateAccountApiDelegateImp implements CreateAccountApiDelegate {

    @Autowired
    private AccountsRepository accountsRepository;

    @Override
    public ResponseEntity<AccountEntity> createAccountPost(InlineObject inlineObject) {
        AccountEntity account = new AccountEntity(
                null,
                inlineObject.getAccount().getBalance(),
                inlineObject.getAccount().getActive(),
                null
        );
        return new ResponseEntity<>(
                accountsRepository.save(account), HttpStatus.OK
        );

    }
}
