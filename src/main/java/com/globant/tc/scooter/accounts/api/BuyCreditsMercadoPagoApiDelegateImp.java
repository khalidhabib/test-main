package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.InlineObject4;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;


@Service
public class BuyCreditsMercadoPagoApiDelegateImp implements BuyCreditsMercadoPagoApiDelegate {

    /**
     * buyCreditsMercadoPago : Buy credits in Mercado Pago
     *
     * @param inlineObject4 (required)
     * @return Operation success (status code 200)
     * @see BuyCreditsMercadoPagoApi#buyCreditsMercadoPagoPost
     */
    @Override
    public ResponseEntity<Void> buyCreditsMercadoPagoPost(InlineObject4 inlineObject4) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
