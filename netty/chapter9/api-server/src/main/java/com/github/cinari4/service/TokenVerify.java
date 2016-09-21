package com.github.cinari4.service;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.cinari4.core.ApiRequestTemplate;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Service("tokenVerify")
@Scope("prototype")
public class TokenVerify extends ApiRequestTemplate {
	public TokenVerify(Map<String, String> reqData) {
		super(reqData);
	}

	@Override
	public void requestParamValidation() throws RequestParamException {
		if (StringUtils.isEmpty(this.reqData.get("token"))) {
			throw new RequestParamException("token이 없습니다.");
		}
	}

	@Override
	public void service() throws ServiceException {
		String tokenString = null;
		if (FakeTokenInfo.TOKEN.equals(this.reqData.get("token"))) {
			tokenString = FakeTokenInfo.TOKEN;
		}

		if (tokenString == null) {
			this.apiResult.addProperty("resultCode", "404");
			this.apiResult.addProperty("message", "Fail");
		} else {
			Gson gson = new Gson();
			JsonObject token = gson.fromJson(tokenString, JsonObject.class);

			this.apiResult.addProperty("resultCode", "200");
			this.apiResult.addProperty("message", "Success");
			this.apiResult.add("issueDate", token.get("issueDate"));
			this.apiResult.add("email", token.get("email"));
			this.apiResult.add("userNo", token.get("userNo"));
		}
	}
}