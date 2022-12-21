package com.nttdata.bootcamp.configservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

	/*
	 * @Value("${product.product-name}") private String productExample;
	 */

	@Value("${some.value}")
	private String configProfileExample;

	/*
	 * @GetMapping(path = "/getProductName") public String getProductName() { return
	 * this.productExample; }
	 */

	@GetMapping(path = "/getProfileExample")
	public String getProfileExample() {
		return this.configProfileExample;
	}

}
