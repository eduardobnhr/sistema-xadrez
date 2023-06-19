package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMacth = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMacth.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.println("Source: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = ChessMatch(source, target);
		}
			
	}

	private static ChessPiece ChessMatch(ChessPosition source, ChessPosition target) {
		// TODO Auto-generated method stub
		return null;
	}
}
