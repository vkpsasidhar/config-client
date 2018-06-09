package com.sasi.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageReSource {

	@Value("${message:Hi Config}")
	private String msg;
	
	@GetMapping("/message")
	public String getMsg() {
		return msg;
	}
}
