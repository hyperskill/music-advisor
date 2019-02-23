package org.hyperskill.musicadvisor;

import org.hyperskill.musicadvisor.commands.*;

import java.util.Scanner;

public class Menu {
    private boolean workInProcess;
    private boolean isAuthorized;

    public Menu() {
        workInProcess = true;
        isAuthorized = false;
        work();
    }

    private void work() {
        System.out.println("Welcome to the App!");
        listCommands();
        while(workInProcess) {
            String command = getCommand();
            executeCommand(command);
        }
    }

    private void listCommands() {
        StringBuilder messageBuilder = new StringBuilder("Here are the available commands:\n");
        messageBuilder
                .append("auth - command that will print the auth link and allows us to use another command\n")
                .append("featured - list of Spotify featured playlists with their links fetched from API\n")
                .append("new - list of new albums with artists and links on Spotify\n")
                .append("categories - list of all available categories on Spotify (just their names)\n")
                .append("playlists C_NAME,  where C_NAME – name of category. List contains playlists of" +
                        " this category and their links on Spotify\n")
                .append("exit - shut down application\n");
        System.out.println(messageBuilder);
    }

    private String getCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease, type the command");
        return scanner.nextLine();
    }

    private void executeCommand(String command) {
        switch (command) {
            case "auth" : isAuthorized = new Auth().logIn(); break;
            case "new" : new NewReleases(isAuthorized); break;
            case "featured" : new Featured(isAuthorized); break;
            case "categories" : new Categories(isAuthorized); break;
            case "playlists Mood" : new MoodPlaylists(isAuthorized); break;
            case "playlists Top Lists" : new TopPlaylists(isAuthorized); break;
            case "playlists Pop" : new PopPlaylists(isAuthorized); break;
            case "playlists Latin" : new LatinPlaylists(isAuthorized); break;
            case "exit" : {
                workInProcess = false;
                System.out.println("Thanks for using, see you!");
                break;
            }
            default:
                System.out.println("Command not existed");
        }
    }
}
