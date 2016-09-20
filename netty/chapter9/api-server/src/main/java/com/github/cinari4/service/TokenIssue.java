package com.github.cinari4.service;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.cinari4.core.ApiRequestTemplate;
import com.github.cinari4.core.KeyMaker;
import com.github.cinari4.service.dao.TokenKey;
import com.google.gson.JsonObject;

@Service("tokenIssue")
@Scope("prototype")
public class TokenIssue extends ApiRequestTemplate {

	public TokenIssue(Map<String, String> reqData) {
		super(reqData);
	}

	public void requestParamValidation() throws RequestParamException {
		if (StringUtils.isEmpty(this.reqData.get("userNo"))) {
			throw new RequestParamException("userNo이 없습니다.");
		}

		if (StringUtils.isEmpty(this.reqData.get("password"))) {
			throw new RequestParamException("password가 없습니다.");
		}
	}

	public void service() throws ServiceException {
		if (FakeUserInfo.USERNO.equals(this.reqData.get("userNo"))
				|| FakeUserInfo.PASSWORD.equals(this.reqData.get("password"))) {
			
			final long threeHour = 60 * 60 * 3;
			long issueDate = System.currentTimeMillis() / 1000;
			String email = String.valueOf(FakeUserInfo.USERID);
			
			JsonObject token = new JsonObject();
			token.addProperty("issueDate", issueDate);
			token.addProperty("expireDate", issueDate + threeHour);
			token.addProperty("email", email);
			token.addProperty("userNo", reqData.get("userNo"));

			KeyMaker tokenKey = new TokenKey(email, issueDate);

			this.apiResult.addProperty("resultCode", "200");
			this.apiResult.addProperty("message", "Success");
			this.apiResult.addProperty("token", tokenKey.getKey());
		} else {
			this.apiResult.addProperty("resultCode", "404");
		}
	}
}
