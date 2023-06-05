package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class PainelPrincipal {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PainelPrincipal window = new PainelPrincipal();
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
	public PainelPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelEsquerda = new JPanel();
		panelEsquerda.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panelEsquerda, BorderLayout.WEST);
		panelEsquerda.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(255, 255, 255));
		panelTitulo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelEsquerda.add(panelTitulo, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Controle Carro");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelTitulo.add(lblNewLabel_1);
		
		JPanel panelBotoes = new JPanel();
		panelBotoes.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelEsquerda.add(panelBotoes, BorderLayout.CENTER);
		panelBotoes.setLayout(new MigLayout("", "[]", "[][][][][]"));
		
		JButton btnNewButton = new JButton("Clientes");
		panelBotoes.add(btnNewButton, "cell 0 0");
		
		JButton btnNewButton_1 = new JButton("Veículos");
		panelBotoes.add(btnNewButton_1, "cell 0 1");
		
		JButton btnNewButton_3 = new JButton("Reservas");
		panelBotoes.add(btnNewButton_3, "cell 0 2");
		
		btnNewButton_3.setSelectedIcon(null);
		
		JPanel panelPrincipal = new JPanel();
		frame.getContentPane().add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelPainel = new JPanel();
		panelPainel.setBackground(new Color(255, 255, 255));
		panelPainel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelPainel.setForeground(new Color(0, 0, 0));
		panelPrincipal.add(panelPainel, BorderLayout.NORTH);
		panelPainel.setLayout(new MigLayout("", "[46px][89px][][][][][][][][][][][][][][][][][][]", "[23px]"));
		
		JLabel lblNewLabel = new JLabel("Painel");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 17));
		panelPainel.add(lblNewLabel, "cell 0 0,alignx left,aligny center");
		
		JPanel panelJanela = new JPanel();
		panelJanela.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPrincipal.add(panelJanela, BorderLayout.CENTER);
		panelJanela.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelJanela.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelButoesPrincipais = new JPanel();
		panelButoesPrincipais.setBorder(null);
		desktopPane.add(panelButoesPrincipais, BorderLayout.NORTH);
		panelButoesPrincipais.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		panelButoesPrincipais.add(btnNewButton_2);
		
		JPanel panelLista = new JPanel();
		desktopPane.add(panelLista, BorderLayout.CENTER);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.remove(panelButoesPrincipais);
				panelButoesPrincipais.removeAll();
				new InterfaceCliente(panelButoesPrincipais, panelLista,btnNewButton_2);
				desktopPane.add(panelButoesPrincipais, BorderLayout.NORTH);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.remove(panelButoesPrincipais);
				panelButoesPrincipais.removeAll();
				new interfaceVeiculos(panelButoesPrincipais, panelLista,btnNewButton_2);
				desktopPane.add(panelButoesPrincipais, BorderLayout.NORTH);
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.remove(panelButoesPrincipais);
				panelButoesPrincipais.removeAll();
				new interfaceReservas(panelButoesPrincipais, panelLista,btnNewButton_2);
				desktopPane.add(panelButoesPrincipais, BorderLayout.NORTH);
			}
		});
		
		
		
		
	}
}
