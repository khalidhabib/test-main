package com.globant.tc.scooter.accounts.tests;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.globant.tc.scooter.accounts.api.AddCreditsToAccountApi;
import com.globant.tc.scooter.accounts.api.AssociateUserToAccountApi;
import com.globant.tc.scooter.accounts.api.BuyCreditsMercadoPagoApi;
import com.globant.tc.scooter.accounts.api.CreateAccountApi;
import com.globant.tc.scooter.accounts.api.FindUserByIdApi;
import com.globant.tc.scooter.accounts.api.LinkAccountToMercadoPagoApi;
import com.globant.tc.scooter.accounts.api.RegisterUserApi;
import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.entity.UserEntity;
import com.globant.tc.scooter.accounts.model.Account;
import com.globant.tc.scooter.accounts.model.AssociateUserToAccount;
import com.globant.tc.scooter.accounts.model.CreditsMercado;
import com.globant.tc.scooter.accounts.model.CreditsToAccount;
import com.globant.tc.scooter.accounts.model.User;
import com.globant.tc.scooter.accounts.model.createAccountObject;
import com.globant.tc.scooter.accounts.model.linkAccountToMercadoPago;
import com.globant.tc.scooter.accounts.services.AddCreditsToAccountApiDelegate;
import com.globant.tc.scooter.accounts.services.AssociateUserToAccountApiDelegate;
import com.globant.tc.scooter.accounts.services.BuyCreditsMercadoPagoApiDelegate;
import com.globant.tc.scooter.accounts.services.CreateAccountApiDelegate;
import com.globant.tc.scooter.accounts.services.FindUserByIdApiDelegate;
import com.globant.tc.scooter.accounts.services.LinkAccountToMercadoPagoApiDelegate;
import com.globant.tc.scooter.accounts.services.RegisterUserApiDelegate;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class InterfaceInstantiateTest {

	Long userId = 0L;
	Long accountId = 0L;

	/**
	 * ------------------------------------------------ ------------POST Client
	 * endLogs Api---------------- -----------------------------------------------
	 **/

	@Test
	@Order(1)
	public void registerUserApi() {
		RegisterUserApi registerUserApi = new RegisterUserApi() {
		};
		RegisterUserApiDelegate registerUserApiDelegate = registerUserApi.getDelegate();

		User user = new User();
		user.setName("Test User");
		user.setPreferredPayment("testPayment");
		ResponseEntity<?> responseEntity = registerUserApiDelegate.registerUserPost(user);
		if(responseEntity.getStatusCodeValue() == 200) {
			UserEntity data = (UserEntity) responseEntity.getBody();
			userId = data.getId();
		}

	}

	@Test
	@Order(2)
	public void findUserByIdApi() {
		FindUserByIdApi findUserByIdApi = new FindUserByIdApi() {
		};
		FindUserByIdApiDelegate findUserByIdApiDelegate = findUserByIdApi.getDelegate();

		if (userId == 0) {
			userId = 1L;
		}
		ResponseEntity<?> responseEntity = findUserByIdApiDelegate.findUserByIdUserIdGet(userId);

	}

	@Test
	@Order(3)
	public void CreateAccountApi() {
		CreateAccountApi createAccountApi = new CreateAccountApi() {
		};
		CreateAccountApiDelegate createAccountApiDelegate = createAccountApi.getDelegate();

		createAccountObject createAccountObject = new createAccountObject();
		Account account = new Account();
		account.setBalance(52D);
		account.setActive(true);
		createAccountObject.setAccount(account);
		createAccountObject.setUserId(userId.intValue());

		ResponseEntity<?> responseEntity = createAccountApiDelegate.createAccountPost(createAccountObject);
		if(responseEntity.getStatusCodeValue()==200) {
			AccountEntity data = (AccountEntity) responseEntity.getBody();
			accountId = data.getId();
		}
	}

	@Test
	@Order(4)
	public void associateUserToAccountApiDelegate() {
		AssociateUserToAccountApi associateUserToAccountApi = new AssociateUserToAccountApi() {
		};
		AssociateUserToAccountApiDelegate associateUserToAccountApiDelegate = associateUserToAccountApi.getDelegate();

		AssociateUserToAccount associateUserToAccount = new AssociateUserToAccount();
		associateUserToAccount.setUserId(userId.intValue());
		associateUserToAccount.setAccountId(accountId.intValue());
		ResponseEntity<?> responseEntity = associateUserToAccountApiDelegate
				.associateUserToAccountPost(associateUserToAccount);

	}

	@Test
	@Order(5)
	public void addCreditsToAccountApi() {
		AddCreditsToAccountApi addCreditsToAccountApi = new AddCreditsToAccountApi() {
		};
		AddCreditsToAccountApiDelegate addCreditsToAccountApiDelegate = addCreditsToAccountApi.getDelegate();

		CreditsToAccount inlineObject1 = new CreditsToAccount();
		inlineObject1.setAccountId(accountId.intValue());
		inlineObject1.setCredits(555D);
		ResponseEntity<AccountEntity> responseEntity = addCreditsToAccountApiDelegate
				.addCreditsToAccountPost(inlineObject1);

	}

	@Test
	@Order(6)
	public void linkAccountToMercadoPagoApi() {
		LinkAccountToMercadoPagoApi linkAccountToMercadoPagoApi = new LinkAccountToMercadoPagoApi() {
		};
		LinkAccountToMercadoPagoApiDelegate linkAccountToMercadoPagoApiDelegate = linkAccountToMercadoPagoApi
				.getDelegate();

		linkAccountToMercadoPago linkAccountToMercadoPago = new linkAccountToMercadoPago();
		linkAccountToMercadoPago.setAccountId(accountId.intValue());
		linkAccountToMercadoPago.setMercadoPagoId(1);
		ResponseEntity<?> responseEntity = linkAccountToMercadoPagoApiDelegate
				.linkAccountToMercadoPagoPost(linkAccountToMercadoPago);

	}

	@Test
	@Order(7)
	public void buyCreditsMercadoPagoApi() {
		BuyCreditsMercadoPagoApi buyCreditsMercadoPagoApi = new BuyCreditsMercadoPagoApi() {
		};
		BuyCreditsMercadoPagoApiDelegate buyCreditsMercadoPagoApiDelegate = buyCreditsMercadoPagoApi.getDelegate();

		CreditsMercado creditsMercado = new CreditsMercado();
		creditsMercado.setAccountId(accountId.intValue());
		creditsMercado.setCredits(5555D);
		ResponseEntity<?> responseEntity = buyCreditsMercadoPagoApiDelegate
				.buyCreditsMercadoPagoPost(creditsMercado);
		

	}

	
}
