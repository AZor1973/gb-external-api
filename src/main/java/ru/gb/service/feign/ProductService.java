package ru.gb.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import ru.gb.service.api.ProductApi;

@FeignClient(url = "localhost:8080/api/v1/product", value = "ProductService")
public interface ProductService extends ProductApi {
}
