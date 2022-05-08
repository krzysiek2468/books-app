package com.horodenski.traning.project.traning.project.auth;

import java.util.Optional;

public interface ApplicationUserDAO {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
