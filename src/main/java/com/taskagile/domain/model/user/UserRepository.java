package com.taskagile.domain.model.user;

public interface UserRepository {

  User findByUsername(String username);

  User findByEmailAddress(String emailAddress);

  void save(User user);

}
