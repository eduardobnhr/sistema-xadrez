package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMacth = new ChessMatch();
		
		while(true) {	
			try {
				UI.clearScreen();			
				UI.printBoard(chessMacth.getPieces());
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.println("Source: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = ChessMatch(source, target);
				}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}

	private static ChessPiece ChessMatch(ChessPosition source, ChessPosition target) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
