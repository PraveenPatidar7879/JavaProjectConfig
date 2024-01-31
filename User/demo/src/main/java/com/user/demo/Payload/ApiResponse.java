package com.user.demo.Payload;

import org.springframework.http.HttpStatus;

import lombok.Builder;
@Builder
public class ApiResponse {

    private String message;
    private boolean success;
    private HttpStatus status;


    public ApiResponse() {
    }

    public ApiResponse(String message, boolean success, HttpStatus status) {
        this.message = message;
        this.success = success;
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public HttpStatus getStatus() {
        return this.status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }



}
