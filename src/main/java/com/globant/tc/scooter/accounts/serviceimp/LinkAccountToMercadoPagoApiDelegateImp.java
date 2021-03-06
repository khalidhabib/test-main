package com.globant.tc.scooter.accounts.serviceimp;

import com.globant.tc.scooter.accounts.api.LinkAccountToMercadoPagoApi;
import com.globant.tc.scooter.accounts.constant.Constant;
import com.globant.tc.scooter.accounts.entity.MercadoPagoAccountEntity;
import com.globant.tc.scooter.accounts.model.Error;
import com.globant.tc.scooter.accounts.model.linkAccountToMercadoPago;
import com.globant.tc.scooter.accounts.repositories.MercadoPagoAccountRepository;
import com.globant.tc.scooter.accounts.services.LinkAccountToMercadoPagoApiDelegate;
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
	 * @param linkAccountToMercadoPago (required)
	 * @return Operation success (status code 200)
	 * @see LinkAccountToMercadoPagoApi#linkAccountToMercadoPagoPost
	 */
	@Override
	public ResponseEntity<?> linkAccountToMercadoPagoPost(linkAccountToMercadoPago linkAccountToMercadoPago) {
		try {
			MercadoPagoAccountEntity mercadoPagoAccountEntity = new MercadoPagoAccountEntity(
					new Long(linkAccountToMercadoPago.getAccountId()),
					new Long(linkAccountToMercadoPago.getMercadoPagoId()));

			return new ResponseEntity<>(mercadoPagoRepository.save(mercadoPagoAccountEntity), HttpStatus.OK);
		} catch (Exception e) {
			Error errpr = new Error();
			errpr.setCode(503);
			errpr.setMessage("Service Unavailable");
			return new ResponseEntity<>(errpr, HttpStatus.SERVICE_UNAVAILABLE);
		}
	}

}
