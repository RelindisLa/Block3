package Übungen.Arrays_2;

public class BlackJackDemo {

    /*
    Blackjack game - so the goal is to have the hightest number
    but not higher than 21
    so write a method blackjackWinner who gets a 2 dim array as a parameter
    you should calculate for every game who is the winner
    return value: an array which counts how often every player has won
    in the fist game player 2 would have won -> this means the counter of the
    returning array should be like that {0, 1, 0, 0}
    assume: every row has the same length and we do not know how many rows
    if it is a draw -> nobody gets a point for winning
     */

    public static void main(String[] args) {

        int player = 2;
        int anzahlSpiele = 3;
        System.out.println(blackJackWinnerIs(1,3));

        System.out.println(isWinner(2));



    }

    public static int blackJackWinnerIs (int player, int anzahlSpiele){
        int spiel[][] = new int[player][anzahlSpiele];
        int winner = 0;


        for (int rowPlayer = 0; rowPlayer < spiel.length; rowPlayer++) {
            for (int colSpiele = 0; colSpiele < spiel[rowPlayer].length; colSpiele++ ) {
                System.out.println(spiel[rowPlayer][colSpiele]);








            }
            System.out.println("--");
        }
        return 0;
    }


    public static int isWinner (int spieler) {
        int winner = 0;
        double zufall = (Math.random()) % 14;

        for (int cards = 0; cards < 13; cards++) {
            for (int counter = 0; counter < 21; counter++) {
                if (zufall*cards > counter){
                    System.out.println(zufall);
                    return winner = 0;
                }
                else return 1;
            }

        }
        return winner;
    }

}
