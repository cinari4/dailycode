package com.github.cinari4.service.dao;

import com.github.cinari4.core.KeyMaker;
import redis.clients.util.MurmurHash;

public class TokenKey implements KeyMaker {
	static final int SEED_MURMURHASH = 0x1234ABCD;

	private String email;
	private long issueDate;

	public TokenKey(String email, long issueDate) {
		this.email = email;
		this.issueDate = issueDate;
	}

	@Override
	public String getKey() {
		String source = email + String.valueOf(issueDate);
		return Long.toString(MurmurHash.hash64A(source.getBytes(), SEED_MURMURHASH), 16);
	}
}