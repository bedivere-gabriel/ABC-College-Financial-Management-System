import java.awt.EventQueue;

import javax.swing.JFrame;

public class JavaSwingStudent {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void JavaSwingStudentScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwingStudent window = new JavaSwingStudent();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaSwingStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setOpacity(1.0f);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("ABC College Financial Management");
		frame.setBounds(100, 100, 600, 500);
		frame.getContentPane().setLayout(null);
	}

}
