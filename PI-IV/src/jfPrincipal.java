import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jfPrincipal {

	private JFrame frmConfigurarSquid;
	private jfBloqueioUrl bloqueioUrl;
	private jfBloqueioPalavra bloqueioPalavra;
	private jfBloqueioExtensao bloqueioExtensao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfPrincipal window = new jfPrincipal();
					window.frmConfigurarSquid.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public jfPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfigurarSquid = new JFrame();
		frmConfigurarSquid.setTitle("Configurar Squid");
		frmConfigurarSquid.setBounds(100, 100, 430, 336);
		frmConfigurarSquid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpPrincipal = new JPanel();
		frmConfigurarSquid.getContentPane().add(jpPrincipal, BorderLayout.CENTER);
		jpPrincipal.setLayout(null);
		
		JButton btnAdicionarUrl = new JButton("Adicionar URL");
		btnAdicionarUrl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bloqueioUrl = new jfBloqueioUrl();
				bloqueioUrl.setVisible(true);
			}
		});
		btnAdicionarUrl.setBounds(249, 78, 151, 25);
		jpPrincipal.add(btnAdicionarUrl);
		
		JButton btnAdicionarPalavra = new JButton("Adicionar Palavra");
		btnAdicionarPalavra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bloqueioPalavra = new jfBloqueioPalavra();
				bloqueioPalavra.setVisible(true);
			}
		});
		btnAdicionarPalavra.setBounds(249, 126, 151, 25);
		jpPrincipal.add(btnAdicionarPalavra);
		
		JLabel lblPossveisConfiguraes = new JLabel("Poss\u00EDveis Configura\u00E7\u00F5es");
		lblPossveisConfiguraes.setHorizontalAlignment(SwingConstants.CENTER);
		lblPossveisConfiguraes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPossveisConfiguraes.setBounds(12, 13, 388, 33);
		jpPrincipal.add(lblPossveisConfiguraes);
		
		JLabel lblBloqueioDeSites = new JLabel("Bloqueio de sites por URL");
		lblBloqueioDeSites.setBounds(12, 82, 225, 16);
		jpPrincipal.add(lblBloqueioDeSites);
		
		JLabel lblBloqueioDeSites_1 = new JLabel("Bloqueio de sites por Palavras");
		lblBloqueioDeSites_1.setBounds(12, 130, 225, 16);
		jpPrincipal.add(lblBloqueioDeSites_1);
		
		JLabel lblBloqueioPorHorario = new JLabel("Bloqueio de sites por Hor\u00E1rio");
		lblBloqueioPorHorario.setBounds(12, 179, 225, 16);
		jpPrincipal.add(lblBloqueioPorHorario);
		
		JLabel lblBloqueioDeDownloads = new JLabel("Bloqueio de downloads por Extens\u00E3o");
		lblBloqueioDeDownloads.setBounds(12, 229, 219, 16);
		jpPrincipal.add(lblBloqueioDeDownloads);
		
		JButton btnAdicionarHorrio = new JButton("Adicionar Hor\u00E1rio");
		btnAdicionarHorrio.setBounds(249, 175, 151, 25);
		jpPrincipal.add(btnAdicionarHorrio);
		
		JButton btnAdicionarExtenso = new JButton("Adicionar Extens\u00E3o");
		btnAdicionarExtenso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bloqueioExtensao = new jfBloqueioExtensao();
				bloqueioExtensao.setVisible(true);
			}
		});
		btnAdicionarExtenso.setBounds(249, 225, 151, 25);
		jpPrincipal.add(btnAdicionarExtenso);
	}
}
