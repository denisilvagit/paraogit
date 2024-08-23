package OnzeDeJulho;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Formulario extends JFrame {

	private JTextField nameField;
	private JTextField emailField;
	private JTextField phoneField;
	private JTextField addressField;
	private JButton submitButton;

	private JTextField dobField;
	private JToggleButton contactPrefToggle;
	private JRadioButton maleRadio;
	private JRadioButton femaleRadio;
	private JCheckBox newsletterCheckBox;

	private DefaultTableModel tableModel;

	public Formulario() {
		// Informações e configurações iniciais da janela que vamos utilizar
		// no formulário.
		setTitle("Formulário de cadastro");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// Informações do Painel principal da aplicação criada em Java Swing
		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// Informações iniciais do painel que vai ficar no formulário
		JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));

		// Campos que o formulário vai possuir (Nome, Email, Telefone e Endereço).
		JLabel nameJLabel = new JLabel("Nome: ");
		nameField = new JTextField();
		JLabel emailJLabel = new JLabel("E-mail: ");
		emailField = new JTextField();
		JLabel phoneJLabel = new JLabel("Telefone: ");
		phoneField = new JTextField();
		JLabel addressJLabel = new JLabel("Endereço: ");
		addressField = new JTextField();
		JLabel dobLabel = new JLabel("Data de Nascimento");
		dobField = new JTextField();

		// Estrutura para criar a preferência de contato
		JLabel contactPrefLabel = new JLabel("Preferência de Contato");
		contactPrefToggle = new JToggleButton("Email");
		contactPrefToggle.addItemListener(e -> {
			if (contactPrefToggle.isSelected()) {
				contactPrefToggle.setText("Telefone");
			} else {
				contactPrefToggle.setText("Email");
			}

		});

		// As opções de gênero de nosso formulário
		JLabel genderLabel = new JLabel("Gênero");
		maleRadio = new JRadioButton("Masculino");
		femaleRadio = new JRadioButton("Feminino");
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleRadio);
		genderGroup.add(femaleRadio);

		JLabel newsletterLabel = new JLabel("Assinar Newsletter:");
		newsletterCheckBox = new JCheckBox();

		// Adicionando label e entrada de dados ao painel
		// de formulário de dados
		formPanel.add(nameJLabel);
		formPanel.add(nameField);
		formPanel.add(emailJLabel);
		formPanel.add(emailField);
		formPanel.add(phoneJLabel);
		formPanel.add(phoneField);
		formPanel.add(addressJLabel);
		formPanel.add(addressField);

		formPanel.add(dobLabel);
		formPanel.add(dobField);

		formPanel.add(contactPrefLabel);
		formPanel.add(contactPrefToggle);

		formPanel.add(genderLabel);

		JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		genderPanel.add(maleRadio);
		genderPanel.add(femaleRadio);
		formPanel.add(genderPanel);
		formPanel.add(newsletterLabel);
		formPanel.add(newsletterCheckBox);

		// Botão utilizado para enviar informações do formulário
		submitButton = new JButton("Enviar");
		submitButton.addActionListener(new SubmitButtonListener());

		// Adicionando elementos de Layout ao painel principal da aplicação.
		mainPanel.add(formPanel, BorderLayout.CENTER);
		mainPanel.add(submitButton, BorderLayout.SOUTH);

		// Adicionando painel principal e todos seus recursos na janela
		// ou aplicação desenvolvida
		add(mainPanel);

		// Tornando a janela ou aplicação visível
		setVisible(true);

		tableModel = new DefaultTableModel(new String[] 
				{ "Nome", "Email", "Telefone", 
				  "Endereço", "Data de Nascimento",
				"Preferência de Contato", "Gênero", 
				"Newsletter" 
				}, 0);
	}

	private class SubmitButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String name = nameField.getText();
			String email = emailField.getText();
			String phone = phoneField.getText();
			String address = addressField.getText();

			String dob = dobField.getText();
			String contactPref = contactPrefToggle.isSelected() ? "Telefone" : "Email";

			String gender = maleRadio.isSelected() ? "Masculino"
					: femaleRadio.isSelected() ? "Feminino" : "Não especificado";

			String newsletter = newsletterCheckBox.isSelected() ? "Sim" : "Não";

			String message = String.format(
					"Nome: %s\nEmail: %s\nTelefone %s\nEndereço: %s\nData de Nascimento: %s\n Preferência de Contato: %s\nGênero: %s\nAssinar Newsletter: %s",
					name, email, phone, address, dob, contactPref, gender, newsletter);

//			JOptionPane.showMessageDialog(
//					Formulario.this, 
//					message,
//					"Informações do Formulário",
//					JOptionPane.INFORMATION_MESSAGE
//			);

			tableModel.addRow(new Object[] { 
					name, email, phone, address, 
					dob, contactPref, gender, newsletter 
			});

			new InfoFrame(tableModel);

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
 
class InfoFrame extends JFrame {
	public InfoFrame(DefaultTableModel tableModel) {
		setTitle("Informações do Formulário");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		setVisible(true);

	}

}