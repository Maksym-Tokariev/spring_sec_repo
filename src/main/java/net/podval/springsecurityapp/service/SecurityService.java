package net.podval.springsecurityapp.service;

/**
 * Service fo Security.
 *
 */


public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
