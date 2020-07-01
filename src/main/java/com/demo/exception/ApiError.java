package com.demo.exception;

import java.util.Date;

public class ApiError {
	
	private String errorCode;
	
	private String errorDesc;
	
	private Date date;
	
	
	

	public ApiError(String errorCode, String errorDesc, Date date) {
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
		this.date = date;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
