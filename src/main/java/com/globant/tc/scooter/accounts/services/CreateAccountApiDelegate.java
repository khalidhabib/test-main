package com.globant.tc.scooter.accounts.services;

import com.globant.tc.scooter.accounts.api.CreateAccountApi;
import com.globant.tc.scooter.accounts.controllers.CreateAccountApiController;
import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.model.createAccountObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link CreateAccountApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-11T21:44:36.143+05:00[Asia/Karachi]")
public interface CreateAccountApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /createAccount : Create an Account and registered it to an user
     *
     * @param createAccountObject  (required)
     * @return Operation success (status code 200)
     *         or  (status code 503)
     * @see CreateAccountApi#createAccountPost
     */
    default ResponseEntity<?> createAccountPost(createAccountObject createAccountObject) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
