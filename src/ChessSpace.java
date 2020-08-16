import java.util.ArrayList;

import javax.swing.JButton;

public class ChessSpace {
	
	private int tileColor;
	private JButton button;
	private int[] pos;
	private int x;
	private int y;
	private ChessPiece piece;
	private static ArrayList<ChessSpace> spaces = new ArrayList<ChessSpace>();
	
	static ChessSpace a1 = new ChessSpace(1,ChessBoard.button_a1, new int[]{0,0}, ChessPiece.WhiteRook);
	static ChessSpace b1 = new ChessSpace(0,ChessBoard.button_b1, new int[]{1,0}, ChessPiece.WhiteKnight);
	static ChessSpace c1 = new ChessSpace(1,ChessBoard.button_c1, new int[]{2,0}, ChessPiece.WhiteBishop);
	static ChessSpace d1 = new ChessSpace(0,ChessBoard.button_d1, new int[]{3,0}, ChessPiece.WhiteQueen);
	static ChessSpace e1 = new ChessSpace(1,ChessBoard.button_e1, new int[]{4,0}, ChessPiece.WhiteKing);
	static ChessSpace f1 = new ChessSpace(0,ChessBoard.button_f1, new int[]{5,0}, ChessPiece.WhiteBishop);
	static ChessSpace g1 = new ChessSpace(1,ChessBoard.button_g1, new int[]{6,0}, ChessPiece.WhiteKnight);
	static ChessSpace h1 = new ChessSpace(0,ChessBoard.button_h1, new int[]{7,0}, ChessPiece.WhiteRook);
	
	static ChessSpace a2 = new ChessSpace(0,ChessBoard.button_a2, new int[]{0,1}, ChessPiece.WhitePawn);
	static ChessSpace b2 = new ChessSpace(1,ChessBoard.button_b2, new int[]{1,1}, ChessPiece.WhitePawn);
	static ChessSpace c2 = new ChessSpace(0,ChessBoard.button_c2, new int[]{2,1}, ChessPiece.WhitePawn);
	static ChessSpace d2 = new ChessSpace(1,ChessBoard.button_d2, new int[]{3,1}, ChessPiece.WhitePawn);
	static ChessSpace e2 = new ChessSpace(0,ChessBoard.button_e2, new int[]{4,1}, ChessPiece.WhitePawn);
	static ChessSpace f2 = new ChessSpace(1,ChessBoard.button_f2, new int[]{5,1}, ChessPiece.WhitePawn);
	static ChessSpace g2 = new ChessSpace(0,ChessBoard.button_g2, new int[]{6,1}, ChessPiece.WhitePawn);
	static ChessSpace h2 = new ChessSpace(1,ChessBoard.button_h2, new int[]{7,1}, ChessPiece.WhitePawn);

	static ChessSpace a3 = new ChessSpace(1,ChessBoard.button_a3, new int[]{0,2}, null);
	static ChessSpace b3 = new ChessSpace(0,ChessBoard.button_b3, new int[]{1,2}, null);
	static ChessSpace c3 = new ChessSpace(1,ChessBoard.button_c3, new int[]{2,2}, null);
	static ChessSpace d3 = new ChessSpace(0,ChessBoard.button_d3, new int[]{3,2}, null);
	static ChessSpace e3 = new ChessSpace(1,ChessBoard.button_e3, new int[]{4,2}, null);
	static ChessSpace f3 = new ChessSpace(0,ChessBoard.button_f3, new int[]{5,2}, null);
	static ChessSpace g3 = new ChessSpace(1,ChessBoard.button_g3, new int[]{6,2}, null);
	static ChessSpace h3 = new ChessSpace(0,ChessBoard.button_h3, new int[]{7,2}, null);
	
	static ChessSpace a4 = new ChessSpace(0,ChessBoard.button_a4, new int[]{0,3}, null);
	static ChessSpace b4 = new ChessSpace(1,ChessBoard.button_b4, new int[]{1,3}, null);
	static ChessSpace c4 = new ChessSpace(0,ChessBoard.button_c4, new int[]{2,3}, null);
	static ChessSpace d4 = new ChessSpace(1,ChessBoard.button_d4, new int[]{3,3}, null);
	static ChessSpace e4 = new ChessSpace(0,ChessBoard.button_e4, new int[]{4,3}, null);
	static ChessSpace f4 = new ChessSpace(1,ChessBoard.button_f4, new int[]{5,3}, null);
	static ChessSpace g4 = new ChessSpace(0,ChessBoard.button_g4, new int[]{6,3}, null);
	static ChessSpace h4 = new ChessSpace(1,ChessBoard.button_h4, new int[]{7,3}, null);
	
	static ChessSpace a5 = new ChessSpace(1,ChessBoard.button_a5, new int[]{0,4}, null);
	static ChessSpace b5 = new ChessSpace(0,ChessBoard.button_b5, new int[]{1,4}, null);
	static ChessSpace c5 = new ChessSpace(1,ChessBoard.button_c5, new int[]{2,4}, null);
	static ChessSpace d5 = new ChessSpace(0,ChessBoard.button_d5, new int[]{3,4}, null);
	static ChessSpace e5 = new ChessSpace(1,ChessBoard.button_e5, new int[]{4,4}, null);
	static ChessSpace f5 = new ChessSpace(0,ChessBoard.button_f5, new int[]{5,4}, null);
	static ChessSpace g5 = new ChessSpace(1,ChessBoard.button_g5, new int[]{6,4}, null);
	static ChessSpace h5 = new ChessSpace(0,ChessBoard.button_h5, new int[]{7,4}, null);
	
	static ChessSpace a6 = new ChessSpace(0,ChessBoard.button_a6, new int[]{0,5}, null);
	static ChessSpace b6 = new ChessSpace(1,ChessBoard.button_b6, new int[]{1,5}, null);
	static ChessSpace c6 = new ChessSpace(0,ChessBoard.button_c6, new int[]{2,5}, null);
	static ChessSpace d6 = new ChessSpace(1,ChessBoard.button_d6, new int[]{3,5}, null);
	static ChessSpace e6 = new ChessSpace(0,ChessBoard.button_e6, new int[]{4,5}, null);
	static ChessSpace f6 = new ChessSpace(1,ChessBoard.button_f6, new int[]{5,5}, null);
	static ChessSpace g6 = new ChessSpace(0,ChessBoard.button_g6, new int[]{6,5}, null);
	static ChessSpace h6 = new ChessSpace(1,ChessBoard.button_h6, new int[]{7,5}, null);
	
	static ChessSpace a7 = new ChessSpace(1,ChessBoard.button_a7, new int[]{0,6}, ChessPiece.BlackPawn);
	static ChessSpace b7 = new ChessSpace(0,ChessBoard.button_b7, new int[]{1,6}, ChessPiece.BlackPawn);
	static ChessSpace c7 = new ChessSpace(1,ChessBoard.button_c7, new int[]{2,6}, ChessPiece.BlackPawn);
	static ChessSpace d7 = new ChessSpace(0,ChessBoard.button_d7, new int[]{3,6}, ChessPiece.BlackPawn);
	static ChessSpace e7 = new ChessSpace(1,ChessBoard.button_e7, new int[]{4,6}, ChessPiece.BlackPawn);
	static ChessSpace f7 = new ChessSpace(0,ChessBoard.button_f7, new int[]{5,6}, ChessPiece.BlackPawn);
	static ChessSpace g7 = new ChessSpace(1,ChessBoard.button_g7, new int[]{6,6}, ChessPiece.BlackPawn);
	static ChessSpace h7 = new ChessSpace(0,ChessBoard.button_h7, new int[]{7,6}, ChessPiece.BlackPawn);
	
	static ChessSpace a8 = new ChessSpace(0,ChessBoard.button_a8, new int[]{0,7}, ChessPiece.BlackRook);
	static ChessSpace b8 = new ChessSpace(1,ChessBoard.button_b8, new int[]{1,7}, ChessPiece.BlackKnight);
	static ChessSpace c8 = new ChessSpace(0,ChessBoard.button_c8, new int[]{2,7}, ChessPiece.BlackBishop);
	static ChessSpace d8 = new ChessSpace(1,ChessBoard.button_d8, new int[]{3,7}, ChessPiece.BlackQueen);
	static ChessSpace e8 = new ChessSpace(0,ChessBoard.button_e8, new int[]{4,7}, ChessPiece.BlackKing);
	static ChessSpace f8 = new ChessSpace(1,ChessBoard.button_f8, new int[]{5,7}, ChessPiece.BlackBishop);
	static ChessSpace g8 = new ChessSpace(0,ChessBoard.button_g8, new int[]{6,7}, ChessPiece.BlackKnight);
	static ChessSpace h8 = new ChessSpace(1,ChessBoard.button_h8, new int[]{7,7}, ChessPiece.BlackRook);
	
	public ChessSpace(int tileColor, JButton button, int[] pos, ChessPiece piece){
		this.tileColor = tileColor;
		this.button = button;
		this.pos = pos;
		this.x = pos[0];
		this.y = pos[1];
		this.piece = piece;
		spaces.add(this);
	}
	
	public int getTileColor(){
		return tileColor;
	}
	
	public JButton getButton(){
		return button;
	}
	
	public static ArrayList<ChessSpace> getList(){
		return spaces;
	}
	
	public int[] getPos(){
		return pos;
	}
	
	public ChessPiece getPiece(){
		return piece;
	}
	
	public void setPiece(ChessPiece p){
		piece = p;
	}
	
	public static ChessSpace findSpace(int[] pos){
		for(ChessSpace s: spaces){
			if(s.pos[0] == pos[0] && s.pos[1] == pos[1]){
				return s;
			}
		}
		return null;
	}
	
	public boolean emptyOrEnemy(ChessSpace s){
		if(s.getPiece() == null){
			return true;
		}else if(s.getPiece().getColor() != this.getPiece().getColor()){
			return true;
		}
		return false;
	}
	
	public ArrayList<int[]> getBlackPawnMovement(){
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		int[] r1 = {x,y-1};
		int[] r2 = {x,y-2};
		int[] r3 = {x-1,y-1};
		int[] r4 = {x+1,y-1};
		
		if(findSpace(r1).getPiece() == null){
			list.add(r1);
			if(pos[1] == 6 && findSpace(r2).getPiece() == null){
				list.add(r2);
			}
		}
		if(x-1 > -1 && findSpace(r3).getPiece() != null && findSpace(r3).getPiece().getColor() == 0){
			list.add(r3);
		}
		if(x+1 < 8 && findSpace(r4).getPiece() != null && findSpace(r4).getPiece().getColor() == 0){
			list.add(r4);
		}
		return list;
	}
	
	public ArrayList<int[]> getWhitePawnMovement(){
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		int[] r1 = {x,y+1};
		int[] r2 = {x,y+2};
		int[] r3 = {x-1,y+1};
		int[] r4 = {x+1,y+1};
		
		if(findSpace(r1).getPiece() == null){
			list.add(r1);
			if(pos[1] == 1 && findSpace(r2).getPiece() == null){
				list.add(r2);
			}
		}
		if(x-1 > -1 && findSpace(r3).getPiece() != null && findSpace(r3).getPiece().getColor() == 1){
			list.add(r3);
		}
		if(x+1 < 8 && findSpace(r4).getPiece() != null && findSpace(r4).getPiece().getColor() == 1){
			list.add(r4);
		}
		return list;
	}
	
	public ArrayList<int[]> getRookMovement(){
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		for(int i = x+1; i < 8; i++){
			if(findSpace(new int[]{i,y}).getPiece() == null){
				list.add(new int[]{i,y});
			}else if(findSpace(new int[]{i,y}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,y});
				break;
			}else{
				break;
			}
		}
		for(int i = x-1; i > -1; i--){
			if(findSpace(new int[]{i,y}).getPiece() == null){
				list.add(new int[]{i,y});
			}else if(findSpace(new int[]{i,y}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,y});
				break;
			}else{
				break;
			}
		}
		for(int i = y+1; i < 8; i++){
			if(findSpace(new int[]{x,i}).getPiece() == null){
				list.add(new int[]{x,i});
			}else if(findSpace(new int[]{x,i}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{x,i});
				break;
			}else{
				break;
			}
		}
		for(int i = y-1; i > -1; i--){
			if(findSpace(new int[]{x,i}).getPiece() == null){
				list.add(new int[]{x,i});
			}else if(findSpace(new int[]{x,i}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{x,i});
				break;
			}else{
				break;
			}
		}
		return list;
	}
	
	public ArrayList<int[]> getKnightMovement(){
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		int[] r1 = {x+2,y+1};
		int[] r2 = {x+1,y+2};
		int[] r3 = {x-2,y+1};
		int[] r4 = {x-1,y+2};
		int[] r5 = {x-2,y-1};
		int[] r6 = {x-1,y-2};
		int[] r7 = {x+2,y-1};
		int[] r8 = {x+1,y-2};
		
		if(findSpace(r1) != null && emptyOrEnemy(findSpace(r1)))
			list.add(r1);
		if(findSpace(r2) != null && emptyOrEnemy(findSpace(r2)))
			list.add(r2);
		if(findSpace(r3) != null && emptyOrEnemy(findSpace(r3)))
			list.add(r3);
		if(findSpace(r4) != null && emptyOrEnemy(findSpace(r4)))
			list.add(r4);
		if(findSpace(r5) != null && emptyOrEnemy(findSpace(r5)))
			list.add(r5);
		if(findSpace(r6) != null && emptyOrEnemy(findSpace(r6)))
			list.add(r6);
		if(findSpace(r7) != null && emptyOrEnemy(findSpace(r7)))
			list.add(r7);
		if(findSpace(r8) != null && emptyOrEnemy(findSpace(r8)))
			list.add(r8);
		
		return list;
	}
	public ArrayList<int[]> getBishopMovement(){
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		for(int i = x+1, j = y+1; i < 8 && j < 8; i++, j++){
			if(findSpace(new int[]{i,j}).getPiece() == null){
				list.add(new int[]{i,j});
			}else if(findSpace(new int[]{i,j}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,j});
				break;
			}else{
				break;
			}
		}
		for(int i = x-1, j = y-1; i > -1 && j > -1; i--, j--){
			if(findSpace(new int[]{i,j}).getPiece() == null){
				list.add(new int[]{i,j});
			}else if(findSpace(new int[]{i,j}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,j});
				break;
			}else{
				break;
			}
		}
		for(int i = x+1, j = y-1; i < 8 && j > -1; i++, j--){
			if(findSpace(new int[]{i,j}).getPiece() == null){
				list.add(new int[]{i,j});
			}else if(findSpace(new int[]{i,j}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,j});
				break;
			}else{
				break;
			}
		}
		for(int i = x-1, j = y+1; i > -1 && j < 8; i--, j++){
			if(findSpace(new int[]{i,j}).getPiece() == null){
				list.add(new int[]{i,j});
			}else if(findSpace(new int[]{i,j}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,j});
				break;
			}else{
				break;
			}
		}
		return list;
	}
	public ArrayList<int[]> getQueenMovement(){
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		for(int i = x+1; i < 8; i++){
			if(findSpace(new int[]{i,y}).getPiece() == null){
				list.add(new int[]{i,y});
			}else if(findSpace(new int[]{i,y}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,y});
				break;
			}else{
				break;
			}
		}
		for(int i = x-1; i > -1; i--){
			if(findSpace(new int[]{i,y}).getPiece() == null){
				list.add(new int[]{i,y});
			}else if(findSpace(new int[]{i,y}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,y});
				break;
			}else{
				break;
			}
		}
		for(int i = y+1; i < 8; i++){
			if(findSpace(new int[]{x,i}).getPiece() == null){
				list.add(new int[]{x,i});
			}else if(findSpace(new int[]{x,i}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{x,i});
				break;
			}else{
				break;
			}
		}
		for(int i = y-1; i > -1; i--){
			if(findSpace(new int[]{x,i}).getPiece() == null){
				list.add(new int[]{x,i});
			}else if(findSpace(new int[]{x,i}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{x,i});
				break;
			}else{
				break;
			}
		}
		for(int i = x+1, j = y+1; i < 8 && j < 8; i++, j++){
			if(findSpace(new int[]{i,j}).getPiece() == null){
				list.add(new int[]{i,j});
			}else if(findSpace(new int[]{i,j}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,j});
				break;
			}else{
				break;
			}
		}
		for(int i = x-1, j = y-1; i > -1 && j > -1; i--, j--){
			if(findSpace(new int[]{i,j}).getPiece() == null){
				list.add(new int[]{i,j});
			}else if(findSpace(new int[]{i,j}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,j});
				break;
			}else{
				break;
			}
		}
		for(int i = x+1, j = y-1; i < 8 && j > -1; i++, j--){
			if(findSpace(new int[]{i,j}).getPiece() == null){
				list.add(new int[]{i,j});
			}else if(findSpace(new int[]{i,j}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,j});
				break;
			}else{
				break;
			}
		}
		for(int i = x-1, j = y+1; i > -1 && j < 8; i--, j++){
			if(findSpace(new int[]{i,j}).getPiece() == null){
				list.add(new int[]{i,j});
			}else if(findSpace(new int[]{i,j}).getPiece().getColor() != this.getPiece().getColor()){
				list.add(new int[]{i,j});
				break;
			}else{
				break;
			}
		}
		return list;
	}
	public ArrayList<int[]> getKingMovement(){
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		int[] r1 = new int[]{x+1,y+1};
		int[] r2 = new int[]{x+1,y};
		int[] r3 = new int[]{x+1,y-1};
		int[] r4 = new int[]{x,y+1};
		int[] r5 = new int[]{x,y-1};
		int[] r6 = new int[]{x-1,y+1};
		int[] r7 = new int[]{x-1,y};
		int[] r8 = new int[]{x-1,y-1};
		
		int[] r9 = new int[]{x-2,y};
		int[] r10 = new int[]{x+2,y};
		
		if(findSpace(r1) != null && emptyOrEnemy(findSpace(r1)))
			list.add(r1);
		if(findSpace(r2) != null && emptyOrEnemy(findSpace(r2)))
			list.add(r2);
		if(findSpace(r3) != null && emptyOrEnemy(findSpace(r3)))
			list.add(r3);
		if(findSpace(r4) != null && emptyOrEnemy(findSpace(r4)))
			list.add(r4);
		if(findSpace(r5) != null && emptyOrEnemy(findSpace(r5)))
			list.add(r5);
		if(findSpace(r6) != null && emptyOrEnemy(findSpace(r6)))
			list.add(r6);
		if(findSpace(r7) != null && emptyOrEnemy(findSpace(r7)))
			list.add(r7);
		if(findSpace(r8) != null && emptyOrEnemy(findSpace(r8)))
			//if(checkKingCanMove(findSpace(r8)))
			list.add(r8);
		
		if(kingCanCastle(r9)){
			list.add(r9);
		}
		if(kingCanCastle(r10)){
			list.add(r10);
		}
		return list;
	}
	
	public ArrayList<int[]> getKingMovementNoChecks(){
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		int[] r1 = new int[]{x+1,y+1};
		int[] r2 = new int[]{x+1,y};
		int[] r3 = new int[]{x+1,y-1};
		int[] r4 = new int[]{x,y+1};
		int[] r5 = new int[]{x,y-1};
		int[] r6 = new int[]{x-1,y+1};
		int[] r7 = new int[]{x-1,y};
		int[] r8 = new int[]{x-1,y-1};
		
		if(findSpace(r1) != null && emptyOrEnemy(findSpace(r1)))
			list.add(r1);
		if(findSpace(r2) != null && emptyOrEnemy(findSpace(r2)))
			list.add(r2);
		if(findSpace(r3) != null && emptyOrEnemy(findSpace(r3)))
			list.add(r3);
		if(findSpace(r4) != null && emptyOrEnemy(findSpace(r4)))
			list.add(r4);
		if(findSpace(r5) != null && emptyOrEnemy(findSpace(r5)))
			list.add(r5);
		if(findSpace(r6) != null && emptyOrEnemy(findSpace(r6)))
			list.add(r6);
		if(findSpace(r7) != null && emptyOrEnemy(findSpace(r7)))
			list.add(r7);
		if(findSpace(r8) != null && emptyOrEnemy(findSpace(r8)))
			list.add(r8);
		
		return list;
	}
	
	public boolean checkKingCanMove(ChessSpace destination){
		ChessPiece temp = null;
		for(ChessSpace s: spaces){
			ArrayList<int[]> list = new ArrayList<int[]>();
			if(s.getPiece() != null && s.getPiece().getColor() != this.getPiece().getColor()){
				
				temp = destination.getPiece();
				destination.setPiece(this.getPiece());
				
				if(s.getPiece().equals(ChessPiece.BlackPawn)){
					list = s.getBlackPawnMovement();
				}else if(s.getPiece().equals(ChessPiece.WhitePawn)){
					list = s.getBlackPawnMovement();
				}else if(s.getPiece().getType() == 2){
					list = s.getRookMovement();
				}else if(s.getPiece().getType() == 3){
					list = s.getKnightMovement();
				}else if(s.getPiece().getType() == 4){
					list = s.getBishopMovement();
				}else if(s.getPiece().getType() == 5){
					list = s.getQueenMovement();
				}else if(s.getPiece().getType() == 6){
					list = s.getKingMovementNoChecks();
				}
				
				/*if(list.indexOf(destination.getPos()) != -1){////////////////////////////////////////////
					return false;
				}*/
				for(int[] i: list){
					if(i[0] == pos[0] && i[1] == pos[1]){
						destination.setPiece(temp);
						temp = null;
						return false;
					}
				}
				destination.setPiece(temp);
				temp = null;
			}
		}
		return true;
	}
	
	public boolean kingInCheck(){//should really be a static method!!!
		ChessSpace k = null;
		for(ChessSpace s: spaces){
			if(s.getPiece() != null && s.getPiece().getType() == 6 && s.getPiece().getColor() == this.getPiece().getColor()){
				k = s;
			}
		}
		for(ChessSpace s: spaces){
			ArrayList<int[]> list = new ArrayList<int[]>();
			if(s.getPiece() != null && s.getPiece().getColor() != this.getPiece().getColor()){
				
				if(s.getPiece().equals(ChessPiece.BlackPawn)){
					list = s.getBlackPawnMovement();
				}else if(s.getPiece().equals(ChessPiece.WhitePawn)){
					list = s.getWhitePawnMovement();
				}else if(s.getPiece().getType() == 2){
					list = s.getRookMovement();
				}else if(s.getPiece().getType() == 3){
					list = s.getKnightMovement();
				}else if(s.getPiece().getType() == 4){
					list = s.getBishopMovement();
				}else if(s.getPiece().getType() == 5){
					list = s.getQueenMovement();
				}else if(s.getPiece().getType() == 6){
					list = s.getKingMovementNoChecks();
				}
				for(int[] i: list){
					if(i[0] == k.getPos()[0] && i[1] == k.getPos()[1]){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean kingCanCastle(int[] destination){
		
		boolean rookReady = false;
		boolean knightSpaceReady = false;
		boolean bishopSpaceReady = false;
		boolean queenSpaceReady = false;
		
		if(destination[0] < pos[0]){
			if(this.getPiece().getHasMoved()){//king hasn't moved return false
				return false;
			}
			
			if(this.getPiece().getColor() == 0){//white king
				
				if(findSpace(new int[]{0,0}).getPiece() != null){//is a piece at 0,0
					if(findSpace(new int[]{0,0}).getPiece().getType() == 2){//it is a rook
						if(findSpace(new int[]{0,0}).getPiece().getColor() == this.getPiece().getColor()){//same color
							if(!ChessBoard.whiteLeftRookMoved){//hasn't moved
								rookReady = true;
							}
						}
					}
				}
				
				if(findSpace(new int[]{2,0}).getPiece() == null){
					if(checkKingCanMove(findSpace(new int[]{2,0}))){
						bishopSpaceReady = true;
					}
				}
				
				if(findSpace(new int[]{3,0}).getPiece() == null){
					if(checkKingCanMove(findSpace(new int[]{3,0}))){
						queenSpaceReady = true;
					}
				}
				
			}else{//black king
				
				if(findSpace(new int[]{0,7}).getPiece() != null){//is a piece at 0,0
					if(findSpace(new int[]{0,7}).getPiece().getType() == 2){//it is a rook
						if(findSpace(new int[]{0,7}).getPiece().getColor() == this.getPiece().getColor()){//same color
							if(!ChessBoard.blackLeftRookMoved){//hasn't moved
								rookReady = true;
							}
						}
					}
				}
				
				if(findSpace(new int[]{2,7}).getPiece() == null){
					if(checkKingCanMove(findSpace(new int[]{2,7}))){
						bishopSpaceReady = true;
					}
				}
				
				if(findSpace(new int[]{3,7}).getPiece() == null){
					if(checkKingCanMove(findSpace(new int[]{3,7}))){
						queenSpaceReady = true;
					}
				}
			}
			
			if(rookReady && bishopSpaceReady && queenSpaceReady){
				return true;
			}else{
				return false;
			}
			
		}else if(destination[0] > pos[0]){
			
			if(this.getPiece().getHasMoved()){//king hasn't moved return false
				return false;
			}
			
			if(this.getPiece().getColor() == 0){//white king
				
				if(findSpace(new int[]{7,0}).getPiece() != null){//is a piece at 0,0
					if(findSpace(new int[]{7,0}).getPiece().getType() == 2){//it is a rook
						if(findSpace(new int[]{7,0}).getPiece().getColor() == this.getPiece().getColor()){//same color
							if(!ChessBoard.whiteRightRookMoved){//hasn't moved
								rookReady = true;
							}
						}
					}
				}
				
				if(findSpace(new int[]{6,0}).getPiece() == null){
					if(checkKingCanMove(findSpace(new int[]{6,0}))){
						knightSpaceReady = true;
					}
				}
				
				if(findSpace(new int[]{5,0}).getPiece() == null){
					if(checkKingCanMove(findSpace(new int[]{5,0}))){
						bishopSpaceReady = true;
					}
				}
				
			}else{//black king
				
				if(findSpace(new int[]{7,7}).getPiece() != null){//is a piece at 0,0
					if(findSpace(new int[]{7,7}).getPiece().getType() == 2){//it is a rook
						if(findSpace(new int[]{7,7}).getPiece().getColor() == this.getPiece().getColor()){//same color
							if(!ChessBoard.blackRightRookMoved){//hasn't moved
								rookReady = true;
							}
						}
					}
				}
				
				if(findSpace(new int[]{6,7}).getPiece() == null){
					if(checkKingCanMove(findSpace(new int[]{6,7}))){
						knightSpaceReady = true;
					}
				}
				
				if(findSpace(new int[]{5,7}).getPiece() == null){
					if(checkKingCanMove(findSpace(new int[]{5,7}))){
						bishopSpaceReady = true;
					}
				}
			}
			
			if(rookReady && knightSpaceReady && bishopSpaceReady){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
