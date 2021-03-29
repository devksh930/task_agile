package com.taskagile.domain.common.event;

public interface DomainEventPublisher {

  void publish(DomainEvent domainEvent);
}
