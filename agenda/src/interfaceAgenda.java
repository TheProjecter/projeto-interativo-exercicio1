import java.awt.BorderLayout;
import java.util.LinkedList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import java.awt.Button;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class interfaceAgenda extends JFrame {

	private JPanel contentPane;
	private JTable tabela_contatos;
	public static JTextField textField_nome;
	public static JTextField textField_sobrenome;
	public static JTextField textField_telefoneFixo;
	public static JTextField textField_telefoneMovel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceAgenda frame = new interfaceAgenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfaceAgenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		
		JLabel lblNewLabel = new JLabel("Agenda de Contatos");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 23));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(237, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(228))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				agenda.addContato();
				tabela_contatos.setModel(new DefaultTableModel(
						new Object[][] {
							{agenda.getVerNome()[1], agenda.getVerSobrenome()[1], agenda.getVerTelefoneMovel()[1], agenda.getVerTelefoneFixo()[1]},
							{agenda.getVerNome()[2], agenda.getVerSobrenome()[2], agenda.getVerTelefoneMovel()[2], agenda.getVerTelefoneFixo()[2]},
							{agenda.getVerNome()[3], agenda.getVerSobrenome()[3], agenda.getVerTelefoneMovel()[3], agenda.getVerTelefoneFixo()[3]},
							{agenda.getVerNome()[4], agenda.getVerSobrenome()[4], agenda.getVerTelefoneMovel()[4], agenda.getVerTelefoneFixo()[4]},
							{agenda.getVerNome()[5], agenda.getVerSobrenome()[5], agenda.getVerTelefoneMovel()[5], agenda.getVerTelefoneFixo()[5]},
							{agenda.getVerNome()[6], agenda.getVerSobrenome()[6], agenda.getVerTelefoneMovel()[6], agenda.getVerTelefoneFixo()[6]},
							{agenda.getVerNome()[7], agenda.getVerSobrenome()[7], agenda.getVerTelefoneMovel()[7], agenda.getVerTelefoneFixo()[7]},
							{agenda.getVerNome()[8], agenda.getVerSobrenome()[8], agenda.getVerTelefoneMovel()[8], agenda.getVerTelefoneFixo()[8]},
							{agenda.getVerNome()[9], agenda.getVerSobrenome()[9], agenda.getVerTelefoneMovel()[9], agenda.getVerTelefoneFixo()[9]},
							{agenda.getVerNome()[10], agenda.getVerSobrenome()[10], agenda.getVerTelefoneMovel()[10], agenda.getVerTelefoneFixo()[10]},
						},
						new String[] {
							"Nome", "Sobrenome", "Telefone M\u00F3vel", "Telefone Fixo"
						}
					));	
				
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_nome.setText("");
				textField_sobrenome.setText("");
				textField_telefoneFixo.setText("");
				textField_telefoneMovel.setText("");
			}
		});
				
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExcluir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) tabela_contatos.getModel()).removeRow(tabela_contatos.getSelectedRow());  
			}
		});
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_nome = new JTextField();
		textField_nome.setColumns(10);
		
		JLabel lblSobreno = new JLabel("SOBRENOME:");
		lblSobreno.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_sobrenome = new JTextField();
		textField_sobrenome.setColumns(10);
		
		JLabel lblTelefoneFixo = new JLabel("Telefone Fixo: ");
		lblTelefoneFixo.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_telefoneFixo = new JTextField();
		textField_telefoneFixo.setColumns(10);
		
		JLabel lblTelefoneMvel = new JLabel("Telefone M\u00F3vel:");
		lblTelefoneMvel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_telefoneMovel = new JTextField();
		textField_telefoneMovel.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(222)
							.addComponent(btnLimpar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnExcluir))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(lblTelefoneFixo)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_telefoneFixo))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(lblNome)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_nome, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblSobreno)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_sobrenome, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblTelefoneMvel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_telefoneMovel, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textField_nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSobreno)
						.addComponent(textField_sobrenome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefoneFixo)
						.addComponent(textField_telefoneFixo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefoneMvel)
						.addComponent(textField_telefoneMovel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLimpar, Alignment.TRAILING)
						.addComponent(btnSalvar, Alignment.TRAILING)
						.addComponent(btnExcluir, Alignment.TRAILING))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		tabela_contatos = new JTable();
		tabela_contatos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		scrollPane.setViewportView(tabela_contatos);
		contentPane.setLayout(gl_contentPane);
	}
}
