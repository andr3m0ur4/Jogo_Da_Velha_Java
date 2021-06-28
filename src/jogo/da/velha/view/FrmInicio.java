package jogo.da.velha.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

public class FrmInicio extends Janela {
    private JButton btnCadastrar;
    private JButton btnLogin;
    private JButton btnSair;
    private JLabel lbl1;
    private JLabel lbl2;
    private JPanel panel;
    
    public FrmInicio() {
        initComponents();
        centralizar();
    }
    
    private void initComponents() {
        panel = new JPanel();
        lbl1 = new JLabel();
        btnSair = new JButton();
        btnCadastrar = new JButton();
        btnLogin = new JButton();
        lbl2 = new JLabel();

        addWindowListener(new JanelaListener());

        panel.setBorder(BorderFactory.createEtchedBorder());

        lbl1.setFont(new Font("Tahoma", 1, 24));
        lbl1.setForeground(new Color(255, 255, 255));
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        lbl1.setText("INICIO");
        lbl1.setToolTipText("");

        btnSair.setFont(new Font("Tahoma", 1, 12));
        btnSair.setForeground(new Color(255, 51, 51));
        btnSair.setMnemonic('s');
        btnSair.setText("Sair");
        btnSair.addActionListener(new SairListener());

        btnCadastrar.setFont(new Font("Tahoma", 1, 12));
        btnCadastrar.setForeground(new Color(102, 255, 102));
        btnCadastrar.setMnemonic('s');
        btnCadastrar.setText("Cadastro");
        btnCadastrar.addActionListener(new CadastrarListener());

        btnLogin.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setForeground(new Color(102, 204, 255));
        btnLogin.setMnemonic('s');
        btnLogin.setText("Login");
        btnLogin.addActionListener(new LoginListener());

        lbl2.setIcon(new ImageIcon(getClass().getResource("./img/opening.gif")));

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLogin)
                    .addComponent(btnSair))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl2))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    
    private class JanelaListener extends WindowAdapter {

        @Override
        public void windowOpened(WindowEvent e) {
            getContentPane().setBackground(Color.BLACK);
            panel.setBackground(Color.BLACK);
            btnCadastrar.setBackground(Color.BLACK);
            btnLogin.setBackground(Color.BLACK);
            btnSair.setBackground(Color.BLACK);
        }
        
    }
}
