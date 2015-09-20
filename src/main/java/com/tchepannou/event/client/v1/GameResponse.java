package com.tchepannou.event.client.v1;

public class GameResponse {
    //-- Attributes
    private String opponent;
    private Integer score1;
    private Integer score2;
    private String jerseyColor;
    private Boolean home;
    private Boolean overtime;
    private String outcome;
    private Integer duration;


    //-- Getter/Setter
    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public String getJerseyColor() {
        return jerseyColor;
    }

    public void setJerseyColor(String jerseyColor) {
        this.jerseyColor = jerseyColor;
    }

    public Boolean getHome() {
        return home;
    }

    public void setHome(Boolean home) {
        this.home = home;
    }

    public Boolean getOvertime() {
        return overtime;
    }

    public void setOvertime(Boolean overtime) {
        this.overtime = overtime;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
