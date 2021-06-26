package jogo.da.velha.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import jogo.da.velha.model.beans.Usuario;
import jogo.da.velha.model.dao.UsuarioDAO;

public class FrmCadastrar extends JFrame {
    private JButton btnCadastrar;
    private JButton btnLogin;
    private JButton btnVoltar;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JPanel panel;
    private JTextField txtNome;
    private JPasswordField txtSenha;
    private Usuario usuario;
    private UsuarioDAO dao;
    
    public FrmCadastrar() {
        initComponents();
    }
    
    private void initComponents() {
        panel = new JPanel();
        lbl2 = new JLabel();
        lbl3 = new JLabel();
        txtNome = new JTextField();
        txtSenha = new JPasswordField();
        btnCadastrar = new JButton();
        btnVoltar = new JButton();
        btnLogin = new JButton();
        lbl1 = new JLabel();
        lbl4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new JanelaListener());

        panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));

        lbl2.setFont(new Font("Tahoma", 1, 14));
        lbl2.setForeground(new Color(255, 255, 255));
        lbl2.setText("Nome:");

        lbl3.setFont(new Font("Tahoma", 1, 14));
        lbl3.setForeground(new Color(255, 255, 255));
        lbl3.setText("Senha:");

        txtNome.setToolTipText("Insira o login");

        btnCadastrar.setFont(new Font("Tahoma", 1, 12));
        btnCadastrar.setForeground(new Color(102, 255, 102));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new CadastrarListener());

        btnVoltar.setBackground(new Color(255, 255, 255));
        btnVoltar.setFont(new Font("Tahoma", 1, 12));
        btnVoltar.setForeground(new Color(102, 255, 102));
        btnVoltar.setMnemonic('s');
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new VoltarListener());

        btnLogin.setBackground(new Color(255, 255, 255));
        btnLogin.setFont(new Font("Tahoma", 1, 12));
        btnLogin.setForeground(new Color(255, 51, 51));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new LoginListener());

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtSenha)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogin)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVoltar)
                    .addComponent(btnLogin))
                .addContainerGap())
        );

        lbl1.setFont(new Font("Tahoma", 1, 24));
        lbl1.setForeground(new Color(255, 255, 255));
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        lbl1.setText("Cadastro");
        lbl1.setToolTipText("");

        lbl4.setIcon(new ImageIcon(getClass().getResource("./img/img14.gif")));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(lbl1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl4)
                .addContainerGap())
        );

        pack();
    }
    
    private class JanelaListener extends WindowAdapter {

        @Override
        public void windowOpened(WindowEvent e) {
            getContentPane().setBackground(Color.BLACK);
       
            panel.setBackground(Color.BLACK);
            btnLogin.setBackground(Color.BLACK);
            btnVoltar.setBackground(Color.BLACK);
            btnCadastrar.setBackground(Color.BLACK);
        }
        
    }
    
    private class CadastrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            usuario = new Usuario(txtNome.getText(), String.copyValueOf(txtSenha.getPassword()));
            dao = new UsuarioDAO();
            
            if (dao.cadastrar(usuario)) {
                JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!", "Mensagem de Sucesso", JOptionPane.INFORMATION_MESSAGE);
                FrmInicio ini = new FrmInicio();
                ini.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro falhou!", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    private class VoltarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmInicio ini = new FrmInicio();
            ini.setVisible(true);

            setVisible(false);
        }
        
    }
    
    private class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmLogin log = new FrmLogin();
            log.setVisible(true);
            
            setVisible(false);
        }
        
    }
}
