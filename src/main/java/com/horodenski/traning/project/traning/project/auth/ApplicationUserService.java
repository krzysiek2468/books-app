package com.horodenski.traning.project.traning.project.auth;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserService implements UserDetailsService {
    private final ApplicationUserDAO applicationUserDAO;

    public ApplicationUserService(@Qualifier("fake") ApplicationUserDAO applicationUserDAO) {
        this.applicationUserDAO = applicationUserDAO;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser applicationUser = applicationUserDAO.selectApplicationUserByUsername(username).orElseThrow(() ->
                new UsernameNotFoundException(String.format("User with username %s not found", username))
        );
        return applicationUser;
    }
}
