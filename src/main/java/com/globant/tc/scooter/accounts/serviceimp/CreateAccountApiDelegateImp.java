package com.globant.tc.scooter.accounts.serviceimp;

import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.model.createAccountObject;
import com.globant.tc.scooter.accounts.repositories.AccountsRepository;
import com.globant.tc.scooter.accounts.services.CreateAccountApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateAccountApiDelegateImp implements CreateAccountApiDelegate {

    @Autowired
    private AccountsRepository accountsRepository;

    @Override
    public ResponseEntity<AccountEntity> createAccountPost(createAccountObject createAccountObject) {
        AccountEntity account = new AccountEntity(
                null,
                createAccountObject.getAccount().getBalance(),
                createAccountObject.getAccount().getActive(),
                null
        );
        return new ResponseEntity<>(
                accountsRepository.save(account), HttpStatus.OK
        );

    }
}
