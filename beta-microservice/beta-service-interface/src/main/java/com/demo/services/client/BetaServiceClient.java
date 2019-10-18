package com.demo.services.client;

import com.demo.services.schema.BetaApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="mybeta")
public interface BetaServiceClient extends BetaApi {
}
