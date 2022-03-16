package com.globant.tc.scooter.accounts.services;

import com.globant.tc.scooter.accounts.api.RegisterUserApi;
import com.globant.tc.scooter.accounts.controllers.RegisterUserApiController;
import com.globant.tc.scooter.accounts.entity.UserEntity;
import com.globant.tc.scooter.accounts.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link RegisterUserApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T19:26:49.191+05:00[Asia/Karachi]")
public interface RegisterUserApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /registerUser : Register a User in the system
     *
     * @param user  (required)
     * @return OK (status code 200)
     * @see RegisterUserApi#registerUserPost
     */
    default ResponseEntity<UserEntity> registerUserPost(User user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
