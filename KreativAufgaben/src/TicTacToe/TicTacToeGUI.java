package TicTacToe;

import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToeGUI {

    private static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private static JButton[] buttons = new JButton[9];
    private static Random rand = new Random();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 60));
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(new ButtonClickListener(i));
            frame.add(buttons[i]);
        }

        frame.setVisible(true);
    }

    private static class ButtonClickListener implements ActionListener {
        private int index;

        public ButtonClickListener(int index) {
            this.index = index;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (buttons[index].getText().equals("") && !isGameFinished(board)) {
                buttons[index].setText("X");
                placeMove(board, Integer.toString(index + 1), 'X');
                if (!isGameFinished(board)) {
                    computerTurn();
                }
            }
        }
    }

    private static void computerTurn() {
        int computerMove;
        while (true) {
            computerMove = rand.nextInt(9);
            if (buttons[computerMove].getText().equals("")) {
                buttons[computerMove].setText("O");
                placeMove(board, Integer.toString(computerMove + 1), 'O');
                break;
            }
        }
    }

    private static boolean isGameFinished(char[][] board) {
        if (hasConstantWon(board, 'X')) {
            JOptionPane.showMessageDialog(null, "Player wins!");
            return true;
        }
        if (hasConstantWon(board, 'O')) {
            JOptionPane.showMessageDialog(null, "Computer wins!");
            return true;
        }
        boolean isTie = true;
        for (JButton button : buttons) {
            if (button.getText().equals("")) {
                isTie = false;
                break;
            }
        }
        if (isTie) {
            JOptionPane.showMessageDialog(null, "The game ended in a tie!");
            return true;
        }
        return false;
    }

    private static boolean hasConstantWon(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }

    private static void placeMove(char[][] board, String position, char symbol) {
        int pos = Integer.parseInt(position) - 1;
        board[pos / 3][pos % 3] = symbol;
    }
}

