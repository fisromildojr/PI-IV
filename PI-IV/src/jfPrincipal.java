import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class jfPrincipal {
	private JFrame frmConfigurarSquid;
	private jfBloqueioUrl bloqueioUrl;
	private jfBloqueioPalavra bloqueioPalavra;
	private jfBloqueioExtensao bloqueioExtensao;
	private jfBloqueioHorario bloqueioHorario;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfPrincipal window = new jfPrincipal();
					window.frmConfigurarSquid.setVisible(true);
				} catch (Exception var2) {
					var2.printStackTrace();
				}

			}
		});
	}

	public jfPrincipal() {
		this.initialize();
	}

	private void initialize() {
		this.frmConfigurarSquid = new JFrame();
		this.frmConfigurarSquid.setTitle("Configurar Squid");
		this.frmConfigurarSquid.setBounds(100, 100, 418, 361);
		this.frmConfigurarSquid.setDefaultCloseOperation(3);
		this.frmConfigurarSquid.setResizable(false);
		JPanel jpPrincipal = new JPanel();
		this.frmConfigurarSquid.getContentPane().add(jpPrincipal, "Center");
		jpPrincipal.setLayout((LayoutManager) null);
		JButton btnAdicionarUrl = new JButton("Adicionar URL");
		btnAdicionarUrl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jfPrincipal.this.bloqueioUrl = new jfBloqueioUrl();
				jfPrincipal.this.bloqueioUrl.setVisible(true);
			}
		});
		jpPrincipal.setLayout(null);
		jpPrincipal.setLayout(null);
		jpPrincipal.setLayout(null);
		btnAdicionarUrl.setBounds(249, 78, 151, 25);
		jpPrincipal.add(btnAdicionarUrl);
		JButton btnAdicionarPalavra = new JButton("Adicionar Palavra");
		btnAdicionarPalavra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jfPrincipal.this.bloqueioPalavra = new jfBloqueioPalavra();
				jfPrincipal.this.bloqueioPalavra.setVisible(true);
			}
		});
		btnAdicionarPalavra.setBounds(249, 126, 151, 25);
		jpPrincipal.add(btnAdicionarPalavra);
		JLabel lblPossveisConfiguraes = new JLabel("Poss�veis Configura��es");
		lblPossveisConfiguraes.setHorizontalAlignment(0);
		lblPossveisConfiguraes.setFont(new Font("Tahoma", 0, 20));
		lblPossveisConfiguraes.setBounds(12, 13, 388, 33);
		jpPrincipal.add(lblPossveisConfiguraes);
		JLabel lblBloqueioDeSites = new JLabel("Bloqueio de sites por URL");
		lblBloqueioDeSites.setBounds(12, 82, 225, 16);
		jpPrincipal.add(lblBloqueioDeSites);
		JLabel lblBloqueioDeSites_1 = new JLabel("Bloqueio de sites por Palavras");
		lblBloqueioDeSites_1.setBounds(12, 130, 225, 16);
		jpPrincipal.add(lblBloqueioDeSites_1);
		JLabel lblBloqueioPorHorario = new JLabel("Bloqueio de sites por Hor�rio");
		lblBloqueioPorHorario.setBounds(12, 179, 225, 16);
		jpPrincipal.add(lblBloqueioPorHorario);
		JLabel lblBloqueioDeDownloads = new JLabel("Bloqueio de downloads por Extens�o");
		lblBloqueioDeDownloads.setBounds(12, 229, 219, 16);
		jpPrincipal.add(lblBloqueioDeDownloads);
		JButton btnAdicionarHorrio = new JButton("Adicionar Hor�rio");
		btnAdicionarHorrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jfPrincipal.this.bloqueioHorario = new jfBloqueioHorario();
				jfPrincipal.this.bloqueioHorario.setVisible(true);
			}
		});
		btnAdicionarHorrio.setBounds(249, 175, 151, 25);
		jpPrincipal.add(btnAdicionarHorrio);
		JButton btnAdicionarExtenso = new JButton("Adicionar Extens�o");
		btnAdicionarExtenso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jfPrincipal.this.bloqueioExtensao = new jfBloqueioExtensao();
				jfPrincipal.this.bloqueioExtensao.setVisible(true);
			}
		});
		btnAdicionarExtenso.setBounds(249, 225, 151, 25);
		jpPrincipal.add(btnAdicionarExtenso);

		JButton btnReconfigurarSquid = new JButton("Reconfigurar Squid");
		btnReconfigurarSquid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Process p = Runtime.getRuntime().exec("squid -k reconfigure");
					BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
					
					/*
					String lineOut, msg="";
					while ((lineOut = input.readLine()) != null) {
						msg += lineOut+"\n";
					}
					JOptionPane.showMessageDialog(btnReconfigurarSquid, msg);
					*/
					JOptionPane.showMessageDialog(btnReconfigurarSquid, "O Squid foi reconfigurado com sucesso!");
				}catch (IOException e) {
					JOptionPane.showMessageDialog(btnReconfigurarSquid, e.getMessage());
				}
			
			}
		});
		btnReconfigurarSquid.setBounds(12, 280, 181, 33);
		jpPrincipal.add(btnReconfigurarSquid);
		
		JButton btnAbrirSarg = new JButton("Abrir SARG");
		btnAbrirSarg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				//abrindo o navegador
				if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
			        try {
			        	Process p = Runtime.getRuntime().exec("sarg");
						BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
						
						/*
						String lineOut, msg="";
						while ((lineOut = input.readLine()) != null) {
							msg += lineOut+"\n";
						}
						JOptionPane.showMessageDialog(btnReconfigurarSquid, msg);
						*/
						//JOptionPane.showMessageDialog(btnReconfigurarSquid, "O Squid foi reconfigurado com sucesso!");
						desktop.browse(new java.net.URI("http://localhost/squid-reports"));
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    }
			}
		});
		btnAbrirSarg.setBounds(219, 280, 181, 33);
		jpPrincipal.add(btnAbrirSarg);
	}
}