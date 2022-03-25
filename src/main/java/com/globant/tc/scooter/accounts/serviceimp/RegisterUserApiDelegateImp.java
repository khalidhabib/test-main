package com.globant.tc.scooter.accounts.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.globant.tc.scooter.accounts.api.RegisterUserApi;
import com.globant.tc.scooter.accounts.entity.UserEntity;
import com.globant.tc.scooter.accounts.model.Error;
import com.globant.tc.scooter.accounts.model.User;
import com.globant.tc.scooter.accounts.repositories.UserRepository;
import com.globant.tc.scooter.accounts.services.RegisterUserApiDelegate;

@Service
public class RegisterUserApiDelegateImp implements RegisterUserApiDelegate {

	@Autowired
	private UserRepository userRepository;

	/**
	 * registerUser : Register a User in the system
	 *
	 * @param user (required)
	 * @return OK (status code 200)
	 * @see RegisterUserApi#registerUserPost
	 */
	@Override
	public ResponseEntity<?> registerUserPost(User user) {
		UserEntity userEntity = new UserEntity(null, user.getName(), user.getPreferredPayment());
		try {
			return new ResponseEntity<>(userRepository.save(userEntity), HttpStatus.OK);
		} catch (Exception e) {
			Error errpr = new Error();
			errpr.setCode(503);
			errpr.setMessage("Service Unavailable");
			return new ResponseEntity<>(errpr, HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}
