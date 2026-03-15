/**
* Title: lab2 Project Application class
*
* Description: AP CSA lab 2 project
- Understand programmer-defined classes
- Practice testing a programmer-defined class by writing an application class
- Practice debugging a programmer-defined class
- Write JavaDoc documentation to explain the individual parts of a programmer-defined class
*
* @author Shehrin Habib
*/
public class Lab2App {
    public static void main(String [] args){
        Card card1 = new Card(28);
        System.out.println(card1); //instantiated a new card with the value 28. displayed the reference address for card1
        //value and suit is not displayed because systemout prints the reference address for Objects IF the toString method is not called.
        
        int value1 = card1.getValue();
        String suit1 = card1.getSuit();
        System.out.println(value1);
        System.out.println(suit1);
        //these statements call the accessor methods on card1 and print them
        
        int pointValue = card1.getPointValue(false);
        System.out.println(pointValue);
        //these statements check the point value of the card. in this case, it is 2 (not J, Q, K).
        
        Card card2 = new Card(41);
        
        System.out.println("");
        System.out.println(card1.equalValue(card2)); // checks if the value of card1 == card2
        System.out.println(card1.equalSuit(card2)); //checks if the suit of card1 == card2
        System.out.println("The value is the same, the suits are different. \n");
        
        //this instantiates 4 new Card objects with different Values and Suits.
        Card c1 = new Card(14);
        Card c2 = new Card(26);
        Card c3 = new Card(38);
        Card c4 = new Card(50);
        
        System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4 + "\n");
        
        //39-42
        System.out.println(c1.getPointValue(true));
        System.out.println(c1.getPointValue(false));
        System.out.println(c3.getPointValue(true));
        System.out.println(c3.getPointValue(false));
        //this code shows the point values for c1 and c3 with aces both high and low
        
        if (c3.getValue() < c4.getValue()){
            System.out.println(c3 + " has a lower value than " + c4);
        }
        else{
            System.out.println(c4 + " has a lower value than " + c3);
        }
        //checks which of the cards has a lower value then prints a statement saying which card is lower in value.
    }
}
