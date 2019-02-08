package org.hyperskill.musicadvisor.commands;

public class PopPlaylists extends Command {

    public PopPlaylists(boolean isAuthorized) {
        super(isAuthorized);
    }

    @Override
    public void printMessage() {
        StringBuilder messageBuilder = new StringBuilder("---POP PLAYLISTS---\n");
        messageBuilder
                .append("Pop hits\n")
                .append("New pop\n")
                .append("Best pop\n");
        System.out.println(messageBuilder);
    }
}
