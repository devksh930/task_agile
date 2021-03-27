package com.taskagile.web.results;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

public final class Result {

  private Result() {
  }

  public static ResponseEntity<com.taskagile.web.results.ApiResult> created() {
    return ResponseEntity.status(201).build();
  }

  public static ResponseEntity<com.taskagile.web.results.ApiResult> ok() {
    return ResponseEntity.ok().build();
  }

  public static ResponseEntity<com.taskagile.web.results.ApiResult> ok(String message) {
    Assert.hasText(message, "Parameter `message` must not be blank");

    return ok(com.taskagile.web.results.ApiResult.message(message));
  }

  public static ResponseEntity<com.taskagile.web.results.ApiResult> ok(com.taskagile.web.results.ApiResult payload) {
    Assert.notNull(payload, "Parameter `payload` must not be null");

    return ResponseEntity.ok(payload);
  }

  public static ResponseEntity<com.taskagile.web.results.ApiResult> failure(String message) {
    return ResponseEntity.badRequest().body(com.taskagile.web.results.ApiResult.message(message));
  }

  public static ResponseEntity<com.taskagile.web.results.ApiResult> serverError(String message, String errorReferenceCode) {
    return ResponseEntity.status(500).body(com.taskagile.web.results.ApiResult.error(message, errorReferenceCode));
  }

  public static ResponseEntity<com.taskagile.web.results.ApiResult> notFound() {
    return ResponseEntity.notFound().build();
  }

  public static ResponseEntity<com.taskagile.web.results.ApiResult> unauthenticated() {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
  }

  public static ResponseEntity<com.taskagile.web.results.ApiResult> forbidden() {
    return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
  }
}
