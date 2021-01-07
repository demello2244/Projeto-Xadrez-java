package chess;

import boardgame.Board;
import chess.peaces.King;
import chess.peaces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		InitialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
<<<<<<< HEAD
	private void InitialSetup(){
		placeNewPiece('B', 6, new Rook(board, Color.WHITE));
		placeNewPiece('E', 8, new King(board, Color.BLACK));
		placeNewPiece('E', 1, new King(board, Color.WHITE));		
=======
	
	private void InitialSetup(){
		placeNewPiece('A', 8, new Rook(board, Color.WHITE));
		placeNewPiece('H', 8, new Rook(board, Color.WHITE));
		placeNewPiece('A', 1, new Rook(board, Color.BLACK));
		placeNewPiece('H', 1, new Rook(board, Color.BLACK));
		placeNewPiece('E', 8, new King(board, Color.WHITE));
		placeNewPiece('E', 1, new King(board, Color.BLACK));			
>>>>>>> 605590c79a44198c7be2039daa1897b71b7964d2
	}

}
