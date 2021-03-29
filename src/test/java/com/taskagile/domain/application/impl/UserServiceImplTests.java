package com.taskagile.domain.application.impl;

import com.taskagile.domain.common.event.DomainEventPublisher;
import com.taskagile.domain.common.mail.MailManager;
import com.taskagile.domain.model.user.RegistrationException;
import com.taskagile.domain.model.user.RegistrationManagement;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class UserServiceImplTests {
  private RegistrationManagement registrationManagementMock;
  private DomainEventPublisher eventPublisherMock;
  private MailManager mailMangerMock;
  private UserServiceImpl instance;

  @Before
  private void setup() {
    registrationManagementMock = mock(RegistrationManagement.class);
    eventPublisherMock = mock(DomainEventPublisher.class);
    mailMangerMock = mock(MailManager.class);
    instance = new UserServiceImpl(registrationManagementMock, eventPublisherMock, mailMangerMock);
  }

  @Test(expected = IllegalArgumentException.class)
  public void register_nullCommand_shouldFail() throws RegistrationException {
    instance.register(null);
  }
}
