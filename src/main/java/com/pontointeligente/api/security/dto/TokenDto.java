package com.pontointeligente.api.security.dto;

/**
 * @author leonardogallotti
 * Classe DTO para retornar o token
 *
 */
public class TokenDto {

	private String token; 
	
	public TokenDto() {
	}
	
	public TokenDto(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
