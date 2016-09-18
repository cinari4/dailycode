package com.github.cinari4.core;

import com.github.cinari4.service.RequestParamException;
import com.github.cinari4.service.ServiceException;
import com.google.gson.JsonObject;

public interface ApiRequest {
	public void requestParamValidation() throws RequestParamException;
	public void service() throws ServiceException;
	public void executeService();
	public JsonObject getApiResult();
}
