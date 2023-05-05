package com.rexdev.microservice.productos.microserviceproductos.models.service;

public class ErrorDTO {

  private String message;
  private String code;
  private final String MICRO_SERVICE = "ms-productos";

  public String getMICRO_SERVICE() {
    return MICRO_SERVICE;
  }

  public ErrorDTO(String message, String code) {
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
