package org.openapitools.api;

import org.openapitools.model.Category;
import org.openapitools.model.CategoryCategoryIdBillsGet200ResponseInner;
import org.openapitools.model.CategoryRequest;
import org.openapitools.model.CategoryUpdateRequest;
import org.openapitools.model.Error;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:06:48.248741+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
@Controller
@RequestMapping("${openapi.category.base-path:}")
public class CategoryApiController implements CategoryApi {

    private final NativeWebRequest request;

    @Autowired
    public CategoryApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
