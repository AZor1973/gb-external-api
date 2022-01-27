package ru.gb.config;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import ru.gb.service.feign.ProductService;

@Configuration
@EnableFeignClients(basePackageClasses = {ProductService.class})
public class ShopConfig {
}
