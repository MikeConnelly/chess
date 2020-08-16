import javax.swing.JFrame;

public class ChessDriver {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
	
	public static void createAndShowGUI(){
		JFrame frame = new ChessBoard();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CHESS");
		frame.setVisible(true);
	}
}