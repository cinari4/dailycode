package com.github.cinari4.service;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.cinari4.core.ApiRequestTemplate;

@Service("users")
@Scope("prototype")
public class UserInfo extends ApiRequestTemplate {

	public UserInfo(Map<String, String> reqData) {
		super(reqData);
	}

	@Override
	public void requestParamValidation() throws RequestParamException {
		if (StringUtils.isEmpty(this.reqData.get("email"))) {
			throw new RequestParamException("email이 없습니다.");
		}
	}

	@Override
	public void service() throws ServiceException {
		this.apiResult.addProperty("resultCode", "200");
		this.apiResult.addProperty("message", "Success");
		this.apiResult.addProperty("userNo", getUserNo());
		
		// if no data
		// this.apiResult.addProperty("resultCode", "404");
		}

	private String getUserNo() {
		return "1234";
	}
}
