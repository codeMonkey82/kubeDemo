package com.demo.services.client;

import com.demo.services.schema.AlphaApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="myalpha")
public interface AlphaServiceClient extends AlphaApi {
}
