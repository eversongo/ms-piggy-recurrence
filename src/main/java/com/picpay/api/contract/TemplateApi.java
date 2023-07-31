package com.picpay.api.contract;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Tag(name = "Template")
public interface TemplateApi {
    @Operation(summary = "Template api get")
    @RequestMapping(value = "/v1/template", method = RequestMethod.GET)
    ResponseEntity<String> template();
}
