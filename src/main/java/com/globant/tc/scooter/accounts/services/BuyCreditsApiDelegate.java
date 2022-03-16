package com.globant.tc.scooter.accounts.services;

import com.globant.tc.scooter.accounts.api.BuyCreditsApi;
import com.globant.tc.scooter.accounts.controllers.BuyCreditsApiController;
import com.globant.tc.scooter.accounts.model.Credit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link BuyCreditsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T19:29:52.717+05:00[Asia/Karachi]")
public interface BuyCreditsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /buyCredits : Buy credits in Mercado Pago
     *
     * @param credit  (required)
     * @return Operation success (status code 200)
     *         or Account not found (status code 404)
     * @see BuyCreditsApi#buyCreditsPost
     */
    default ResponseEntity<Void> buyCreditsPost(Credit credit) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
