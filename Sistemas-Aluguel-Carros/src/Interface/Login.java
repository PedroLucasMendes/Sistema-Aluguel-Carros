package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setBounds(326, 187, 76, 26);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(326, 219, 116, 23);
		textField.setFont(new Font("Arial Black", Font.PLAIN, 11));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(326, 257, 61, 26);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(326, 289, 116, 23);
		passwordField.setFont(new Font("Arial Black", Font.PLAIN, 11));
		frame.getContentPane().add(passwordField);
		
		btnNewButton = new JButton("Enter");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton.setBounds(336, 333, 91, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
