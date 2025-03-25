package com.example.memorygame;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String suit;
    private String faceName;
    private Image customImage;

    public Card(String suit, String faceName) {
        setSuit(suit);
        setFaceName(faceName);
    }

    public String getSuit() {
        return suit;
    }

    public static List<String> getValidSuits() {
        return Arrays.asList("animal");
    }

    /**
     * valid suits are "animal"
     * 
     * @param suit
     */
    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        if (getValidSuits().contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " invalid, must be one of " + getValidSuits());
    }

    public String getFaceName() {
        return faceName;
    }

    public static List<String> getValidFaceNames() {
        return Arrays.asList("dog", "frog", "ladybug", "monkey", "penguin", "rabbit", "snail", "turtle");
    }

    /**
     * valid face names are
     * "dog", "frog", "ladybug", "monkey", "penguin", "rabbit", "snail", "turtle"
     * 
     * @param faceName
     */
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        if (getValidFaceNames().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " is invalid, must be one of " + getFaceName());
    }

    public String toString() {
        return faceName + " of " + suit;
    }

    public String getColour() {
        if (suit.equals("animal"))
            return "red";
        else
            return "black";
    }

    /**
     * This method will return the value of the card
     * [ "dog", "frog", "ladybug", "monkey", "penguin", "rabbit", "snail", "turtle"]
     * 0 1 2 3 4 .... 11 12
     * +2
     *
     */
    public int getValue() {
        return getValidFaceNames().indexOf(faceName) + 2;
    }

    /**
     * This method will return an Image that represents the Card
     */

    public void setCustomImage(Image customImage) {
        this.customImage = customImage;
    }

    public Image getCustoImage() {
        return customImage;
    }

    public Image getImage() {
        if (customImage != null) {
            return customImage;
        }
        String pathName = "images/" + faceName + "_of_" + suit + ".png";
        return new Image(Card.class.getResourceAsStream(pathName));
    }

    public Image getBackOfCardImage() {
        return new Image(Card.class.getResourceAsStream("images/back_of_card.png"));
    }

}
