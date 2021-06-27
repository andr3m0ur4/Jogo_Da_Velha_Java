package jogo.da.velha.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import jogo.da.velha.model.beans.Usuario;
import jogo.da.velha.model.dao.UsuarioDAO;

public class FrmLogin  extends Janela {
    private JButton btnEntrar;
    private JButton btnVoltar;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JTextField txtLogin;
    private JTextField txtLogin2;
    private JPasswordField txtSenha;
    private JPasswordField txtSenha2;
    public static Usuario usuario;
    public static Usuario usuario2;
    private UsuarioDAO dao;
    
    public FrmLogin() {
        initComponents();
        centralizar();
    }
    
    private void initComponents() {
        panel2 = new JPanel();
        lbl1 = new JLabel();
        panel1 = new JPanel();
        lbl2 = new JLabel();
        lbl3 = new JLabel();
        txtLogin = new JTextField();
        txtSenha = new JPasswordField();
        btnVoltar = new JButton();
        btnEntrar = new JButton();
        panel3 = new JPanel();
        lbl4 = new JLabel();
        lbl5 = new JLabel();
        txtLogin2 = new JTextField();
        txtSenha2 = new JPasswordField();
        lbl6 = new JLabel();
        
        addWindowListener(new JanelaListener());
        
        panel2.setBorder(BorderFactory.createEtchedBorder());

        lbl1.setFont(new Font("Tahoma", 1, 24));
        lbl1.setForeground(new Color(255, 255, 255));
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        lbl1.setText("Login");
        lbl1.setToolTipText("");

        panel1.setBorder(BorderFactory.createTitledBorder(
                null,
                "Jogador 1",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Tahoma", 1, 18),
                new Color(255, 255, 255))
        );
        panel1.setForeground(new Color(255, 255, 255));

        lbl2.setFont(new Font("Tahoma", 1, 14));
        lbl2.setForeground(new Color(255, 255, 255));
        lbl2.setText("Login:");

        lbl3.setFont(new Font("Tahoma", 1, 14));
        lbl3.setForeground(new Color(255, 255, 255));
        lbl3.setText("Senha:");
        
        txtLogin.setToolTipText("Insira o login");
        
        GroupLayout panel1Layout = new GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtLogin, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtSenha))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        
        btnVoltar.setFont(new Font("Tahoma", 1, 12));
        btnVoltar.setForeground(new java.awt.Color(255, 51, 51));
        btnVoltar.setMnemonic('s');
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new VoltarListener());
        
        btnEntrar.setFont(new Font("Tahoma", 1, 12));
        btnEntrar.setForeground(new Color(102, 255, 102));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new EntrarListener());
        
        panel3.setBorder(BorderFactory.createTitledBorder(
                null,
                "Jogador 2",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Tahoma", 1, 18),
                new Color(255, 255, 255))
        );
        panel3.setForeground(new Color(255, 255, 255));

        lbl4.setFont(new Font("Tahoma", 1, 14));
        lbl4.setForeground(new Color(255, 255, 255));
        lbl4.setText("Login:");

        lbl5.setFont(new Font("Tahoma", 1, 14));
        lbl5.setForeground(new Color(255, 255, 255));
        lbl5.setText("Senha:");
        
        txtLogin2.setToolTipText("Insira o login");
        
        GroupLayout panel3Layout = new GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtLogin2)
                    .addComponent(txtSenha2))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(txtSenha2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        GroupLayout panel2Layout = new GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(lbl1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnEntrar))
                .addContainerGap())
        );
        
        lbl6.setIcon(new ImageIcon(getClass().getResource("./img/img14.gif")));
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(lbl6)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }
    
    private class JanelaListener extends WindowAdapter {

        @Override
        public void windowOpened(WindowEvent e) {
            getContentPane().setBackground(Color.BLACK);
       
            panel1.setBackground(Color.BLACK);
            panel2.setBackground(Color.BLACK);
            panel3.setBackground(Color.BLACK);
            btnVoltar.setBackground(Color.BLACK);
            btnEntrar.setBackground(Color.BLACK);
        }
        
    }
    
    private class EntrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            usuario = new Usuario(txtLogin.getText(), String.copyValueOf(txtSenha.getPassword()));
            dao = new UsuarioDAO();
            usuario.setId(dao.login(usuario));
            
            if (usuario.getId() > 0) {
                usuario2 = new Usuario(txtLogin2.getText(), String.copyValueOf(txtSenha2.getPassword()));
                usuario2.setId(dao.login(usuario2));
                
                if (usuario2.getId() > 0) {
                    JOptionPane.showMessageDialog(null,"Todas as informações do jogo atual são temporárias e sempre que você ir para o rank elas resetarão", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    
                    FrmJogo jogo = new FrmJogo();
                    jogo.setVisible(true);
                    
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário 2 ou senha inválidos", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário 1 ou senha inválidos", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
