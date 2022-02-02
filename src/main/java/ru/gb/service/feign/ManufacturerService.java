package ru.gb.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import ru.gb.service.api.ManufacturerApi;

@Service
@FeignClient(url = "localhost:8080/api/v1/manufacturer", value = "ManufacturerService")
public interface ManufacturerService extends ManufacturerApi {
}
