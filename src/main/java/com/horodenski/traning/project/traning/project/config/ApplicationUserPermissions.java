package com.horodenski.traning.project.traning.project.config;

public enum ApplicationUserPermissions {
    USER_READ("user:read"),
    USER_WRITE("user:write");

    private final String permission;

    ApplicationUserPermissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
