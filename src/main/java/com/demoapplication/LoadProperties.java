package com.demoapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class LoadProperties {

	@Value("${app.title}")
	private String title;

	@Value("${app.description}")
	private String description;

	@Value("${app.supportContact}")
	private String supportContact;

	@Value("${app.owner}")
	private String owner;

	@Value("${server.redis.host}")
	private String redisHost;

	@Value("${server.redis.port}")
	private String redisPort;

	@Value("${server.redis.username}")
	private String redisUsername;

	@Value("${server.redis.password}")
	private String redisPassword;

	@Value("${mysql.db.host}")
	private String mysqlHost;

	@Value("${mysql.db.port}")
	private String mysqlPort;

	@Value("${mysql.db.username}")
	private String mysqlUsername;

	@Value("${mysql.db.password}")
	private String mysqlPassword;

	@GetMapping("/properties")
	public String listProperties() {
		String returnValue = "AppProperties [title=" + title + ", description=" + description + ", contact=" + supportContact
				+ ", owner=" + owner + ", redisHost=" + redisHost + ", redisPort=" + redisPort + ", redisUsername="
				+ redisUsername + ", redisPassword=" + redisPassword + ", mysqlHost=" + mysqlHost + ", mysqlPort="
				+ mysqlPort + ", mysqlUsername=" + mysqlUsername + ", mysqlPassword=" + mysqlPassword + "]";		
		return returnValue;
	}

}
