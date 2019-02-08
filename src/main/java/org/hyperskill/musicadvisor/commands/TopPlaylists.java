package org.hyperskill.musicadvisor.commands;

public class TopPlaylists extends Command {

    public TopPlaylists(boolean isAuthorized) {
        super(isAuthorized);
    }

    @Override
    public void printMessage() {
        StringBuilder messageBuilder = new StringBuilder("---TOP LISTS PLAYLISTS---\n");
        messageBuilder
                .append("Best music ever\n")
                .append("Crazy dance\n")
                .append("Hottest hits\n");
        System.out.println(messageBuilder);
    }
}
