package com.globant.tc.scooter.accounts.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.model.Error;
import com.globant.tc.scooter.accounts.model.createAccountObject;
import com.globant.tc.scooter.accounts.repositories.AccountsRepository;
import com.globant.tc.scooter.accounts.services.CreateAccountApiDelegate;

@Service
public class CreateAccountApiDelegateImp implements CreateAccountApiDelegate {

	@Autowired
	private AccountsRepository accountsRepository;

	@Override
	public ResponseEntity<?> createAccountPost(createAccountObject createAccountObject) {
		try {
			AccountEntity account = new AccountEntity(createAccountObject.getAccount().getBalance(),
					createAccountObject.getAccount().getActive(), null);
			return new ResponseEntity<AccountEntity>(accountsRepository.save(account), HttpStatus.OK);
		} catch (Exception e) {
			Error errpr = new Error();
			errpr.setCode(503);
			errpr.setMessage("Service Unavailable");
			return new ResponseEntity<>(errpr, HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}
