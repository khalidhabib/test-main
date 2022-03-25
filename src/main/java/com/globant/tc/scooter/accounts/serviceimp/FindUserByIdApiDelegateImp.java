package com.globant.tc.scooter.accounts.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.globant.tc.scooter.accounts.api.FindUserByIdApi;
import com.globant.tc.scooter.accounts.entity.UserEntity;
import com.globant.tc.scooter.accounts.model.Error;
import com.globant.tc.scooter.accounts.repositories.UserRepository;
import com.globant.tc.scooter.accounts.services.FindUserByIdApiDelegate;

@Service
public class FindUserByIdApiDelegateImp implements FindUserByIdApiDelegate {
	// private final String message = "A user with the specified ID was not found";

	@Autowired
	private UserRepository userRepository;

	/**
	 * findUserById/{userId} : Find a user registered in the system by the id
	 *
	 * @param userId id of the user (required)
	 * @return OK (status code 200)
	 * @see FindUserByIdApi#findUserByIdUserIdGet
	 */
	@Override
	public ResponseEntity<?> findUserByIdUserIdGet(Long userId) {
		try {
			return userRepository.findById(userId).map(user -> ResponseEntity.ok(user))
					.orElseGet(() -> ResponseEntity.notFound().build());
		} catch (Exception e) {
			Error errpr = new Error();
			errpr.setCode(503);
			errpr.setMessage("Service Unavailable");
			return new ResponseEntity<>(errpr, HttpStatus.SERVICE_UNAVAILABLE);
		}

	}
}
