public enum ChessPiece {
	
	WhitePawn(1,0),
	WhiteRook(2,0),
	WhiteKnight(3,0),
	WhiteBishop(4,0),
	WhiteQueen(5,0),
	WhiteKing(6,0),
	BlackPawn(1,1),
	BlackRook(2,1),
	BlackKnight(3,1),
	BlackBishop(4,1),
	BlackQueen(5,1),
	BlackKing(6,1);
	
	private final int type;
	private final int color;
	private boolean hasMoved;
	
	private ChessPiece(int type, int color){
		this.type = type;
		this.color = color;
		hasMoved = false;
	}
	
	public int getType(){
		return type;
	}
	
	public int getColor(){
		return color;
	}
	
	public boolean getHasMoved(){
		return hasMoved;
	}
	
	public void moved(){
		hasMoved = true;
	}
}