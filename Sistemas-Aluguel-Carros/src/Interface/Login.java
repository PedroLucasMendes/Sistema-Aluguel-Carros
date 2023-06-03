package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login {

	private JFrame frame;
	private JTextField fieldUsuario;
	private JTextField textField;

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
		
		JLabel labelUsuario = new JLabel("Usuário");
		labelUsuario.setFont(new Font("Arial Black", Font.PLAIN, 18));
		labelUsuario.setBounds(330, 142, 150, 20);
		frame.getContentPane().add(labelUsuario);
		
		fieldUsuario = new JTextField();
		fieldUsuario.setBounds(330, 173, 150, 20);
		frame.getContentPane().add(fieldUsuario);
		fieldUsuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel.setBounds(330, 204, 150, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(330, 235, 150, 20);
		frame.getContentPane().add(textField);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnEnter.setBounds(354, 266, 100, 30);
		frame.getContentPane().add(btnEnter);
	}

}
