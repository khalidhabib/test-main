package com.globant.tc.scooter.accounts.controllers;

import com.globant.tc.scooter.accounts.api.AssociateUserToAccountApi;
import com.globant.tc.scooter.accounts.services.AssociateUserToAccountApiDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-11T21:44:36.143+05:00[Asia/Karachi]")
@Controller
@RequestMapping("${openapi.accounts.base-path:/accounts}")
public class AssociateUserToAccountApiController implements AssociateUserToAccountApi {

    private final AssociateUserToAccountApiDelegate delegate;

    public AssociateUserToAccountApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) AssociateUserToAccountApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AssociateUserToAccountApiDelegate() {});
    }

    @Override
    public AssociateUserToAccountApiDelegate getDelegate() {
        return delegate;
    }

}
