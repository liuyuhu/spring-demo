package com.github.webflux.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author liuyuhu
 * @date 2018/2/26  11:50
 */

@Data
@Accessors(chain = true)
public class ApiResult {

    private Integer code;

    private String message;

    private Object data;

    private Integer time;

    private static ApiResult ok = new ApiResult();

    public ApiResult() {
        this.code = 0;
        this.message = "Ok";
    }

    public ApiResult(Object data) {
        this();
        this.data = data;
    }

    public ApiResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ApiResult ok() {
        return ok;
    }

    public static ApiResult ok(Object data) {
        return new ApiResult(data);
    }

    public static ApiResult ok(Object data, String message) {
        return ok(data).setMessage(message);
    }

    public static ApiResult error(int code, String message) {
        return new ApiResult(code, message);
    }
}
