package com.svaramig.clidemo.command;

import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@ShellCommandGroup("testMe")
public class Command {
    @ShellMethod(key="hit", value="say")
    public String hit() {
        return "hit command";
    }

    @ShellMethod(key="stand", value="hello")
    public String stand() {
        return "stand command";
    }
}
