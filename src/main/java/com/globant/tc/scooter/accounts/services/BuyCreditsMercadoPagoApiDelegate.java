package com.globant.tc.scooter.accounts.services;

import com.globant.tc.scooter.accounts.api.BuyCreditsMercadoPagoApi;
import com.globant.tc.scooter.accounts.controllers.BuyCreditsMercadoPagoApiController;
import com.globant.tc.scooter.accounts.model.CreditsMercado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link BuyCreditsMercadoPagoApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-11T21:44:36.143+05:00[Asia/Karachi]")
public interface BuyCreditsMercadoPagoApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /buyCreditsMercadoPago : Buy credits in Mercado Pago
     *
     * @param creditsMercado  (required)
     * @return Operation success (status code 200)
     * @see BuyCreditsMercadoPagoApi#buyCreditsMercadoPagoPost
     */
    default ResponseEntity<Void> buyCreditsMercadoPagoPost(CreditsMercado creditsMercado) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
