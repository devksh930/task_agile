package com.taskagile.web.payload;

import com.taskagile.domain.model.user.RegistrationCommand;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationPayload {
  @Size(min = 2, max = 50, message = "이름은 2자에서 50자의 문자열만 허용합니다")
  @NotNull
  private String username;

  @Email(message = "유효한 이메일 주소여야 합니다.")
  @Size(max = 100, message = "이메일 주소는 100문자를 초과할수 없습니다.")
  @NotNull
  private String emailAddress;

  @Size(min = 6, max = 30, message = "비밀번호는 6~30자의 문자열만 허용합니다.")
  @NotNull
  private String password;

  public RegistrationCommand toCommand() {
    return new RegistrationCommand(this.username, this.emailAddress, this.password);
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
