package com.picpay.api;

import com.picpay.api.contract.TemplateApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController implements TemplateApi {
    @Override
    public ResponseEntity<String> template() {
        return ResponseEntity.ok("hello ms-piggy-recurrence");
    }
}
