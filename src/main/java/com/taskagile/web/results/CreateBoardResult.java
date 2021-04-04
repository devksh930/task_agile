package com.taskagile.web.results;

import com.taskagile.domain.model.board.Board;
import org.springframework.http.ResponseEntity;

public class CreateBoardResult {

  public static ResponseEntity<com.taskagile.web.results.ApiResult> build(Board board) {
    com.taskagile.web.results.ApiResult apiResult = com.taskagile.web.results.ApiResult.blank()
      .add("id", board.getId().value())
      .add("name", board.getName())
      .add("description", board.getDescription())
      .add("teamId", board.getTeamId().value());
    return com.taskagile.web.results.Result.ok(apiResult);
  }
}
