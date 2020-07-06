package com.grg.cloud.common;

public class ResponseResult {

    private String resCode;
    private String resMsg;
    private Object result;

    public ResponseResult() {
        this.resCode = ResponseCode.SUCCESS.getCode();
        this.resMsg = ResponseCode.SUCCESS.getValue();
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
