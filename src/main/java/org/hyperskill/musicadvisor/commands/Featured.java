package org.hyperskill.musicadvisor.commands;

public class Featured extends Command {

    public Featured(boolean isAuthorized) {
        super(isAuthorized);
    }

    @Override
    public void printMessage() {
        StringBuilder messageBuilder = new StringBuilder("---FEATURED---\n");
        messageBuilder
                .append("Mellow Morning\n")
                .append("Wake Up and Smell the Coffee\n")
                .append("Monday Motivation\n")
                .append("Songs to Sing in the Shower\n");
        System.out.println(messageBuilder);
    }
}
