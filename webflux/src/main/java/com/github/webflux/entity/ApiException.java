package com.github.webflux.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author liuyuhu
 * @date 2018/2/27  9:56
 */

@Data
@Builder
public class ApiException {

    private Integer code;

    private String message;

    private String developerMessage;

    private String requestUrl;

    public ApiException() {}

    public ApiException(int code, String message, String requestUrl) {
        this.code = code;
        this.message = message;
        this.requestUrl = requestUrl;
    }

    public ApiException(int code, String message, String requestUrl, String developerMessage) {
        this(code, message, requestUrl);
        this.developerMessage = developerMessage;
    }

    public static ApiException of(int code, String message, String requestUrl) {
        return new ApiException(code, message, requestUrl);
    }

    public static ApiException ofDeveloper(int code, String message, String requestUrl, String developerMessage) {
        return new ApiException(code, message, requestUrl, developerMessage);
    }

}
