import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Pac Man");
                // frame.setVisible(true);
                frame.setSize(boardWidth, boardHeight);
                // frame.setLocationRelativeTo(null); // Causes NPE in CheerpJ
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                PacMan pacmanGame = new PacMan();
                frame.add(pacmanGame);
                frame.pack();
                pacmanGame.requestFocus();
                frame.setVisible(true);
            }
        });
    }
}
