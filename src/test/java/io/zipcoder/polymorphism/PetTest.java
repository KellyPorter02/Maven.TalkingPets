package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void setNameTest() {
        // Arrange
        Pet testPet = new Pet("Leon");
        // Act
        testPet.setName("Bridges");
        String returnedName = testPet.getName();
        // Assert
        Assert.assertEquals("Bridges", returnedName);
    }

    @Test
    public void getNameTest() {
        // Arrange
        Pet testPet = new Pet("Leon");
        // Act
        String returnedName = testPet.getName();
        // Assert
        Assert.assertEquals("Leon", returnedName);
    }

    @Test
    public void constructorTestName() {
        // Arrange
        String givenName = "Leon";
        Pet testPet = new Pet(givenName);
        // Act
        String returnedName = testPet.getName();
        // Assert
        Assert.assertEquals(givenName, returnedName);
    }


    @Test
    public void speakTest() {
        // Arrange
        Pet testPet = new Pet("Leon");
        // Act
        String speakString = testPet.speak();
        // Assert
        Assert.assertEquals("animal noises", speakString);
    }
}