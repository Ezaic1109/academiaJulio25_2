package com.mongodb.client.model;

public class ApiResponse<T> {
    
    private boolean success;
    private String message;
    private T data;
    private int statusCode;
    
    public ApiResponse() {}
    
    public ApiResponse(boolean success, String message, T data, int statusCode) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.statusCode = statusCode;
    }
    
    public static <T> ApiResponse<T> success(T data, int statusCode) {
        return new ApiResponse<>(true, "Success", data, statusCode);
    }
    
    public static <T> ApiResponse<T> error(String message, int statusCode) {
        return new ApiResponse<>(false, message, null, statusCode);
    }
    
    public boolean isSuccess() {
        return success;
    }
    
    public void setSuccess(boolean success) {
        this.success = success;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public int getStatusCode() {
        return statusCode;
    }
    
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    
    @Override
    public String toString() {
        return "ApiResponse{" +
               "success=" + success +
               ", message='" + message + '\'' +
               ", data=" + data +
               ", statusCode=" + statusCode +
               '}';
    }
}