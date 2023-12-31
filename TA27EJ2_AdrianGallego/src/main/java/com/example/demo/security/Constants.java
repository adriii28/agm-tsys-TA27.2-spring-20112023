package com.example.demo.security;

public class Constants {

	// Spring Security

	public static final String LOGIN_URL = "/login";
	public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer ";

	// JWT

	public static final String ISSUER_INFO = "Adrian Gallego";
	public static final String SUPER_SECRET_KEY = "admin1234";
	public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day

}