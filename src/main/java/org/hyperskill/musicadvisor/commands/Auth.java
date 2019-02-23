package org.hyperskill.musicadvisor.commands;

public class Auth {
    private static final String clientId = "2cbc4ced003f4fc895a890f1b94ab6ff";
    private static final String redirectUri = "https://www.example.com";
    private static final String responseType = "code";

    public boolean logIn() {
        String request = makeRequest();
        System.out.println(request);
        System.out.println("---SUCCESS---");
        return true;
    }

    private String makeRequest() {
        String request = "https://accounts.spotify.com/authorize" +
                "?client_id=" +
                clientId +
                "&redirect_uri=" +
                redirectUri +
                "&response_type=" +
                responseType;
        return request;
    }
}
