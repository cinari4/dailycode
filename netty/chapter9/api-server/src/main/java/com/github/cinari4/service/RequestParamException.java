package com.github.cinari4.service;

public class RequestParamException extends Exception {
	private static final long serialVersionUID = 6023215166221888976L;

	public RequestParamException() {
		super();
	}

	public RequestParamException(String message) {
		super(message);
	}

	public RequestParamException(String message, Throwable cause) {
		super(message, cause);
	}

	public RequestParamException(Throwable cause) {
		super(cause);
	}
	
	protected RequestParamException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
