package com.globant.tc.scooter.accounts.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import com.globant.tc.scooter.accounts.AccountsApplication;
import com.globant.tc.scooter.accounts.controllers.AddCreditsToAccountApiController;
import com.globant.tc.scooter.accounts.controllers.AssociateUserToAccountApiController;
import com.globant.tc.scooter.accounts.controllers.BuyCreditsMercadoPagoApiController;
import com.globant.tc.scooter.accounts.controllers.CreateAccountApiController;
import com.globant.tc.scooter.accounts.controllers.FindUserByIdApiController;
import com.globant.tc.scooter.accounts.controllers.LinkAccountToMercadoPagoApiController;
import com.globant.tc.scooter.accounts.controllers.RegisterUserApiController;
import com.globant.tc.scooter.accounts.entity.AccountEntity;
import com.globant.tc.scooter.accounts.entity.UserEntity;
import com.globant.tc.scooter.accounts.model.Account;
import com.globant.tc.scooter.accounts.model.AssociateUserToAccount;
import com.globant.tc.scooter.accounts.model.CreditsMercado;
import com.globant.tc.scooter.accounts.model.CreditsToAccount;
import com.globant.tc.scooter.accounts.model.User;
import com.globant.tc.scooter.accounts.model.createAccountObject;
import com.globant.tc.scooter.accounts.model.linkAccountToMercadoPago;

@SpringBootTest(classes = AccountsApplication.class)
@TestMethodOrder(OrderAnnotation.class)
@RunWith(SpringRunner.class)
public class AccountApiTest {

	@Autowired
	private WebApplicationContext context;

	@Autowired
	CreateAccountApiController createAccountApiController;

	@Autowired
	FindUserByIdApiController findUser;

	@Autowired
	RegisterUserApiController registerUser;

	@Autowired
	AddCreditsToAccountApiController accountApi;

	@Autowired
	AssociateUserToAccountApiController associateUserToAccountApi;

	@Autowired
	LinkAccountToMercadoPagoApiController accountToMercadoPagoApiController;

	@Autowired
	BuyCreditsMercadoPagoApiController BuyCreditsApiController;

	Long userId = 0L;
	Long accountId = 0L;
	Long mercadoPagoId = 0L;

	/**
	 * ------------------------------------------------ ------------POST Client
	 * endLogs Api---------------- -----------------------------------------------
	 **/

	@Test
	@Order(1)
	public void createUser() {
		User user = new User();
		user.setName("Test User");
		user.setPreferredPayment("testPayment");
		ResponseEntity<UserEntity> responseEntity = (ResponseEntity<UserEntity>) registerUser.registerUserPost(user);
		userId = responseEntity.getBody().getId();
	}

	public void createUserByNull() {
		ResponseEntity<UserEntity> responseEntity = (ResponseEntity<UserEntity>) registerUser.registerUserPost(null);
		if (responseEntity.getStatusCodeValue() == 200) {
			userId = responseEntity.getBody().getId();
		} else {
			assertEquals(responseEntity.getStatusCodeValue(), 503);
		}
	}

	@Test
	@Order(2)
	public void findUserById() {
		if (userId == 0) {
			userId = 1L;
		}
		ResponseEntity<?> responseEntity = findUser.findUserByIdUserIdGet(userId);
	}

	@Test
	public void findUserByWrongId() {
		ResponseEntity<?> responseEntity = findUser.findUserByIdUserIdGet(4455L);
	}

	@Test
	public void findUserBynullId() {
		ResponseEntity<?> responseEntity = findUser.findUserByIdUserIdGet(null);
		if (responseEntity.getStatusCodeValue() != 200) {
			assertEquals(responseEntity.getStatusCodeValue(), 503);
		}
	}

	@Test
	@Order(3)
	public void createAccount() throws Exception {

		createAccountObject createAccountObject = new createAccountObject();
		Account account = new Account();
		account.setBalance(52D);
		account.setActive(true);
		createAccountObject.setAccount(account);
		createAccountObject.setUserId(userId.intValue());

		ResponseEntity<?> responseEntity = createAccountApiController.createAccountPost(createAccountObject);
		if (responseEntity != null) {
			AccountEntity data = (AccountEntity) responseEntity.getBody();
			accountId = data.getId();
		}

	}

	@Test
	public void createAccountWithEmpty() throws Exception {
		createAccountObject createAccountObject = new createAccountObject();
		createAccountObject.setUserId(userId.intValue());

		ResponseEntity<?> responseEntity = createAccountApiController.createAccountPost(createAccountObject);
		if (responseEntity != null) {
			if (responseEntity.getStatusCodeValue() == 200) {
				AccountEntity data = (AccountEntity) responseEntity.getBody();
				accountId = data.getId();
			} else {
				assertEquals(responseEntity.getStatusCodeValue(), 503);
			}
		}

	}

	@Test
	@Order(4)
	public void addCredit() throws Exception {
		CreditsToAccount inlineObject1 = new CreditsToAccount();
		inlineObject1.setAccountId(accountId.intValue());
		inlineObject1.setCredits(555D);
		ResponseEntity<AccountEntity> responseEntity = accountApi.addCreditsToAccountPost(inlineObject1);
	}

	@Test
	public void addCreditWithEmpty() throws Exception {
		ResponseEntity<AccountEntity> responseEntity = accountApi.addCreditsToAccountPost(null);
		if (responseEntity != null) {
			if (responseEntity.getStatusCodeValue() != 200) {
				assertEquals(responseEntity.getStatusCodeValue(), 503);
			}
		}
	}

	@Test
	@Order(5)
	public void asssociateAccount() throws Exception {
		AssociateUserToAccount associateUserToAccount = new AssociateUserToAccount();
		associateUserToAccount.setUserId(userId.intValue());
		associateUserToAccount.setAccountId(accountId.intValue());
		ResponseEntity<?> responseEntity = associateUserToAccountApi.associateUserToAccountPost(associateUserToAccount);
	}

	@Test
	public void asssociateAccountWithEmpty() throws Exception {
		ResponseEntity<?> responseEntity = associateUserToAccountApi.associateUserToAccountPost(null);
		if (responseEntity != null && responseEntity.getStatusCodeValue() != 200) {
			assertEquals(responseEntity.getStatusCodeValue(), 503);
		}
	}

	@Test
	@Order(6)
	public void linkAccountToMercadoPago() throws Exception {
		linkAccountToMercadoPago linkAccountToMercadoPago = new linkAccountToMercadoPago();
		linkAccountToMercadoPago.setAccountId(accountId.intValue());
		linkAccountToMercadoPago.setMercadoPagoId(mercadoPagoId.intValue());
		ResponseEntity<?> responseEntity = accountToMercadoPagoApiController
				.linkAccountToMercadoPagoPost(linkAccountToMercadoPago);
	}

	@Test
	public void linkAccountToMercadoPagoWithEmpty() throws Exception {
		ResponseEntity<?> responseEntity = accountToMercadoPagoApiController.linkAccountToMercadoPagoPost(null);
		if (responseEntity != null) {
			if (responseEntity.getStatusCodeValue() != 200) {
				assertEquals(responseEntity.getStatusCodeValue(), 503);
			}
		}
	}

	@Test
	@Order(7)
	public void buyCreditsMercadoPagoApi() throws Exception {
		CreditsMercado creditsMercado = new CreditsMercado();
		creditsMercado.setAccountId(accountId.intValue());
		creditsMercado.setCredits(5555D);
		ResponseEntity<?> responseEntity = BuyCreditsApiController.buyCreditsMercadoPagoPost(creditsMercado);
	}

	@Test
	public void buyCreditsMercadoPagoApiWithEmpty() throws Exception {
		ResponseEntity<?> responseEntity = BuyCreditsApiController.buyCreditsMercadoPagoPost(null);
		if (responseEntity != null && responseEntity.getStatusCodeValue() != 200) {
			assertEquals(responseEntity.getStatusCodeValue(), 503);
		}
	}

}
