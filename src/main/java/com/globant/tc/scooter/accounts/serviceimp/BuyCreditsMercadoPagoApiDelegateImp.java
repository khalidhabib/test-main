package com.globant.tc.scooter.accounts.serviceimp;

import com.globant.tc.scooter.accounts.api.BuyCreditsMercadoPagoApi;
import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.entity.MercadoPagoEntity;
import com.globant.tc.scooter.accounts.model.CreditsMercado;
import com.globant.tc.scooter.accounts.repositories.AccountsRepository;
import com.globant.tc.scooter.accounts.repositories.MercadoPagoRepository;
import com.globant.tc.scooter.accounts.services.BuyCreditsMercadoPagoApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


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
    public ResponseEntity<Void> buyCreditsMercadoPagoPost(CreditsMercado creditsMercado) {
        Optional<AccountEntity> account = accountsRepository.findById(new Long(creditsMercado.getAccountId()));
        if (!account.isPresent()) {
            return new ResponseEntity("Account not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity("Operation success", HttpStatus.OK);

    }

}
