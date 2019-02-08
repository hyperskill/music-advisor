package org.hyperskill.musicadvisor.commands;

public class MoodPlaylists extends Command {

    public MoodPlaylists(boolean isAuthorized) {
        super(isAuthorized);
    }

    @Override
    public void printMessage() {
        StringBuilder messageBuilder = new StringBuilder("---MOOD PLAYLISTS---\n");
        messageBuilder
                .append("Walk Like A Badass \n")
                .append("Rage Beats\n")
                .append("Arab Mood Booster\n")
                .append("Sunday Stroll\n");
        System.out.println(messageBuilder);
    }
}
