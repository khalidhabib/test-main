package com.globant.tc.scooter.accounts.services;

import com.globant.tc.scooter.accounts.api.LinkAccountToMercadoPagoApi;
import com.globant.tc.scooter.accounts.controllers.LinkAccountToMercadoPagoApiController;
import com.globant.tc.scooter.accounts.entity.MercadoPagoAccountEntity;
import com.globant.tc.scooter.accounts.model.linkAccountToMercadoPago;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link LinkAccountToMercadoPagoApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-11T21:44:36.143+05:00[Asia/Karachi]")
public interface LinkAccountToMercadoPagoApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /linkAccountToMercadoPago : Link account to mercado pago
     *
     * @param linkAccountToMercadoPago  (required)
     * @return Operation success (status code 200)
     * @see LinkAccountToMercadoPagoApi#linkAccountToMercadoPagoPost
     */
    default ResponseEntity<?> linkAccountToMercadoPagoPost(linkAccountToMercadoPago linkAccountToMercadoPago) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
