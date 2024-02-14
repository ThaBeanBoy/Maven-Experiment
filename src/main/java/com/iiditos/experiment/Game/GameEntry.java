package com.iiditos.experiment.Game;

import java.time.LocalDateTime;

public class GameEntry {
    private String name;
    private Integer score;
    private final LocalDateTime entryDateTime;

    public GameEntry(String name, int score, LocalDateTime entryDateTime){
        this.name = name;
        this.score = score;
        this.entryDateTime = entryDateTime;
    }

    public GameEntry(String name, int score){
        this(name, score, LocalDateTime.now());
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public Integer getScore(){
        return this.score;
    }

    public LocalDateTime getEntryDateTime(){
        return this.entryDateTime;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setScore(int score){
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("name: %s | score: %d", this.name, this.score);
    }
}
