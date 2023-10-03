package com.dcs.login.api;
/*
 * Copyright (c) 2023 Seiko Epson. All rights reserved.
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${application.api.base.url}/login") public class LoginController
{
	@GetMapping
    public String login()
	{
		return "login success";
	}

}
