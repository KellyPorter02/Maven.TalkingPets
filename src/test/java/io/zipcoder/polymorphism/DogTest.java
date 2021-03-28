package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void constructorTest() {
        // Arrange
        Pet testDog = new Dog("");
        // Act
        String returnedName = testDog.getName();
        // Assert
        Assert.assertEquals("", returnedName);
    }

    @Test
    public void getNameTest() {
        // Arrange
        Pet testDog = new Dog("Rover");
        // Act
        String returnedName = testDog.getName();
        // Assert
        Assert.assertEquals("Rover", returnedName);
    }

    @Test
    public void setNameTest() {
        // Arrange
        Pet testDog = new Dog("Rover");
        // Act
        testDog.setName("Bridges");
        String returnedName = testDog.getName();
        // Assert
        Assert.assertEquals("Bridges", returnedName);
    }

    @Test
    public void speakTest() {
        // Arrange
        Pet testDog = new Dog("Rover");
        // Act
        String speakString = testDog.speak();
        // Assert
        Assert.assertEquals("Woof!", speakString);
    }
}
