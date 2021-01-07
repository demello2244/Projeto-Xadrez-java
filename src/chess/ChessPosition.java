package chess;

import boardgame.Position;

public class ChessPosition {
<<<<<<< HEAD

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'A' || column > 'H' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from A1 to H8.");
=======
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if(column<'A' || column >'H' || row<0 || row>8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values arte from A1 to H8");
>>>>>>> 605590c79a44198c7be2039daa1897b71b7964d2
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
<<<<<<< HEAD

	protected Position toPosition() {
		return new Position(8 - row, column - 'A');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('A' - position.getColumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + column + row;
	}
=======
	
	protected Position toPosition() {
		return new Position(8-row, column -'A');
		
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a'-position.getColumn()), 8-position.getRow());
	}
	
	@Override
	public String toString() {
		return ""+column+row;
	}

>>>>>>> 605590c79a44198c7be2039daa1897b71b7964d2
}
