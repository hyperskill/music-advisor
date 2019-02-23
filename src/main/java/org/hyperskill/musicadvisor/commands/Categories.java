package org.hyperskill.musicadvisor.commands;

public class Categories extends Command{
    public Categories(boolean isAuthorized) {
        super(isAuthorized);
    }

    @Override
    public void printMessage() {
        StringBuilder messageBuilder = new StringBuilder("---CATEGORIES---\n");
        messageBuilder
                .append("Top Lists\n")
                .append("Pop\n")
                .append("Mood\n")
                .append("Latin\n");
        System.out.println(messageBuilder);
    }
}
