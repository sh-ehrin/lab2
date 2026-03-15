/**
* Title: lab2 Project programmer-defined class
*
* Description: AP CSA lab 2 project
- Understand programmer-defined classes
- Practice testing a programmer-defined class by writing an application class
- Practice debugging a programmer-defined class
- Write JavaDoc documentation to explain the individual parts of a programmer-defined class
*
* @author Shehrin Habib
*/
public class Card{
    //instance variables
    private int value; //the number assigned to each card
    private String suit; //the symbol assigned to each card
    
/**
* parameterized Card constructor
* the constructor initializes the newly created card using the number sent to it
* @param num a number between 0 and 51 which will be converted to a value between
* 1 and 13 and one of the suits
*/
    public Card(int num){
    value = num % 13;
    if (value == 0){
        value = 13;
    }
    int suitNumber = num / 13;
    if (suitNumber == 0){
        suit = new String("clubs");
    }
    else if (suitNumber == 1){
        suit = new String("diamonds");
    }
    else if (suitNumber == 2){
        suit = new String("hearts");
    }
    else if (suitNumber == 3){
        suit = new String("spades");
    }
    else
        suit = new String("ERROR");
    }
    
    public String toString(){
        if (this.value == 11){
            return "Jack of " + suit;
        }
        else if (this.value == 12){
            return "Queen of " + suit;
        }
        else if (this.value == 13){
            return "King of " + suit;
        }
        else if (this.value == 1){
            return "Ace of " + suit;
        }
        else{
            return "" + value + " of " + suit;
        }
    }
    
    public int getValue(){
        return value;
    }
    
    public String getSuit(){
        return suit;
    }
    //no mutator methods because you never manually change the value or suit of a card.
    
    //If a card is valued 11-13 (jack, queen king) return 10 points. else, return number value.
    public int getPointValue(boolean high){
        if (value >= 11){
            return 10;
        }
        if (high && value == 1){
            return 11;
        }
        else{
            return value;
        }
    }
    
    //check if the values of two cards are equal
    public boolean equalValue(Card c1){
        if (this.value == c1.value){
            return true;
        }
        else{
            return false;
        }
    }
    
    //checks if the suits of two cards are equal
    public boolean equalSuit(Card c1){
        if (this.suit.equals(c1.suit)){
            return true;
        }
        else{
            return false;
        }
    }
}