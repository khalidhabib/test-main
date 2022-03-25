package com.globant.tc.scooter.accounts.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.globant.tc.scooter.accounts.api.BuyCreditsMercadoPagoApi;
import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.model.CreditsMercado;
import com.globant.tc.scooter.accounts.model.Error;
import com.globant.tc.scooter.accounts.repositories.AccountsRepository;
import com.globant.tc.scooter.accounts.services.BuyCreditsMercadoPagoApiDelegate;


@Service
public class BuyCreditsMercadoPagoApiDelegateImp implements BuyCreditsMercadoPagoApiDelegate {
    @Autowired
    private AccountsRepository accountsRepository;

    /**
     * buyCreditsMercadoPago : Buy credits in Mercado Pago
     *
     * @param creditsMercado (required)
     * @return Operation success (status code 200)
     * @see BuyCreditsMercadoPagoApi#buyCreditsMercadoPagoPost
     */
    @Override
    public ResponseEntity<?> buyCreditsMercadoPagoPost(CreditsMercado creditsMercado) {
      try {
    	return accountsRepository.findById(new Long(creditsMercado.getAccountId())).map(user -> ResponseEntity.ok(user))
				.orElseGet(() -> ResponseEntity.notFound().build());
       
    } catch (Exception e) {
		Error errpr = new Error();
		errpr.setCode(503);
		errpr.setMessage("Service Unavailable");
		return new ResponseEntity<>(errpr, HttpStatus.SERVICE_UNAVAILABLE);
	}


    }

}
