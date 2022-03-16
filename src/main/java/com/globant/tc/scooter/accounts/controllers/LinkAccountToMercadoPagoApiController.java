package com.globant.tc.scooter.accounts.controllers;

import com.globant.tc.scooter.accounts.api.LinkAccountToMercadoPagoApi;
import com.globant.tc.scooter.accounts.services.LinkAccountToMercadoPagoApiDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-11T21:44:36.143+05:00[Asia/Karachi]")
@Controller
@RequestMapping("${openapi.accounts.base-path:/accounts}")
public class LinkAccountToMercadoPagoApiController implements LinkAccountToMercadoPagoApi {

    private final LinkAccountToMercadoPagoApiDelegate delegate;

    public LinkAccountToMercadoPagoApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) LinkAccountToMercadoPagoApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new LinkAccountToMercadoPagoApiDelegate() {});
    }

    @Override
    public LinkAccountToMercadoPagoApiDelegate getDelegate() {
        return delegate;
    }

}
