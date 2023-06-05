package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class interfaceReservas {
	private JButton adicionarReservas;
	private JButton editarReservas;
	private JButton buscarReservas;
	private JButton removerReservas;
	
	
	public interfaceReservas(JPanel painelBotoes, JPanel painelLista, JButton index) {
		setAdicionarReservas();
		setEditarReservas();
		setBuscarReservas();
		setRemoverReservas();
		painelBotoes.add(adicionarReservas);
		painelBotoes.add(editarReservas);
		painelBotoes.add(buscarReservas);
		painelBotoes.add(removerReservas);
		painelBotoes.remove(index);
	}
	
	private void setAdicionarReservas() {
		this.adicionarReservas = new JButton("Adicionar Reservas");
		adicionarReservas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("add reservas");
				
			}
		});
	}
	private void setEditarReservas() {
		this.editarReservas = new JButton("Editar Reservas");
		editarReservas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("edt reservas");
				
			}
		});
	}
	private void setBuscarReservas() {
		this.buscarReservas = new JButton("Buscar Reservas");
		buscarReservas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("bsc reservas");
				
			}
		});
	}
	private void setRemoverReservas() {
		this.removerReservas = new JButton("Remover Reservas");
		removerReservas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("rmv reservas");
				
			}
		});
	}
}
