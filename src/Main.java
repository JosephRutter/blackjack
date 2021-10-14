

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variable declaration
        boolean playAgain = true;
        Scanner input = new Scanner(System.in);
        int dealerNum = 0;
        int playerNum = 0;
        Boolean anotherCard ;

        while (playAgain) {
          playerNum = 0;
          dealerNum = 0;
            anotherCard = true;
            dealerNum = (int) (dealerNum + (Math.random() * 11-1) + 1);
            dealerNum = (int) (dealerNum + (Math.random() * 10-1) + 1);
            playerNum = (int) (playerNum + (Math.random() * 11-1) + 1);
            playerNum = (int) (playerNum + (Math.random() * 10-1) + 1);
            System.out.println("your card value is " + playerNum);
            if (dealerNum == 21 || dealerNum == 21 && playerNum == 21) {
                System.out.println("dealer got blackjack !, you automatically lose");
                System.out.println("play again? (true = yes) (false = no)");
                playAgain = input.nextBoolean();
            } else if (playerNum == 21) {
                System.out.println("you were dealt blackjack! , you automatically win");
                System.out.println("play again, (true = yes) (false = no)");
                playAgain = input.nextBoolean();
            } else {

                System.out.println("would you like another card? (true = yes) (false = no)");
                anotherCard = input.nextBoolean();
                while (anotherCard) {
                    playerNum = (int) (playerNum + (Math.random() * 11) + 1);
                    System.out.println("your new total is " + playerNum);
                    if (playerNum >= 21)
                    { anotherCard = false;}
                    else {
                        System.out.println("would you like another card? (true = yes) (false = no)");
                        anotherCard = input.nextBoolean();
                    }
                }
                 {
                    System.out.println("your final total is " + playerNum);
                    System.out.println("the dealer's total is " + dealerNum);
                    if (playerNum > 21){
                        System.out.println("you went bust! play again? (true = yes) (false = no)");
                        playAgain = input.nextBoolean();
                    }
                    else if(playerNum > dealerNum) {
                        System.out.println("you win! play again? (true = yes) (false = no)");
                        playAgain = input.nextBoolean();
                    }
                    else {
                        System.out.println("you lose! play again? (true = yes) (false = no)");
                        playAgain = input.nextBoolean();
                    }
                }
            }
        }
    }
}
