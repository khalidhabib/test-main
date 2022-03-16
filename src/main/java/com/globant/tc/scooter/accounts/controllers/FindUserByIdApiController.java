package com.globant.tc.scooter.accounts.controllers;

import com.globant.tc.scooter.accounts.api.FindUserByIdApi;
import com.globant.tc.scooter.accounts.services.FindUserByIdApiDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T19:26:49.191+05:00[Asia/Karachi]")
@Controller
@RequestMapping("${openapi.userManagement.base-path:/user}")
public class FindUserByIdApiController implements FindUserByIdApi {

    private final FindUserByIdApiDelegate delegate;

    public FindUserByIdApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) FindUserByIdApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new FindUserByIdApiDelegate() {});
    }

    @Override
    public FindUserByIdApiDelegate getDelegate() {
        return delegate;
    }

}
