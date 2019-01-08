import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import com.mysql.jdbc.*;

public class Application implements Runnable{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Application());
	}
	
	@Override
	public void run() {
//		JFrame frame = new JFrame("Fleischer Chess");
//		
//		//this is a default model
//		ChessModel model = new ChessModel(white, black);
//		white.setModel(model);
//		black.setModel(model);
//		
//		Board board = new Board(model, Polarity.White);
//		ControlPanel cp = new ControlPanel(board, model);
//		
//		black.setBoard(board);
//		//white.setBoard(board);
//		white.move();
//		JPanel panel = new JPanel(new BorderLayout());
//		panel.add(cp, BorderLayout.CENTER);
//		panel.add(board, BorderLayout.WEST);
//		
//		frame.setContentPane(panel);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.pack();
//		frame.setVisible(true);
		
		String url = "jdbc:mysql://localhost:3306/VPIP";
		String username = "java";
		String password = "java";

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
	}
}
