package trezedeagosto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class tela {

	private JFrame frame;
	JFormattedTextField txtCEP;
	private JFormattedTextField txtCPF;
	private JFormattedTextField txtDATA;
	private JFormattedTextField txtTEL;
	private JFormattedTextField txtCNPJ;
	private JLabel lblCpf;
	private JLabel lblDataDeNascimeno;
	private JLabel lblTelefone;
	private JLabel lblCnpj;
	private JTextField txtNOME;
	private JTextField txtEMAIL;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
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
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try{
			MaskFormatter mask,mask2,mask3,mask4,mask5;
			mask = new MaskFormatter("##.###-###");
			mask2 = new MaskFormatter("###.###.###-##");
			mask3 = new MaskFormatter("##/##/####");
			mask4 = new MaskFormatter("(##)#####-####");
			mask5 = new MaskFormatter("##.###.###/####-##");
			txtCEP= new JFormattedTextField(mask);
			txtCEP.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER) {
						txtCPF.requestFocus();
					}
				}
			});
			txtCPF= new JFormattedTextField(mask2);
			txtDATA= new JFormattedTextField(mask3);
			txtTEL= new JFormattedTextField(mask4);
			txtCNPJ= new JFormattedTextField(mask5);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar","erro",JOptionPane.ERROR);
		}
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(25, 24, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		//JFormattedTextField txtCEP = new JFormattedTextField();
		txtCEP.setBounds(155, 21, 279, 20);
		frame.getContentPane().add(txtCEP);
		
		//txtCPF = new JFormattedTextField();
		txtCPF.setBounds(155, 52, 279, 20);
		frame.getContentPane().add(txtCPF);
		
		//txtDATA = new JFormattedTextField();
		txtDATA.setBounds(155, 83, 279, 20);
		frame.getContentPane().add(txtDATA);
		
		//txtTEL = new JFormattedTextField();
		txtTEL.setBounds(155, 114, 279, 20);
		frame.getContentPane().add(txtTEL);
		
		//txtCNPJ = new JFormattedTextField();
		txtCNPJ.setBounds(155, 145, 279, 20);
		frame.getContentPane().add(txtCNPJ);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(25, 55, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		lblDataDeNascimeno = new JLabel("DATA DE NASCIMENTO");
		lblDataDeNascimeno.setBounds(25, 86, 132, 14);
		frame.getContentPane().add(lblDataDeNascimeno);
		
		lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setBounds(25, 117, 70, 14);
		frame.getContentPane().add(lblTelefone);
		
		lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(25, 146, 46, 14);
		frame.getContentPane().add(lblCnpj);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNOME.getText().trim().toLowerCase(); 
				String email = txtEMAIL.getText().trim().toLowerCase();
				if(nome.matches("[A-Za-z ]+")&& email.matches("[a-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
					JOptionPane.showMessageDialog(null, "Cadastro realizado","Aviso",JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Dados inválidos","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnNewButton.setBounds(204, 242, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtNOME = new JTextField();
		txtNOME.setBounds(155, 176, 279, 20);
		frame.getContentPane().add(txtNOME);
		txtNOME.setColumns(10);
		
		txtEMAIL = new JTextField();
		txtEMAIL.setBounds(155, 207, 279, 20);
		frame.getContentPane().add(txtEMAIL);
		txtEMAIL.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(25, 179, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(25, 210, 46, 14);
		frame.getContentPane().add(lblEmail);
	}
}
