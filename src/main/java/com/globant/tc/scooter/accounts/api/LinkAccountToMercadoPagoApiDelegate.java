package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.entity.MercadoPagoAccount;
import com.globant.tc.scooter.accounts.model.InlineObject3;
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
     * @param inlineObject3  (required)
     * @return Operation success (status code 200)
     * @see LinkAccountToMercadoPagoApi#linkAccountToMercadoPagoPost
     */
    default ResponseEntity<MercadoPagoAccount> linkAccountToMercadoPagoPost(InlineObject3 inlineObject3) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
