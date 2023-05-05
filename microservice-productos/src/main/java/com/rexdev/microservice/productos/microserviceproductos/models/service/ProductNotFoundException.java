package com.rexdev.microservice.productos.microserviceproductos.models.service;

public class ProductNotFoundException extends RuntimeException {

  private String message;
  private String code;

  public ProductNotFoundException(String message, String code) {
    this.message = message;
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

}