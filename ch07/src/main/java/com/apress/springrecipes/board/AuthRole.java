package com.apress.springrecipes.board;

public enum AuthRole {
    ADMIN("ADMIN");

    private String type;

    AuthRole(String type) {
        this.type = type;
    }

    public String getType() {
        return "hasAuthority('" + type + "')";
    }
}
