package DezDeJulho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Formulario extends JFrame{
	
	private JTextField nameField;
	private JTextField emailField;
	private JTextField phoneField;
	private JTextField addressField;
	private JButton submitButton;
	
	public Formulario() {
		//Informações e configurações iniciais da janela que vamos utilizar
		// no formulário.
		setTitle("Formulário de cadastro");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Informações do Painel principal da aplicação criada em Java Swing
		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//Informações iniciais do painel que vai ficar no formulário
		JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
		
		//Campos que o formulário vai possuir (Nome, Email, Telefone e Endereço).
		JLabel nameJLabel = new JLabel("Nome: ");
		nameField = new JTextField();
		JLabel emailJLabel = new JLabel("E-mail: ");
		emailField = new JTextField();
		JLabel phoneJLabel = new JLabel("Telefone: ");
		phoneField = new JTextField();
		JLabel addressJLabel = new JLabel("Endereço: ");
		addressField = new JTextField();
		
		//Adicionando label e entrada de dados ao painel 
		// de formulário de dados
		formPanel.add(nameJLabel);
		formPanel.add(nameField);
		formPanel.add(emailJLabel);
		formPanel.add(emailField);
		formPanel.add(phoneJLabel);
		formPanel.add(phoneField);
		formPanel.add(addressJLabel);
		formPanel.add(addressField);
		
		//Botão utilizado para enviar informações do formulário
		submitButton = new JButton("Enviar");
		submitButton.addActionListener(new SubmitButtonListener());
		
		//Adicionando elementos de Layout ao painel principal da aplicação.
		mainPanel.add(formPanel, BorderLayout.CENTER);
		mainPanel.add(submitButton, BorderLayout.SOUTH);
		
		// Adicionando painel principal e todos seus recursos na janela
		// ou aplicação desenvolvida
		add(mainPanel);
		
		//Tornando a janela ou aplicação visível
		setVisible(true);
	}
	
	private class SubmitButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String name = nameField.getText();
			String email = emailField.getText();
			String phone = phoneField.getText();
			String address = addressField.getText();
			String message = String.format(
					"Nome: %s\nEmail: %s\nTelefone %s\nEndereço: %s", 
					name, email, phone, address
			);
			
			JOptionPane.showMessageDialog(
					Formulario.this, 
					message,
					"Informações do Formulário",
					JOptionPane.INFORMATION_MESSAGE
			);
		}
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Formulario();
				
			}
		});

	}

}
