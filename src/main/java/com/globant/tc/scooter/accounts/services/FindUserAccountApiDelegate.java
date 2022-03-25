/*
 * package com.globant.tc.scooter.accounts.services;
 * 
 * import com.globant.tc.scooter.accounts.api.FindUserAccountApi; import
 * com.globant.tc.scooter.accounts.controllers.FindUserAccountApiController;
 * import org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.context.request.NativeWebRequest;
 * 
 * import java.util.Optional;
 * 
 *//**
	 * A delegate to be called by the {@link FindUserAccountApiController}}.
	 * Implement this interface with a
	 * {@link org.springframework.stereotype.Service} annotated class.
	 */
/*
 * @javax.annotation.Generated(value =
 * "org.openapitools.codegen.languages.SpringCodegen", date =
 * "2022-03-16T19:29:52.717+05:00[Asia/Karachi]") public interface
 * FindUserAccountApiDelegate {
 * 
 * default Optional<NativeWebRequest> getRequest() { return Optional.empty(); }
 * 
 *//**
	 * GET /findUserAccount/{userId} : Find an account for a redistered user
	 *
	 * @param userId id of the user (required)
	 * @return OK (status code 200) or A user with the specified ID was not found.
	 *         (status code 404)
	 * @see FindUserAccountApi#findUserAccountUserIdGet
	 *//*
		 * default ResponseEntity<Long> findUserAccountUserIdGet(Long userId) { return
		 * new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		 * 
		 * }
		 * 
		 * }
		 */