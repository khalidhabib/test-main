package com.globant.tc.scooter.accounts.serviceimp;

import com.globant.tc.scooter.accounts.api.BuyCreditsApi;
import com.globant.tc.scooter.accounts.constant.Constant;
import com.globant.tc.scooter.accounts.entity.MercadoPagoEntity;
import com.globant.tc.scooter.accounts.model.Credit;
import com.globant.tc.scooter.accounts.repositories.MercadoPagoRepository;
import com.globant.tc.scooter.accounts.services.BuyCreditsApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuyCreditsApiDelegateImp implements BuyCreditsApiDelegate {

    @Autowired
    private MercadoPagoRepository mercadoPagoRepository;

    /**
     * POST /buyCredits : Buy credits in Mercado Pago
     *
     * @param credit (required)
     * @return Operation success (status code 200)
     * or Account not found (status code 404)
     * @see BuyCreditsApi#buyCreditsPost
     */
    public ResponseEntity<Void> buyCreditsPost(Credit credit) {
        Optional<MercadoPagoEntity> mercadoPago = mercadoPagoRepository.findById(new Long(credit.getMercadoPagoAccountId()));
        if (!mercadoPago.isPresent()) {
            return new ResponseEntity(Constant.NotFoundMessage, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(Constant.SuccessMessage, HttpStatus.OK);
    }

}
