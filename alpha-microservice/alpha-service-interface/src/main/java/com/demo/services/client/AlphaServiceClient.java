package com.demo.services.client;

import com.demo.services.schema.AlphaApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="alpha-service")
public interface AlphaServiceClient extends AlphaApi {
}
