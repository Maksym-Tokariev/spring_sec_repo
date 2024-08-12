package net.podval.springsecurityapp.service;


import net.podval.springsecurityapp.model.User;

/**
 * Service class for {@link net.podval.springsecurityapp.model.User}
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);

}
