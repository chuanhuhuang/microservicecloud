package com.grg.cloud.common;

public enum ResponseCode {

	SUCCESS ("000000", "处理成功"),
	FAIL    ("999999", "处理失败");
	
	private String code;
	
	private String value;

	private ResponseCode(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
