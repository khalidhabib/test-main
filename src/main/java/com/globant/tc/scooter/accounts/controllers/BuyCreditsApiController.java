package com.globant.tc.scooter.accounts.controllers;

import com.globant.tc.scooter.accounts.api.BuyCreditsApi;
import com.globant.tc.scooter.accounts.services.BuyCreditsApiDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T19:29:52.717+05:00[Asia/Karachi]")
@Controller
@RequestMapping("${openapi.mercadoPago.base-path:/mercadopago}")
public class BuyCreditsApiController implements BuyCreditsApi {

    private final BuyCreditsApiDelegate delegate;

    public BuyCreditsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) BuyCreditsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BuyCreditsApiDelegate() {});
    }

    @Override
    public BuyCreditsApiDelegate getDelegate() {
        return delegate;
    }

}
