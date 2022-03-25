package com.globant.tc.scooter.accounts.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.globant.tc.scooter.accounts.api.RegisterUserApi;
import com.globant.tc.scooter.accounts.services.RegisterUserApiDelegate;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T19:26:49.191+05:00[Asia/Karachi]")
@Controller
@RequestMapping("${openapi.userManagement.base-path:/user}")
public class RegisterUserApiController implements RegisterUserApi {

    private final RegisterUserApiDelegate delegate;

    public RegisterUserApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) RegisterUserApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new RegisterUserApiDelegate() {});
    }

    @Override
    public RegisterUserApiDelegate getDelegate() {
        return delegate;
    }

}
