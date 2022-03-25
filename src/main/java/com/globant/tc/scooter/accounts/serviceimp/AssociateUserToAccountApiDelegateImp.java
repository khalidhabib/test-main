package com.globant.tc.scooter.accounts.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.globant.tc.scooter.accounts.api.AssociateUserToAccountApi;
import com.globant.tc.scooter.accounts.api.util.ApiUtil;
import com.globant.tc.scooter.accounts.entity.AccountsUsersEntity;
import com.globant.tc.scooter.accounts.model.AssociateUserToAccount;
import com.globant.tc.scooter.accounts.model.Error;
import com.globant.tc.scooter.accounts.repositories.AccountUsersRepository;
import com.globant.tc.scooter.accounts.services.AssociateUserToAccountApiDelegate;

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
	public ResponseEntity<?> associateUserToAccountPost(
			AssociateUserToAccount associateUserToAccount) {
		try {
			AccountsUsersEntity associateAccount = new AccountsUsersEntity(new Long(associateUserToAccount.getUserId()),
					new Long(associateUserToAccount.getAccountId()));
			return new ResponseEntity<AccountsUsersEntity>(accountUsersRepository.save(associateAccount),
					HttpStatus.OK);
		} catch (Exception e) {
			Error errpr = new Error();
			errpr.code(503);
			errpr.setCode(503);
			errpr.setMessage("Service Unavailable");
			return new ResponseEntity<>(errpr, HttpStatus.SERVICE_UNAVAILABLE);
		}
	}

}
