package com.globant.tc.scooter.accounts.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import com.globant.tc.scooter.accounts.api.FindUserByIdApi;
import com.globant.tc.scooter.accounts.controllers.FindUserByIdApiController;
import com.globant.tc.scooter.accounts.entity.UserEntity;

/**
 * A delegate to be called by the {@link FindUserByIdApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T19:26:49.191+05:00[Asia/Karachi]")
public interface FindUserByIdApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /findUserById/{userId} : Find a user registered in the system by the id
     *
     * @param userId id of the user (required)
     * @return OK (status code 200)
     * @see FindUserByIdApi#findUserByIdUserIdGet
     */
    default ResponseEntity<?> findUserByIdUserIdGet(Long userId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
