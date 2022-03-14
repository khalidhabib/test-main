package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.entity.MercadoPagoAccount;
import com.globant.tc.scooter.accounts.model.InlineObject3;
import com.globant.tc.scooter.accounts.repositories.MercadoPagoAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LinkAccountToMercadoPagoApiDelegateImp implements LinkAccountToMercadoPagoApiDelegate {

    @Autowired
    private MercadoPagoAccountRepository mercadoPagoRepository;

    /**
     * linkAccountToMercadoPago : Link account to mercado pago
     *
     * @param inlineObject3 (required)
     * @return Operation success (status code 200)
     * @see LinkAccountToMercadoPagoApi#linkAccountToMercadoPagoPost
     */
    @Override
    public ResponseEntity<MercadoPagoAccount> linkAccountToMercadoPagoPost(InlineObject3 inlineObject3) {
        MercadoPagoAccount mercadoPagoAccount = new MercadoPagoAccount(
                new Long(inlineObject3.getAccountId()),
                new Long(inlineObject3.getMercadoPagoId())
        );

        return new ResponseEntity<>(
                mercadoPagoRepository.save(mercadoPagoAccount), HttpStatus.OK);

    }

}
