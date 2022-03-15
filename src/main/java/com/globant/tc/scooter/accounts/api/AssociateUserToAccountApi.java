/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.entity.AccountsUsersEntity;
import com.globant.tc.scooter.accounts.model.AssociateUserToAccount;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-11T21:44:36.143+05:00[Asia/Karachi]")
@Validated
@Api(value = "associateUserToAccount", description = "the associateUserToAccount API")
public interface AssociateUserToAccountApi {

    default AssociateUserToAccountApiDelegate getDelegate() {
        return new AssociateUserToAccountApiDelegate() {};
    }

    /**
     * POST /associateUserToAccount : Associate User With An Account
     *
     * @param associateUserToAccount  (required)
     * @return Operation success (status code 200)
     */
    @ApiOperation(value = "Associate User With An Account", nickname = "associateUserToAccountPost", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operation success") })
    @PostMapping(
        value = "/associateUserToAccount",
        consumes = { "application/json" }
    )
    default ResponseEntity<AccountsUsersEntity> associateUserToAccountPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AssociateUserToAccount associateUserToAccount) {
        return getDelegate().associateUserToAccountPost(associateUserToAccount);
    }

}
