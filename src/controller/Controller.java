/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.Random;
import model.gamequeue.Player;
import model.gamequeue.PlayerQueue;
//import model.mylist.Node;
import model.quiz.Quiz;
import model.quiz.QuizList;
import util.InputUtils;

/**
 *
 * @author nhss
 *
 * game nhỏ để test các chức năng của circular linked list (game queue)
 *
 */
public class Controller {

    QuizList ql = new QuizList();
    static final int NUMBER_OF_SECTION = 3;

    public Controller() {
        ql.addQuiz();
    }

    public void startGame(Player player) {
        System.out.println("Welcome, " + player.getName() + "!");
        System.out.println("Try to solve the quiz to discover your math ability! ");
        System.out.println("Answer 3 question each section. For every right answer you get 3 points and minus 1 points for wrong answer.");
        System.out.printf("One having the highest points after %d section is the winner.\n", NUMBER_OF_SECTION);
    }

    public void playGame(Player player) {
        Random rd = new Random();
        for (int i = 0; i < 3; i++) {
            int a = rd.nextInt(ql.MAX_QUESTION);
            Quiz q = ql.getQuizList().get(a);
            System.out.println("\n" + q.getQues());
            System.out.print("\nEnter your answer: ");
            int an = InputUtils.inputInt();
            if (an == q.getAns()) {
                player.upPoint();
                System.out.println("Congratulation! You get 3 points!");
            } else {
                player.downPoint();
                System.out.println("Incorrect!\n");
            }
            player.toString();
            System.out.println("");
        }
    }

    public void endTurn(PlayerQueue plq) {
        plq.displayList();
        System.out.println("End turn. Wait to next section. ");
        System.out.println("===================================\n\n");
    }

    public static void main(String[] args) {
        Controller ct = new Controller();
        PlayerQueue gameQueue = new PlayerQueue();
        System.out.println("Enter number of player (max = 5): ");
        int n = InputUtils.inputOption(0, 5);
        for (int i = 0; i < n; i++) {
            QueueManagement.addPlayer(gameQueue);
        }

        for (int i = 0; i < NUMBER_OF_SECTION; i++) {
            for (int j = 0; j < n; j++) {
                Player currentPlayer = QueueManagement.dequeuee(gameQueue);

                ct.startGame(currentPlayer);
                ct.playGame(currentPlayer);
                QueueManagement.enqueue(gameQueue, currentPlayer);
                ct.endTurn(gameQueue);
            }
            

            
        }
        gameQueue.displayList();
        System.out.print("\n\nTHE WINNER IS:   ");
        List<Player> hg = gameQueue.getHighest();
        for (Player pl : hg){
            System.out.print( pl.getName().toUpperCase() + "    ");
        }

    }
}
