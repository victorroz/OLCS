package com.company;

public class ReadyPlayer {
    private static int id;
    private String fullname;
    private String username;
    private String subscriptionType = "Ready Subscription";
    private int gamePoints = 0;
    private String playerTier = "Bronze";
    private int readyCoins = 0;
    private int eliteCoins = 0;

    public ReadyPlayer(String fullname, String username) {
        this.id = ++id;
        this.fullname = fullname;
        this.setUsername(username);
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = "@" + username;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public int getGamePoints() {
        return gamePoints;
    }

    public void setGamePoints(int gamePoints) {
        this.gamePoints = gamePoints;
    }

    public String getPlayerTier() {
        return playerTier;
    }

    public void setPlayerTier(String playerTier) {
        this.playerTier = playerTier;
    }

    public int getReadyCoins() {
        return readyCoins;
    }

    public void setReadyCoins(int readyCoins) {
        this.readyCoins = readyCoins;
    }

    public int getEliteCoins() {
        return eliteCoins;
    }

    public void setEliteCoins(int eliteCoins) {
        this.eliteCoins += eliteCoins;
    }

    public void showInfo() {
        System.out.println("|----------PLAYER DATA----------|");
        System.out.println("Fullname: " + this.getFullname());
        System.out.println("Username: " + this.getUsername());
        System.out.println("Subscription Type: " + this.getSubscriptionType());
        System.out.println("Game Points: " + this.getGamePoints());
        System.out.println("Player Tier: " + this.getPlayerTier());
        System.out.println("Ready Coins: " + this.getReadyCoins());
        System.out.println("Elite Coins: " + this.getEliteCoins());
        System.out.println("|-------------------------------|\n");
    }

    public void playerTierTracker() {
        if(this.getGamePoints() >= 0 && this.getGamePoints() < 1000) {
            this.setPlayerTier("Bronze");
        }
        else if(this.getGamePoints() >= 1000 && this.getGamePoints() < 2000) {
            this.setPlayerTier("Silver");
        }
        else if(this.getGamePoints() >= 2000 && this.getGamePoints() < 3000) {
            this.setPlayerTier("Gold");
        }
        else if(this.getGamePoints() >= 3000 && this.getGamePoints() < 4000) {
            this.setPlayerTier("Diamond");
        }
        else {
            this.setPlayerTier("Platinum");
        }
    }

    public void buyEliteCoins(int eliteCoins) {
        if(this.getSubscriptionType() == "Elite Subscription") {
            this.setEliteCoins(eliteCoins);
        }
        else {
            System.out.println("Please get Elite Subscription before buying Elite Coins.\n");
        }
    }
}
