package com.blockpuzzle;

import javax.swing.SwingUtilities;

/**
 * Main entry point for the Block Puzzle Game
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameWindow window = new GameWindow();
            window.setVisible(true);
        });
    }
}
