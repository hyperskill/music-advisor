package org.hyperskill.musicadvisor.commands;

public class LatinPlaylists extends Command{

    public LatinPlaylists(boolean isAuthorized) {
        super(isAuthorized);
    }

    @Override
    public void printMessage() {
        StringBuilder messageBuilder = new StringBuilder("---LATIN PLAYLISTS---\n");
        messageBuilder
                .append("Latin hits\n")
                .append("New Latin music\n")
                .append("Best Latin music\n");
        System.out.println(messageBuilder);
    }
}
