import java.util.Scanner;
public class BlackJack{
    public static void main(String[] args) throws InterruptedException {
        Deck deck = new Deck();
        Scanner scan = new Scanner(System.in);
        
        int houseWins = 0;
        int playerWins = 0;
        int playAgain = 1;
        while(playAgain == 1){
        int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        System.out.println("The House is showing: " + houseTotal);

        while (playerTotal <= 21){
            Thread.sleep(300);
            System.out.println("Player is showing: " + playerTotal);
            System.out.println("Would you like to hit or stand?\n\tEnter 1 for hit or 0 for stand:");
            int choice = scan.nextInt();
            if(choice == 0){
                break;
            } else if (choice == 1){
                Card nextCard = deck.drawCard();
                Thread.sleep(800);
                System.out.println("Player draws the " + nextCard.declareCard());
                playerTotal += nextCard.getValue(true);
            } else {
                System.out.println("Invalid option, try again.");
            }
        }
        if (playerTotal > 21){
            Thread.sleep(400);
            System.out.println("The Player has busted!");
        } else {
            System.out.println("\n The Player stands with " + playerTotal + " points.");
            System.out.println("The House will play next.");
            Thread.sleep(500);
        }

        while (houseTotal < 17){
            Card nextHouseCard = deck.drawCard();
            System.out.println("House draws the " + nextHouseCard.declareCard());
            houseTotal += nextHouseCard.getValue(true);
        }
        if (houseTotal > 21){
            System.out.println("The House has busted!");
        } else {
            System.out.println("\n The House stands with " + houseTotal + " points.");
        }


        if((playerTotal > houseTotal) && (playerTotal <= 21)){
            System.out.println("The Player wins! House lost.");
            playerWins++;
            System.out.println("Number of wins for Player is: " + playerWins);
        } else if ((houseTotal > playerTotal) && (houseTotal <= 21)){
            System.out.println("The House wins! Player lost.");
            houseWins++;
            System.out.println("Number of wins for House is: " + houseWins);
        } else {
            System.out.println("The House and Player lost!");
            System.out.println("Number of wins for Player is: " + playerWins);
            System.out.println("Number of wins for House is: " + houseWins);

        }

        System.out.println("Do you want to play another round? Input '1' for yes, '0' for no.");
        playAgain = scan.nextInt();
        
    }
        scan.close();

    }
}