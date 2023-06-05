package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class interfaceVeiculos {
	private JButton adicionarVeiculos;
	private JButton editarVeiculos;
	private JButton buscarVeiculos;
	private JButton removerVeiculos;
	
	
	public interfaceVeiculos(JPanel painelBotoes, JPanel painelLista, JButton index) {
		setAdicionarVeiculo();
		setEditarVeiculo();
		setBuscarVeiculo();
		setRemoverVeiculo();
		painelBotoes.add(adicionarVeiculos);
		painelBotoes.add(editarVeiculos);
		painelBotoes.add(buscarVeiculos);
		painelBotoes.add(removerVeiculos);
		painelBotoes.remove(index);
	}
	
	private void setAdicionarVeiculo() {
		this.adicionarVeiculos = new JButton("Adicionar Veiculos");
		adicionarVeiculos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("add veiculo");
				
			}
		});
	}
	private void setEditarVeiculo() {
		this.editarVeiculos = new JButton("Editar Veiculos");
		editarVeiculos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("edt veiculo");
				
			}
		});
	}
	private void setBuscarVeiculo() {
		this.buscarVeiculos = new JButton("Buscar Veiculos");
		buscarVeiculos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("bsc veiculo");
				
			}
		});
	}
	private void setRemoverVeiculo() {
		this.removerVeiculos = new JButton("Remover Veiculos");
		removerVeiculos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("rmv veiculo");
				
			}
		});
	}
	
}
