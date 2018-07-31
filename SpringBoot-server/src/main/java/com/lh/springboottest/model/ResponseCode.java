package com.lh.springboottest.model;

/**
 * @author liuhai
 * @create 2018/05/28 15:38
 * @desc 响应状态码及信息
 **/
public enum ResponseCode {

    OPERATION_SUCCESS(200, "操作成功"),
    OPERATION_ERROR(400, "操作失败");

    ResponseCode(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    /**
     * 响应状态
     */
    private int status;
    /**
     * 响应消息
     */
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
