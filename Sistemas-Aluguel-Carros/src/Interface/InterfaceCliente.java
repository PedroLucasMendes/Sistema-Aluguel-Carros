package Interface;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InterfaceCliente {
	private JButton adicionarCliente;
	private JButton editarCliente;
	private JButton buscarCliente;
	private JButton removerCliente;
	
	
	public InterfaceCliente(JPanel painelBotoes, JPanel painelLista, JButton index) {
		setAdicionarCliente();
		setEditarCliente();
		setBuscarCliente();
		setRemoverCliente();
		painelBotoes.add(adicionarCliente);
		painelBotoes.add(editarCliente);
		painelBotoes.add(buscarCliente);
		painelBotoes.add(removerCliente);
		painelBotoes.remove(index);
	}
	
	private void setAdicionarCliente() {
		this.adicionarCliente = new JButton("Adicionar cliente");
		adicionarCliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				interfaceAdicionarCliente window = new interfaceAdicionarCliente();
			}
		});
	}
	private void setEditarCliente() {
		this.editarCliente = new JButton("Editar cliente");
		editarCliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("edt cliente");
				
			}
		});
	}
	private void setBuscarCliente() {
		this.buscarCliente = new JButton("Buscar cliente");
		buscarCliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("bsc cliente");
				
			}
		});
	}
	private void setRemoverCliente() {
		this.removerCliente = new JButton("Remover cliente");
		removerCliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("rmv cliente");
				
			}
		});
	}
	
	
	
	
	
}
