package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void constructorTest() {
        // Arrange
        Pet testHorse = new Horse("Black Beauty");
        // Act
        String returnedName = testHorse.getName();
        // Assert
        Assert.assertEquals("Black Beauty", returnedName);
    }

    @Test
    public void getNameTest() {
        // Arrange
        Pet testHorse = new Horse("Black Beauty");
        // Act
        String returnedName = testHorse.getName();
        // Assert
        Assert.assertEquals("Black Beauty", returnedName);
    }

    @Test
    public void setNameTest() {
        // Arrange
        Pet testHorse = new Horse("Black Beauty");
        // Act
        testHorse.setName("Bridges");
        String returnedName = testHorse.getName();
        // Assert
        Assert.assertEquals("Bridges", returnedName);
    }

    @Test
    public void speakTest() {
        // Arrange
        Pet testHorse = new Horse("Black Beauty");
        // Act
        String speakString = testHorse.speak();
        // Assert
        Assert.assertEquals("Neigh", speakString);
    }
}
