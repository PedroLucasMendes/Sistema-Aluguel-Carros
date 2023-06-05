package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class interfaceAdicionarCliente{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmAdicionarCliente;
	private JTextField textField;
	private JLabel lblIdade;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceAdicionarCliente window = new interfaceAdicionarCliente();
					window.frmAdicionarCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfaceAdicionarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdicionarCliente = new JFrame();
		frmAdicionarCliente.setTitle("Adicionar Cliente");
		frmAdicionarCliente.setBounds(100, 100, 800, 600);
		frmAdicionarCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmAdicionarCliente.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Nome");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 51, SpringLayout.NORTH, frmAdicionarCliente.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 33, SpringLayout.WEST, frmAdicionarCliente.getContentPane());
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		frmAdicionarCliente.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.PLAIN, 13));
		springLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textField, 33, SpringLayout.WEST, frmAdicionarCliente.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField, 196, SpringLayout.WEST, frmAdicionarCliente.getContentPane());
		frmAdicionarCliente.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblIdade = new JLabel("Idade");
		springLayout.putConstraint(SpringLayout.NORTH, lblIdade, 6, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, lblIdade, 0, SpringLayout.WEST, lblNewLabel);
		lblIdade.setFont(new Font("Arial Black", Font.PLAIN, 18));
		frmAdicionarCliente.getContentPane().add(lblIdade);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblIdade);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		frmAdicionarCliente.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		frmAdicionarCliente.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial Black", Font.PLAIN, 13));
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 6, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textField);
		frmAdicionarCliente.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Adicionar");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 19, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		frmAdicionarCliente.getContentPane().add(btnNewButton);
		frmAdicionarCliente.setVisible(true);
	}
}
