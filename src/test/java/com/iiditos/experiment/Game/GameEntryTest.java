package com.iiditos.experiment.Game;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class GameEntryTest {
    private final String name = "John Doe";
    private final int score = 230;
    private final LocalDateTime dateTime = LocalDateTime.now();
    
    // Testing getters
    @Test
    public void GetName(){
        GameEntry TestGameEntry = new GameEntry(this.name, this.score, this.dateTime);
        assertEquals(this.name, TestGameEntry.getName());
    }
    
    @Test
    public void GetScore(){
        GameEntry TestGameEntry = new GameEntry(this.name, this.score, this.dateTime);
        assertEquals(this.score, TestGameEntry.getScore());
    }
    
    @Test
    public void GetDateTime(){
        GameEntry TestGameEntry = new GameEntry(this.name, this.score, this.dateTime);
        assertEquals(this.dateTime, TestGameEntry.getEntryDateTime());
    }
    
    // Testing setters
    @Test
    public void SetName(){
        GameEntry TestGameEntry = new GameEntry(this.name, this.score, this.dateTime);
        
        String newName = "Jane Doe";
        TestGameEntry.setName(newName);

        assertEquals(newName, TestGameEntry.getName());
    }

    @Test
    public void SetScore(){
        GameEntry TestGameEntry = new GameEntry(this.name, this.score, this.dateTime);

        int newScore = 560;
        TestGameEntry.setScore(newScore);

        assertEquals(newScore, TestGameEntry.getScore());
    }

    @Test
    public  void ToString(){
        GameEntry TestGameEntry = new GameEntry(this.name, this.score, this.dateTime);

        assertEquals(String.format("name: %s | score: %d", this.name, this.score), TestGameEntry.toString());
    }
}
