package com.globant.tc.scooter.accounts.serviceimp;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.model.CreditsToAccount;
import com.globant.tc.scooter.accounts.services.AddCreditsToAccountApiDelegate;

import io.swagger.annotations.ApiParam;

public class AddCreditsToAccountApiDelegateImp implements AddCreditsToAccountApiDelegate {

	@Override
	public ResponseEntity<AccountEntity> addCreditsToAccountPost(
			@ApiParam(value = "", required = true) @Valid @RequestBody CreditsToAccount inlineObject1) {
		if (inlineObject1 == null) {
			return new ResponseEntity<AccountEntity>(HttpStatus.SERVICE_UNAVAILABLE);
		}
		return new ResponseEntity<AccountEntity>(HttpStatus.OK);
	}

}
