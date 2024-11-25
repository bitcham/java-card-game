package collection.testE;

import java.util.Scanner;

public class CardGameMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Do you want to play the game?(Yes - any key, No - 'n')");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("n")){
                break;
            }

            Deck deck = new Deck();

            Player player1 = new Player("player1");
            Player player2 = new Player("player2");

            for(int i = 0; i < 5; i++){
                player1.drawCard(deck);
                player2.drawCard(deck);
            }

            player1.showHand();
            player2.showHand();
            
            Player winner = getWinner(player1, player2);

            if(winner != null){
                System.out.println(winner.getName() + " won!");
            } else {
                System.out.println("Draw");
            }

        }

        System.out.println("Game ends");
    }

    private static Player getWinner(Player player1, Player player2) {

        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if(sum1 > sum2){
            return  player1;
        } else if(sum1 == sum2){
            return  null;
        }else{
            return  player2;
        }
    }
}
