package ru.gb.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.service.api.ProductApi;
import ru.gb.service.feign.ProductService;
import ru.gb.web.dto.ProductDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/gb-shop")
public class ShopController {

    private final ProductService productService;

    @GetMapping("/product")
    public List<ProductDto> getProductList() {
        return productService.getProductList();
    }
}
