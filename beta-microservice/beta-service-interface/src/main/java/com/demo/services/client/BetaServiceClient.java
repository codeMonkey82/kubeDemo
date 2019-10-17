package com.demo.services.client;

import com.demo.services.schema.BetaApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="beta-service")
public interface BetaServiceClient extends BetaApi {
}
