package com.horodenski.traning.project.traning.project.config;

import com.google.common.collect.Sets;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.horodenski.traning.project.traning.project.config.ApplicationUserPermissions.*;

public enum ApplicationUserRoles {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(USER_READ, USER_WRITE)),
    ADMINTRENEE(Sets.newHashSet(USER_READ));

    private final Set<ApplicationUserPermissions> permissions;

    ApplicationUserRoles(Set<ApplicationUserPermissions> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermissions> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return permissions;
    }
}
