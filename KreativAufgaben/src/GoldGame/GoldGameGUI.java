package GoldGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import Schach.Punkt2D;
import java.util.Random;

public class  GoldGameGUI {

    Random random = new Random();
    Punkt2D snake;
    Punkt2D player;
    Punkt2D gold;
    Punkt2D door;
    boolean gotTheGold = false;
    JButton[][] buttons = new JButton[10][40];
    boolean play = true;

    public static void main(String[] args) {
        new GoldGameGUI().startGame();
    }

    private void startGame() {
        snake = new Punkt2D(random.nextInt(39), random.nextInt(9));
        player = new Punkt2D(random.nextInt(39), random.nextInt(9));
        gold = new Punkt2D(random.nextInt(39), random.nextInt(9));
        door = new Punkt2D(random.nextInt(39), random.nextInt(9));

        JFrame frame = new JFrame("GoldGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new GridLayout(10, 40));

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 40; x++) {
                buttons[y][x] = new JButton(" ");
                buttons[y][x].setFont(new Font("Segoe UI Emoji", Font.PLAIN, 25));
                buttons[y][x].setFocusPainted(false);
                frame.add(buttons[y][x]);
            }
        }

        updateBoard();
        frame.setVisible(true);

        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                char input = evt.getKeyChar();
                if (play) {
                    movePlayer(input);
                    updateBoard();
                    moveSnake();
                    updateBoard();
                    checkGameState();
                }
            }
        });

        frame.setFocusable(true);
    }

    private void updateBoard() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 40; x++) {
                buttons[y][x].setText(" ");
            }
        }

        buttons[player.y][player.x].setText("😊"); // Spieler
        buttons[snake.y][snake.x].setText("🐍"); // Schlange
        if (!gotTheGold) {
            buttons[gold.y][gold.x].setText("💰"); // Gold
        }
        buttons[door.y][door.x].setText("🚪"); // Tür
    }

    private void movePlayer(char direction) {
        if (direction == 'w' && player.y > 0) {
            player.y--;
        } else if (direction == 's' && player.y < 9) {
            player.y++;
        } else if (direction == 'a' && player.x > 0) {
            player.x--;
        } else if (direction == 'd' && player.x < 39) {
            player.x++;
        }
    }

    private void moveSnake() {
        if (player.x < snake.x) {
            snake.x--;
        } else if (player.x > snake.x) {
            snake.x++;
        } else if (player.y < snake.y) {
            snake.y--;
        } else if (player.y > snake.y) {
            snake.y++;
        }
    }

    private void checkGameState() {
        if (snake.equals(player)) {
            play = false;
            JOptionPane.showMessageDialog(null, "Game over");
            askToPlayAgain();
        } else if (player.equals(gold)) {
            gotTheGold = true;
            gold = new Punkt2D(-1, -1);
        } else if (player.equals(door) && gotTheGold) {
            play = false;
            JOptionPane.showMessageDialog(null, "You won the game");
            askToPlayAgain();
        }
    }

    private void askToPlayAgain() {
        int response = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again",
                JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            snake = new Punkt2D(random.nextInt(39), random.nextInt(9));
            player = new Punkt2D(random.nextInt(39), random.nextInt(9));
            gold = new Punkt2D(random.nextInt(39), random.nextInt(9));
            door = new Punkt2D(random.nextInt(39), random.nextInt(9));
            gotTheGold = false;
            play = true;
            updateBoard();
        } else {
            System.exit(0);
        }
    }
}



