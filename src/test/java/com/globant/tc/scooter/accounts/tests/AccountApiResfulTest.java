/*
 * package com.globant.tc.scooter.accounts.tests;
 * 
 * import static org.springframework.http.MediaType.APPLICATION_JSON; import
 * static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
 * import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * 
 * import org.junit.Before; import
 * org.junit.jupiter.api.MethodOrderer.OrderAnnotation; import
 * org.junit.jupiter.api.Order; import org.junit.jupiter.api.Test; import
 * org.junit.jupiter.api.TestMethodOrder; import org.junit.runner.RunWith;
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
 * import org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner; import
 * org.springframework.test.context.junit4.SpringRunner; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.MvcResult; import
 * org.springframework.test.web.servlet.setup.MockMvcBuilders; import
 * org.springframework.web.context.WebApplicationContext;
 * 
 * import com.fasterxml.jackson.core.JsonProcessingException; import
 * com.fasterxml.jackson.databind.ObjectMapper; import
 * com.globant.tc.scooter.accounts.controllers.AddCreditsToAccountApiController;
 * import com.globant.tc.scooter.accounts.controllers.
 * AssociateUserToAccountApiController; import
 * com.globant.tc.scooter.accounts.controllers.
 * BuyCreditsMercadoPagoApiController; import
 * com.globant.tc.scooter.accounts.controllers.CreateAccountApiController;
 * import com.globant.tc.scooter.accounts.controllers.FindUserByIdApiController;
 * import com.globant.tc.scooter.accounts.controllers.
 * LinkAccountToMercadoPagoApiController; import
 * com.globant.tc.scooter.accounts.controllers.RegisterUserApiController; import
 * com.globant.tc.scooter.accounts.model.User;
 * 
 * @SpringBootTest
 * 
 * @TestMethodOrder(OrderAnnotation.class)
 * 
 * @AutoConfigureMockMvc public class AccountApiResfulTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @Autowired private WebApplicationContext context;
 * 
 * @Autowired CreateAccountApiController createAccountApiController;
 * 
 * @Autowired FindUserByIdApiController findUser;
 * 
 * @Autowired RegisterUserApiController registerUser;
 * 
 * @Autowired AddCreditsToAccountApiController accountApi;
 * 
 * @Autowired AssociateUserToAccountApiController associateUserToAccountApi;
 * 
 * @Autowired LinkAccountToMercadoPagoApiController
 * accountToMercadoPagoApiController;
 * 
 * @Autowired BuyCreditsMercadoPagoApiController BuyCreditsApiController;
 * 
 * @Before public void settup() { mockMvc =
 * MockMvcBuilders.webAppContextSetup(context).build(); }
 * 
 * 
 * Long userId = 0L; Long accountId = 0L; Long mercadoPagoId = 0L;
 * 
 *//**
	 * ------------------------------------------------ ------------POST Client
	 * endLogs Api---------------- -----------------------------------------------
	 * 
	 * @throws Exception
	 * @throws JsonProcessingException
	 **//*
		 * 
		 * @Test
		 * 
		 * @Order(1) public void createUser() throws JsonProcessingException, Exception
		 * { User user = new User(); user.setName("Test User");
		 * user.setPreferredPayment("testPayment");
		 * 
		 * ObjectMapper MAPPER = new ObjectMapper(); MvcResult result =
		 * mockMvc.perform(post("/registerUser/") .accept(APPLICATION_JSON)
		 * .contentType(APPLICATION_JSON) .content(MAPPER.writeValueAsString(user)))
		 * .andExpect(status().isOk()) .andReturn();
		 * 
		 * String responseBody = result.getResponse().getContentAsString();
		 * 
		 * 
		 * }
		 * 
		 * @Test
		 * 
		 * @Order(2) public void findUserById() throws Exception { if (userId == 0) {
		 * userId = 1L; }
		 * 
		 * MvcResult result = mockMvc.perform(get("/findUserById/" + userId)
		 * .accept(APPLICATION_JSON) .contentType(APPLICATION_JSON))
		 * .andExpect(status().isOk()) .andReturn();
		 * 
		 * //HttpEntity<UserEntity> responseEntity =
		 * findUser.findUserByIdUserIdGet(userId); }
		 * 
		 * @Test public void findUserByWrongId() throws Exception { MvcResult result =
		 * mockMvc.perform(get("/findUserById/" + userId) .accept(APPLICATION_JSON)
		 * .contentType(APPLICATION_JSON)) .andExpect(status().isNotFound())
		 * .andReturn();
		 * 
		 * //HttpEntity<UserEntity> responseEntity =
		 * findUser.findUserByIdUserIdGet(4455L); }
		 * 
		 * }
		 */