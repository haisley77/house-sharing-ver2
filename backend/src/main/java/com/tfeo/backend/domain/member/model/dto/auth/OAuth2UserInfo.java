package com.tfeo.backend.domain.member.model.dto.auth;

import java.util.Map;

public abstract class OAuth2UserInfo {

	protected Map<String, Object> attributes;

	public OAuth2UserInfo(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public abstract String getId();

	public abstract String getNickname();

	public abstract String getEmail();
}