package com.horodenski.traning.project.traning.project.auth;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.horodenski.traning.project.traning.project.config.ApplicationUserRoles.*;

@AllArgsConstructor
@Repository("fake")
public class FakeApplicationUserDAOService implements ApplicationUserDAO{

    private final PasswordEncoder passwordEncoder;

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return getApplicationUsers().stream()
                .filter(applicationUser -> applicationUser.getUsername().equals(username))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers(){
        List<ApplicationUser> applicationUsers = Lists.newArrayList(
                new ApplicationUser(
                        STUDENT.getGrantedAuthorities(),
                        passwordEncoder.encode("password"),
                        "student",
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        ADMIN.getGrantedAuthorities(),
                        passwordEncoder.encode("password"),
                        "admin",
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        ADMINTRENEE.getGrantedAuthorities(),
                        passwordEncoder.encode("password"),
                        "admintrenee",
                        true,
                        true,
                        true,
                        true
                )
        );
        return  applicationUsers;
    }
}
