package TTT;

public class Board {
  static void initialize() {
    System.out.println("""
        Tic-Tac-Toe!

        Rules:
        YOU are "X";
        The COMPUTER is "O";
        3 consecutive adjacent square horizontally, vertically, diagonally = win
        """);
  }

  static void draw() {
    System.out.println();
  }
}
