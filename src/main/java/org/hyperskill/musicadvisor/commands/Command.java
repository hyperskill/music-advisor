package org.hyperskill.musicadvisor.commands;

public abstract class Command {
    public Command (boolean isAuthorized) {
        checkAuth(isAuthorized);
    }

    private void checkAuth(boolean isAuthorized) {
        if (isAuthorized) {
            printMessage();
        } else {
            System.out.println("Please, provide access for application.");
        }
    }

    public abstract void printMessage();
}
