import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class jfBloqueioHorario extends JFrame {

	private JPanel contentPane;
	private JTextField txtInicioBloqueio;
	private JTextField txtFimBloqueio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfBloqueioHorario frame = new jfBloqueioHorario();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jfBloqueioHorario() {
		setTitle("Bloqueio por Hor\u00E1rio");
		setBounds(100, 100, 271, 336);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblBloqueioPorHorrio = new JLabel("Bloqueio por Hor\u00E1rio");
		lblBloqueioPorHorrio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBloqueioPorHorrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblBloqueioPorHorrio.setBounds(0, 13, 255, 25);
		panel.add(lblBloqueioPorHorrio);

		JLabel lblIncioBloqueio = new JLabel("In\u00EDcio Bloqueio");
		lblIncioBloqueio.setHorizontalAlignment(SwingConstants.CENTER);
		lblIncioBloqueio.setBounds(0, 77, 255, 16);
		panel.add(lblIncioBloqueio);

		JLabel lblFimBloqueio = new JLabel("Fim Bloqueio");
		lblFimBloqueio.setHorizontalAlignment(SwingConstants.CENTER);
		lblFimBloqueio.setBounds(0, 131, 255, 16);
		panel.add(lblFimBloqueio);

		txtInicioBloqueio = new JTextField();
		txtInicioBloqueio.setBounds(56, 96, 134, 22);
		panel.add(txtInicioBloqueio);
		txtInicioBloqueio.setColumns(10);

		txtFimBloqueio = new JTextField();
		txtFimBloqueio.setBounds(56, 150, 134, 22);
		panel.add(txtFimBloqueio);
		txtFimBloqueio.setColumns(10);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(12, 241, 97, 25);
		panel.add(btnNewButton);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Fecha somente a janela "filha" a janela principal continua aberto!
			}
		});
		btnCancelar.setBounds(146, 241, 97, 25);
		panel.add(btnCancelar);
	}
}