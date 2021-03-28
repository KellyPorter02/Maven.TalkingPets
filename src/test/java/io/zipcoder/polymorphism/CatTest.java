package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void constructorTest() {
        // Arrange
        Pet testCat = new Cat("DaBaby");
        // Act
        String returnedName = testCat.getName();
        // Assert
        Assert.assertEquals("DaBaby", returnedName);
    }

    @Test
    public void getNameTest() {
        // Arrange
        Pet testCat = new Cat("DaBaby");
        // Act
        String returnedName = testCat.getName();
        // Assert
        Assert.assertEquals("DaBaby", returnedName);
    }

    @Test
    public void setNameTest() {
        // Arrange
        Pet testCat = new Cat("DaBaby");
        // Act
        testCat.setName("Bridges");
        String returnedName = testCat.getName();
        // Assert
        Assert.assertEquals("Bridges", returnedName);
    }

    @Test
    public void speakTest() {
        // Arrange
        Pet testCat = new Cat("DaBaby");
        // Act
        String speakString = testCat.speak();
        // Assert
        Assert.assertEquals("Meow", speakString);
    }
}