package ru.gb.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import ru.gb.service.api.CategoryApi;

@Service
@FeignClient(url = "localhost:8080/api/v1/category", value = "CategoryService")
public interface CategoryService extends CategoryApi {
}
