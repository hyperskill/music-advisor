package org.hyperskill.musicadvisor.commands;

public class NewReleases extends Command{

    public NewReleases(boolean isAuthorized) {
        super(isAuthorized);
    }

    @Override
    public void printMessage() {
        StringBuilder messageBuilder = new StringBuilder("---NEW RELEASES---\n");
        messageBuilder
                .append("Mountains   [Sia, Diplo, Labrinth]\n")
                .append("Runaway [Lil Peep]\n")
                .append("The Greatest Show   [Panic! At The Disco]\n")
                .append("All Out Life    [Slipknot]\n");
        System.out.println(messageBuilder);
    }
}
