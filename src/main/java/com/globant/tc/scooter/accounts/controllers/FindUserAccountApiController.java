package com.globant.tc.scooter.accounts.controllers;

import com.globant.tc.scooter.accounts.api.FindUserAccountApi;
import com.globant.tc.scooter.accounts.services.FindUserAccountApiDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T19:29:52.717+05:00[Asia/Karachi]")
@Controller
@RequestMapping("${openapi.mercadoPago.base-path:/mercadopago}")
public class FindUserAccountApiController implements FindUserAccountApi {

    private final FindUserAccountApiDelegate delegate;

    public FindUserAccountApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) FindUserAccountApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new FindUserAccountApiDelegate() {});
    }

    @Override
    public FindUserAccountApiDelegate getDelegate() {
        return delegate;
    }

}
