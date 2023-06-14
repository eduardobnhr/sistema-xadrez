package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("teste");
		System.out.println("relative");
		ChessMatch chessMacth = new ChessMatch();
		UI.printBoard(chessMacth.getPieces());
		
	}
}
