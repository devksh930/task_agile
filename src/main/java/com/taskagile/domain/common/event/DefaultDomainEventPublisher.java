package com.taskagile.domain.common.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class DefaultDomainEventPublisher implements DomainEventPublisher {

  @Autowired
  private ApplicationEventPublisher actualPublisher;


  @Override
  public void publish(DomainEvent domainEvent) {
    actualPublisher.publishEvent(domainEvent);

  }
}
