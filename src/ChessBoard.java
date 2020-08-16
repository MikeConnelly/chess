import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChessBoard extends JFrame{
	private static final long serialVersionUID = -8749854477402233239L;
	
	private final int WIDTH = 450;
	private final int HEIGHT = 450;
	
	public boolean selecting;
	public boolean moving;
	public static int turn;
	
	public static boolean whiteRightRookMoved = false;
	public static boolean whiteLeftRookMoved = false;
	public static boolean blackRightRookMoved = false;
	public static boolean blackLeftRookMoved = false;
	
	public static JButton button_a1 = new JButton();
	public static JButton button_b1 = new JButton();
	public static JButton button_c1 = new JButton();
	public static JButton button_d1 = new JButton();
	public static JButton button_e1 = new JButton();
	public static JButton button_f1 = new JButton();
	public static JButton button_g1 = new JButton();
	public static JButton button_h1 = new JButton();
	
	public static JButton button_a2 = new JButton();
	public static JButton button_b2 = new JButton();
	public static JButton button_c2 = new JButton();
	public static JButton button_d2 = new JButton();
	public static JButton button_e2 = new JButton();
	public static JButton button_f2 = new JButton();
	public static JButton button_g2 = new JButton();
	public static JButton button_h2 = new JButton();
	
	public static JButton button_a3 = new JButton();
	public static JButton button_b3 = new JButton();
	public static JButton button_c3 = new JButton();
	public static JButton button_d3 = new JButton();
	public static JButton button_e3 = new JButton();
	public static JButton button_f3 = new JButton();
	public static JButton button_g3 = new JButton();
	public static JButton button_h3 = new JButton();
	
	public static JButton button_a4 = new JButton();
	public static JButton button_b4 = new JButton();
	public static JButton button_c4 = new JButton();
	public static JButton button_d4 = new JButton();
	public static JButton button_e4 = new JButton();
	public static JButton button_f4 = new JButton();
	public static JButton button_g4 = new JButton();
	public static JButton button_h4 = new JButton();
	
	public static JButton button_a5 = new JButton();
	public static JButton button_b5 = new JButton();
	public static JButton button_c5 = new JButton();
	public static JButton button_d5 = new JButton();
	public static JButton button_e5 = new JButton();
	public static JButton button_f5 = new JButton();
	public static JButton button_g5 = new JButton();
	public static JButton button_h5 = new JButton();
	
	public static JButton button_a6 = new JButton();
	public static JButton button_b6 = new JButton();
	public static JButton button_c6 = new JButton();
	public static JButton button_d6 = new JButton();
	public static JButton button_e6 = new JButton();
	public static JButton button_f6 = new JButton();
	public static JButton button_g6 = new JButton();
	public static JButton button_h6 = new JButton();
	
	public static JButton button_a7 = new JButton();
	public static JButton button_b7 = new JButton();
	public static JButton button_c7 = new JButton();
	public static JButton button_d7 = new JButton();
	public static JButton button_e7 = new JButton();
	public static JButton button_f7 = new JButton();
	public static JButton button_g7 = new JButton();
	public static JButton button_h7 = new JButton();
	
	public static JButton button_a8 = new JButton();
	public static JButton button_b8 = new JButton();
	public static JButton button_c8 = new JButton();
	public static JButton button_d8 = new JButton();
	public static JButton button_e8 = new JButton();
	public static JButton button_f8 = new JButton();
	public static JButton button_g8 = new JButton();
	public static JButton button_h8 = new JButton();
	
	ArrayList<JButton> buttons = new ArrayList<>();
	
	private ChessSpace startTurnSpace;
	
	public ChessBoard(){
		buttons.add(button_a1);buttons.add(button_a2);buttons.add(button_a3);buttons.add(button_a4);buttons.add(button_a5);
		buttons.add(button_a6);buttons.add(button_a7);buttons.add(button_a8);buttons.add(button_b1);buttons.add(button_b2);
		buttons.add(button_b3);buttons.add(button_b4);buttons.add(button_b5);buttons.add(button_b6);buttons.add(button_b7);
		buttons.add(button_b8);buttons.add(button_c1);buttons.add(button_c2);buttons.add(button_c3);buttons.add(button_c4);
		buttons.add(button_c5);buttons.add(button_c6);buttons.add(button_c7);buttons.add(button_c8);buttons.add(button_d1);
		buttons.add(button_d2);buttons.add(button_d3);buttons.add(button_d4);buttons.add(button_d5);buttons.add(button_d6);
		buttons.add(button_d7);buttons.add(button_d8);buttons.add(button_e1);buttons.add(button_e2);buttons.add(button_e3);
		buttons.add(button_e4);buttons.add(button_e5);buttons.add(button_e6);buttons.add(button_e7);buttons.add(button_e8);
		buttons.add(button_f1);buttons.add(button_f2);buttons.add(button_f3);buttons.add(button_f4);buttons.add(button_f5);
		buttons.add(button_f6);buttons.add(button_f7);buttons.add(button_f8);buttons.add(button_g1);buttons.add(button_g2);
		buttons.add(button_g3);buttons.add(button_g4);buttons.add(button_g5);buttons.add(button_g6);buttons.add(button_g7);
		buttons.add(button_g8);buttons.add(button_h1);buttons.add(button_h2);buttons.add(button_h3);buttons.add(button_h4);
		buttons.add(button_h5);buttons.add(button_h6);buttons.add(button_h7);buttons.add(button_h8);
		
		createBoard();
		setSize(WIDTH, HEIGHT);
	}
	
	private void createBoard() {
		JPanel board = new JPanel();
		board.setLayout(new GridLayout(0,8));
		
		
		
		board.add(buttonClick(button_a8, ChessSpace.a8));
		board.add(buttonClick(button_b8, ChessSpace.b8));
		board.add(buttonClick(button_c8, ChessSpace.c8));
		board.add(buttonClick(button_d8, ChessSpace.d8));
		board.add(buttonClick(button_e8, ChessSpace.e8));
		board.add(buttonClick(button_f8, ChessSpace.f8));
		board.add(buttonClick(button_g8, ChessSpace.g8));
		board.add(buttonClick(button_h8, ChessSpace.h8));
		
		board.add(buttonClick(button_a7, ChessSpace.a7));
		board.add(buttonClick(button_b7, ChessSpace.b7));
		board.add(buttonClick(button_c7, ChessSpace.c7));
		board.add(buttonClick(button_d7, ChessSpace.d7));
		board.add(buttonClick(button_e7, ChessSpace.e7));
		board.add(buttonClick(button_f7, ChessSpace.f7));
		board.add(buttonClick(button_g7, ChessSpace.g7));
		board.add(buttonClick(button_h7, ChessSpace.h7));
		
		board.add(buttonClick(button_a6, ChessSpace.a6));
		board.add(buttonClick(button_b6, ChessSpace.b6));
		board.add(buttonClick(button_c6, ChessSpace.c6));
		board.add(buttonClick(button_d6, ChessSpace.d6));
		board.add(buttonClick(button_e6, ChessSpace.e6));
		board.add(buttonClick(button_f6, ChessSpace.f6));
		board.add(buttonClick(button_g6, ChessSpace.g6));
		board.add(buttonClick(button_h6, ChessSpace.h6));
		
		board.add(buttonClick(button_a5, ChessSpace.a5));
		board.add(buttonClick(button_b5, ChessSpace.b5));
		board.add(buttonClick(button_c5, ChessSpace.c5));
		board.add(buttonClick(button_d5, ChessSpace.d5));
		board.add(buttonClick(button_e5, ChessSpace.e5));
		board.add(buttonClick(button_f5, ChessSpace.f5));
		board.add(buttonClick(button_g5, ChessSpace.g5));
		board.add(buttonClick(button_h5, ChessSpace.h5));

		board.add(buttonClick(button_a4, ChessSpace.a4));
		board.add(buttonClick(button_b4, ChessSpace.b4));
		board.add(buttonClick(button_c4, ChessSpace.c4));
		board.add(buttonClick(button_d4, ChessSpace.d4));
		board.add(buttonClick(button_e4, ChessSpace.e4));
		board.add(buttonClick(button_f4, ChessSpace.f4));
		board.add(buttonClick(button_g4, ChessSpace.g4));
		board.add(buttonClick(button_h4, ChessSpace.h4));

		board.add(buttonClick(button_a3, ChessSpace.a3));
		board.add(buttonClick(button_b3, ChessSpace.b3));
		board.add(buttonClick(button_c3, ChessSpace.c3));
		board.add(buttonClick(button_d3, ChessSpace.d3));
		board.add(buttonClick(button_e3, ChessSpace.e3));
		board.add(buttonClick(button_f3, ChessSpace.f3));
		board.add(buttonClick(button_g3, ChessSpace.g3));
		board.add(buttonClick(button_h3, ChessSpace.h3));

		board.add(buttonClick(button_a2, ChessSpace.a2));
		board.add(buttonClick(button_b2, ChessSpace.b2));
		board.add(buttonClick(button_c2, ChessSpace.c2));
		board.add(buttonClick(button_d2, ChessSpace.d2));
		board.add(buttonClick(button_e2, ChessSpace.e2));
		board.add(buttonClick(button_f2, ChessSpace.f2));
		board.add(buttonClick(button_g2, ChessSpace.g2));
		board.add(buttonClick(button_h2, ChessSpace.h2));
		
		board.add(buttonClick(button_a1, ChessSpace.a1));
		board.add(buttonClick(button_b1, ChessSpace.b1));
		board.add(buttonClick(button_c1, ChessSpace.c1));
		board.add(buttonClick(button_d1, ChessSpace.d1));
		board.add(buttonClick(button_e1, ChessSpace.e1));
		board.add(buttonClick(button_f1, ChessSpace.f1));
		board.add(buttonClick(button_g1, ChessSpace.g1));
		board.add(buttonClick(button_h1, ChessSpace.h1));
		
		for(ChessSpace e: ChessSpace.getList()){//enables buttons with white pieces/ initial condition
			if(e.getPiece() != null && e.getPiece().getColor() == 0){//white
				e.getButton().setEnabled(true);
			}else{
				e.getButton().setEnabled(false);
			}
		}
		
		startTurnSpace = null;
		selecting = true;
		moving = false;
		turn = 1;
		
		updateIcons();
		
		add(board);
	}
	
	private void updateIcons(){
		for(ChessSpace s: ChessSpace.getList()){
			if(s.getTileColor() == 0){//white background
				if(s.getPiece() == null){//no piece
					s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/NULL_W.PNG")));
				}else if(s.getPiece().getColor() == 0){//white piece
					if(s.getPiece().getType() == 1){//pawn
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/WP/W_PAWN_W.PNG")));
					}else if(s.getPiece().getType() == 2){//rook
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/WP/W_ROOK_W.PNG")));
					}else if(s.getPiece().getType() == 3){//knight
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/WP/W_KNIGHT_W.PNG")));
					}else if(s.getPiece().getType() == 4){//bishop
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/WP/W_BISHOP_W.PNG")));
					}else if(s.getPiece().getType() == 5){//queen
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/WP/W_QUEEN_W.PNG")));
					}else{//king
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/WP/W_KING_W.PNG")));
					}
				}else{//black piece
					if(s.getPiece().getType() == 1){//pawn
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/BP/B_PAWN_W.PNG")));
					}else if(s.getPiece().getType() == 2){//rook
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/BP/B_ROOK_W.PNG")));
					}else if(s.getPiece().getType() == 3){//knight
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/BP/B_KNIGHT_W.PNG")));
					}else if(s.getPiece().getType() == 4){//bishop
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/BP/B_BISHOP_W.PNG")));
					}else if(s.getPiece().getType() == 5){//queen
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/BP/B_QUEEN_W.PNG")));
					}else{//king
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/WB/BP/B_KING_W.PNG")));
					}
				}
			}else{//black background
				if(s.getPiece() == null){//no piece
					s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/NULL_B.PNG")));
				}else if(s.getPiece().getColor() == 0){//white piece
					if(s.getPiece().getType() == 1){//pawn
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/WP/W_PAWN_B.PNG")));
					}else if(s.getPiece().getType() == 2){//rook
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/WP/W_ROOK_B.PNG")));
					}else if(s.getPiece().getType() == 3){//knight
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/WP/W_KNIGHT_B.PNG")));
					}else if(s.getPiece().getType() == 4){//bishop
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/WP/W_BISHOP_B.PNG")));
					}else if(s.getPiece().getType() == 5){//queen
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/WP/W_QUEEN_B.PNG")));
					}else{//king
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/WP/W_KING_B.PNG")));
					}
				}else{//black piece
					if(s.getPiece().getType() == 1){//pawn
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/BP/B_PAWN_B.PNG")));
					}else if(s.getPiece().getType() == 2){//rook
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/BP/B_ROOK_B.PNG")));
					}else if(s.getPiece().getType() == 3){//knight
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/BP/B_KNIGHT_B.PNG")));
					}else if(s.getPiece().getType() == 4){//bishop
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/BP/B_BISHOP_B.PNG")));
					}else if(s.getPiece().getType() == 5){//queen
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/BP/B_QUEEN_B.PNG")));
					}else{//king
						s.getButton().setIcon(new ImageIcon(getClass().getResource("/res/BB/BP/B_KING_B.PNG")));
					}
				}
			}
		}
	}
	
	public JButton buttonClick(JButton button, ChessSpace thisSpace){
		
		class ButtonListener implements ActionListener{
			
			public void actionPerformed(ActionEvent event) {
				
				if(selecting){
					ArrayList<int[]> list = new ArrayList<int[]>();
					
					if(thisSpace.getPiece().equals(ChessPiece.BlackPawn)){
						list = thisSpace.getBlackPawnMovement();
					}else if(thisSpace.getPiece().equals(ChessPiece.WhitePawn)){
						list = thisSpace.getWhitePawnMovement();
					}else if(thisSpace.getPiece().getType() == 2){
						list = thisSpace.getRookMovement();
					}else if(thisSpace.getPiece().getType() == 3){
						list = thisSpace.getKnightMovement();
					}else if(thisSpace.getPiece().getType() == 4){
						list = thisSpace.getBishopMovement();
					}else if(thisSpace.getPiece().getType() == 5){
						list = thisSpace.getQueenMovement();
					}else if(thisSpace.getPiece().getType() == 6){
						list = thisSpace.getKingMovement();
					}
					
					ArrayList<ChessSpace> enableSpaces = new ArrayList<ChessSpace>();
					for(JButton b: buttons)
						b.setEnabled(false);
					for(int[] i: list)
						enableSpaces.add(ChessSpace.findSpace(i));
					for(ChessSpace s: enableSpaces){
						s.getButton().setEnabled(true);
					}
					thisSpace.getButton().setEnabled(true);
					startTurnSpace = thisSpace;
					moving = true;
					selecting = false;
					
					
					
					
					
					
				}else if(moving){
					if(thisSpace == startTurnSpace){
						if(turn % 2 != 0){//odd turn/ white color
							for(ChessSpace s: ChessSpace.getList()){
								if(s.getPiece() != null && s.getPiece().getColor() == 0){//0 = white
									s.getButton().setEnabled(true);
								}else{
									s.getButton().setEnabled(false);
								}
							}
						}else if(turn % 2 == 0){
							for(ChessSpace s: ChessSpace.getList()){
								if(s.getPiece() != null && s.getPiece().getColor() == 1){//1 = black
									s.getButton().setEnabled(true);
								}else{
									s.getButton().setEnabled(false);
								}
							}
						}
						moving = false;
						selecting = true;
						startTurnSpace = null;
						
						
						
						
						
					}else{
						boolean canMove = true;
						
						if(startTurnSpace.getPiece().equals(ChessPiece.WhitePawn)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.WhitePawn);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
								if(thisSpace.getPos()[1] == 7){
									ImageIcon icon = new ImageIcon(getClass().getResource("/res/BB/WP/W_PAWN_B.PNG"));
									String[] options = {"Rook","Knight","Bishop","Queen"};
									int choice = JOptionPane.showOptionDialog(null, "Promote your pawn to which piece?", "PROMOTION", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icon, options, options[3]);
									if(choice == 0){
										thisSpace.setPiece(ChessPiece.WhiteRook);
									}else if(choice == 1){
										thisSpace.setPiece(ChessPiece.WhiteKnight);
									}else if(choice == 2){
										thisSpace.setPiece(ChessPiece.WhiteBishop);
									}else{
										thisSpace.setPiece(ChessPiece.WhiteQueen);
									}
								}
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.WhitePawn);
							}
						}else if(startTurnSpace.getPiece().equals(ChessPiece.WhiteRook)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.WhiteRook);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){//if it is not in check
								canMove = true;
								if(startTurnSpace.getPos().equals(new int[]{7,0})){
									whiteRightRookMoved = true;
								}else if(startTurnSpace.getPos().equals(new int[]{0,0})){
									whiteLeftRookMoved = true;
								}
							}
							else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.WhiteRook);
							}
							
						}else if(startTurnSpace.getPiece().equals(ChessPiece.WhiteKnight)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.WhiteKnight);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.WhiteKnight);
							}
						}else if(startTurnSpace.getPiece().equals(ChessPiece.WhiteBishop)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.WhiteBishop);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.WhiteBishop);
							}
						}else if(startTurnSpace.getPiece().equals(ChessPiece.WhiteQueen)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.WhiteQueen);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.WhiteQueen);
							}
						}else if(startTurnSpace.getPiece().equals(ChessPiece.WhiteKing)){
							ChessPiece temp = thisSpace.getPiece();////////////////////////////////must use on all
							thisSpace.setPiece(ChessPiece.WhiteKing);
							thisSpace.getPiece().moved();
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
								if(thisSpace.getPos()[0] == startTurnSpace.getPos()[0] - 2){//check for castle left
									ChessSpace.findSpace(new int[]{3,0}).setPiece(ChessSpace.findSpace(new int[]{0,0}).getPiece());
									ChessSpace.findSpace(new int[]{0,0}).setPiece(null);
								}else if(thisSpace.getPos()[0] == startTurnSpace.getPos()[0] + 2){//check for castle right
									ChessSpace.findSpace(new int[]{5,0}).setPiece(ChessSpace.findSpace(new int[]{7,0}).getPiece());
									ChessSpace.findSpace(new int[]{7,0}).setPiece(null);
								}
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot put your king in check!");
								thisSpace.setPiece(temp);////////////////////////////////////////////muse use on all
								startTurnSpace.setPiece(ChessPiece.WhiteKing);
							}
						}else if(startTurnSpace.getPiece().equals(ChessPiece.BlackPawn)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.BlackPawn);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								if(thisSpace.getPos()[1] == 0){
									ImageIcon icon = new ImageIcon(getClass().getResource("/res/WB/BP/B_PAWN_W.PNG"));
									String[] options = {"Rook","Knight","Bishop","Queen"};
									int choice = JOptionPane.showOptionDialog(null, "Promote your pawn to which piece?", "PROMOTION", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icon, options, options[3]);
									if(choice == 0){
										thisSpace.setPiece(ChessPiece.BlackRook);
									}else if(choice == 1){
										thisSpace.setPiece(ChessPiece.BlackKnight);
									}else if(choice == 2){
										thisSpace.setPiece(ChessPiece.BlackBishop);
									}else{
										thisSpace.setPiece(ChessPiece.BlackQueen);
									}
								}
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.BlackPawn);
							}
							
						}else if(startTurnSpace.getPiece().equals(ChessPiece.BlackRook)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.BlackRook);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
								if(startTurnSpace.getPos().equals(new int[]{7,7})){
									blackRightRookMoved = true;
								}else if(startTurnSpace.getPos().equals(new int[]{0,7})){
									blackLeftRookMoved = true;
								}
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.BlackRook);
							}
						}else if(startTurnSpace.getPiece().equals(ChessPiece.BlackKnight)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.BlackKnight);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.BlackKnight);
							}
						}else if(startTurnSpace.getPiece().equals(ChessPiece.BlackBishop)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.BlackBishop);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.BlackBishop);
							}
						}else if(startTurnSpace.getPiece().equals(ChessPiece.BlackQueen)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.BlackQueen);
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot leave your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.BlackQueen);
							}
						}else if(startTurnSpace.getPiece().equals(ChessPiece.BlackKing)){
							ChessPiece temp = thisSpace.getPiece();
							thisSpace.setPiece(ChessPiece.BlackKing);
							thisSpace.getPiece().moved();
							startTurnSpace.setPiece(null);
							if(!thisSpace.kingInCheck()){
								canMove = true;
								if(thisSpace.getPos()[0] == startTurnSpace.getPos()[0] - 2){//check for castle left
									ChessSpace.findSpace(new int[]{3,7}).setPiece(ChessSpace.findSpace(new int[]{0,7}).getPiece());
									ChessSpace.findSpace(new int[]{0,7}).setPiece(null);
								}else if(thisSpace.getPos()[0] == startTurnSpace.getPos()[0] + 2){//check for castle right
									ChessSpace.findSpace(new int[]{5,7}).setPiece(ChessSpace.findSpace(new int[]{7,7}).getPiece());
									ChessSpace.findSpace(new int[]{7,7}).setPiece(null);
								}
							}else{
								canMove = false;
								JOptionPane.showMessageDialog(null, "You cannot put your king in check!");
								thisSpace.setPiece(temp);
								startTurnSpace.setPiece(ChessPiece.BlackKing);
							}
						}
						
						
						
						
						
						
						
						
						
						
						
						
						
						if(canMove){////////////////////////////////////////////////////////////////////
							//check for Checkmate or Stalemate of opposite color
							//for every piece of the opposite color, for all of there possible movements, check if it is a 
							//valid move(wont leave king in check), then break the loop, if there are no valid moves and king
							//is in check it is Checkmate, if no valid moves and not in check it is Stalemate.
							updateIcons();
							boolean legalMove = false;
							for(ChessSpace s: ChessSpace.getList()){
								if(s.getPiece() != null && s.getPiece().getColor() != thisSpace.getPiece().getColor()){
									if(s.getPiece().equals(ChessPiece.WhitePawn)){
										for(int[] i: s.getWhitePawnMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.WhitePawn);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.WhitePawn);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.WhiteRook)){
										for(int[] i: s.getRookMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.WhiteRook);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.WhiteRook);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.WhiteKnight)){
										for(int[] i: s.getKnightMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.WhiteKnight);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.WhiteKnight);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.WhiteBishop)){
										for(int[] i: s.getBishopMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.WhiteBishop);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.WhiteBishop);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.WhiteQueen)){
										for(int[] i: s.getQueenMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.WhiteQueen);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.WhiteQueen);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.WhiteKing)){
										for(int[] i: s.getKingMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.WhiteKing);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.WhiteKing);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.BlackPawn)){
										for(int[] i: s.getBlackPawnMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.BlackPawn);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.BlackPawn);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.BlackRook)){
										for(int[] i: s.getRookMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.BlackRook);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.BlackRook);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.BlackKnight)){
										for(int[] i: s.getKnightMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.BlackKnight);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.BlackKnight);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.BlackBishop)){
										for(int[] i: s.getBishopMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.BlackBishop);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.BlackBishop);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.BlackQueen)){
										for(int[] i: s.getQueenMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.BlackQueen);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.BlackQueen);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}else if(s.getPiece().equals(ChessPiece.BlackKing)){
										for(int[] i: s.getKingMovement()){
											ChessPiece temp = ChessSpace.findSpace(i).getPiece();
											ChessSpace.findSpace(i).setPiece(ChessPiece.BlackKing);
											s.setPiece(null);
											if(!ChessSpace.findSpace(i).kingInCheck()){
												legalMove = true;
											}
											s.setPiece(ChessPiece.BlackKing);
											ChessSpace.findSpace(i).setPiece(temp);
											if(legalMove){
												break;
											}
										}
										if(legalMove){
											break;
										}
									}
								}
							}
							if(!legalMove){
								if(turn % 2 != 0){//white just moved, black has no move
									for(ChessSpace s: ChessSpace.getList()){
										if(s.getPiece() != null && s.getPiece().getColor() == 1){
											if(s.kingInCheck()){
												//checkmate
												JOptionPane.showMessageDialog(null, "White Wins!", "CHECKMATE", JOptionPane.PLAIN_MESSAGE);
												break;
											}else{
												//stalemate
												JOptionPane.showMessageDialog(null, "Black cannot move, it's a draw!", "STALEMATE", JOptionPane.PLAIN_MESSAGE);
												break;
											}
										}
									}
								}else{//black just moved, white has no move
									for(ChessSpace s: ChessSpace.getList()){
										if(s.getPiece() != null && s.getPiece().getColor() == 0){
											if(s.kingInCheck()){
												//checkmate
												JOptionPane.showMessageDialog(null, "Black Wins!", "CHECKMATE", JOptionPane.PLAIN_MESSAGE);
												break;
											}else{
												//stalemate
												JOptionPane.showMessageDialog(null, "White cannot move, it's a draw!", "STALEMATE", JOptionPane.PLAIN_MESSAGE);
												break;
											}
										}
									}
								}
							}
							//updateIcons();
							moving = false;
							selecting = true;
							turn++;
							if(turn % 2 != 0){//odd turn/ white color
								for(ChessSpace s: ChessSpace.getList()){
									if(s.getPiece() != null && s.getPiece().getColor() == 0){//0 = white
										s.getButton().setEnabled(true);
										if(s.getPiece().getType() == 6 && s.kingInCheck()){
											if(legalMove)
												JOptionPane.showMessageDialog(null, "Check");
										}
									}else{
										s.getButton().setEnabled(false);
									}
								}
							}else if(turn % 2 == 0){//even turn/ black color
								for(ChessSpace s: ChessSpace.getList()){
									if(s.getPiece() != null && s.getPiece().getColor() == 1){//1 = black
										s.getButton().setEnabled(true);
										if(s.getPiece().getType() == 6 && s.kingInCheck()){
											if(legalMove)
												JOptionPane.showMessageDialog(null, "Check");
										}
									}else{
										s.getButton().setEnabled(false);
									}
								}
							}
						}
					}
				}
			}
		}
		ActionListener listener = new ButtonListener();
		button.addActionListener(listener);
		return button;
	}
}