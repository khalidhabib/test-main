package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.CreditsMercado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class BuyCreditsMercadoPagoApiDelegateImp implements BuyCreditsMercadoPagoApiDelegate {

    /**
     * buyCreditsMercadoPago : Buy credits in Mercado Pago
     *
     * @param creditsMercado (required)
     * @return Operation success (status code 200)
     * @see BuyCreditsMercadoPagoApi#buyCreditsMercadoPagoPost
     */
    @Override
    public ResponseEntity<Void> buyCreditsMercadoPagoPost(CreditsMercado creditsMercado) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
