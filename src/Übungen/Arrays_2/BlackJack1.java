package Übungen.Arrays_2;

import java.util.Arrays;

public class BlackJack1 {
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


        int[][] spiel = {{17, 21, 23, 18},{21, 26, 15, 18},};
        /* int spieler = 2;
        int games = 4;
        int [][] spiel = new int[spieler][games];
        */

        System.out.println(Arrays.toString(blackJackWinner(spiel)));



    }

    public static int[] blackJackWinner (int[][] spiel) {

        int [] gewonneneSpiele = new int[spiel[0].length];
        int winnerPoint = 0;

        for (int rowPlayer = 0; rowPlayer < spiel.length - 1; rowPlayer++) {
            for (int colSpiele = 0; colSpiele < spiel[rowPlayer].length; colSpiele++) {
                if (spiel[rowPlayer][colSpiele] == spiel[rowPlayer + 1][colSpiele]){
                    winnerPoint = 0;
                }
                else if (spiel[rowPlayer][colSpiele] > 21){
                    winnerPoint = 0;
                }
                else if (spiel[rowPlayer][colSpiele] > spiel[rowPlayer + 1][colSpiele]){
                    winnerPoint = 1;
                }
            }

        }
        return spiel[winnerPoint];
    }

}
