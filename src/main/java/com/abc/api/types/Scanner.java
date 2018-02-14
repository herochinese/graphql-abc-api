package com.abc.api.types;

public class Scanner {

    private String name;
    private String ip;
    private String mode;

    public Scanner(String name, String ip, String mode) {
        this.name = name;
        this.ip = ip;
        this.mode = mode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
