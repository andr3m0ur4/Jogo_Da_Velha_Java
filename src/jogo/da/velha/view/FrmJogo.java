package jogo.da.velha.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import jogo.da.velha.model.beans.JogoDaVelha;
import jogo.da.velha.model.beans.Usuario;
import jogo.da.velha.model.dao.UsuarioDAO;

public class FrmJogo extends Janela {
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnNovoJogo;
    private JButton btnRanking;
    private JButton btnSair;
    private JButton btnVoltar;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JLabel lbl2;
    private JLabel lbl4;
    private JLabel lblDerrotasJogador1;
    private JLabel lblDerrotasJogador2;
    private JLabel lblEmpatesJogador1;
    private JLabel lblEmpatesJogador2;
    private JLabel lblJogador1;
    private JLabel lblJogador2;
    private JLabel lblNick1;
    private JLabel lblNick2;
    private JLabel lblNomeJogador1;
    private JLabel lblNomeJogador2;
    private JLabel lblNumeroDerrotas1;
    private JLabel lblNumeroDerrotas2;
    private JLabel lblNumeroEmpates;
    private JLabel lblNumeroEmpates3;
    private JLabel lblNumeroEmpates4;
    private JLabel lblNumeroPartidas1;
    private JLabel lblNumeroPartidas2;
    private JLabel lblNumeroVitorias1;
    private JLabel lblNumeroVitorias2;
    private JLabel lblNumeroVitorias3;
    private JLabel lblNumeroVitorias4;
    private JLabel lblPartidasJogador1;
    private JLabel lblPartidasJogador2;
    private JLabel lblVitoriasJogador1;
    private JLabel lblVitoriasJogador2;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private Icon jogador1;
    private Icon jogador2;
    private JogoDaVelha jogoDaVelha;
    private Usuario usuario1;
    private Usuario usuario2;
    private UsuarioDAO dao;
    private int vitoriaJogador1;
    private int vitoriaJogador2;
    private int empate;
    
    public FrmJogo() {
        initComponents();
        centralizar();
        jogoDaVelha = new JogoDaVelha();
        dao = new UsuarioDAO();
    }
    
    private void initComponents() {
        panel1 = new JPanel();
        btn3 = new JButton();
        btn6 = new JButton();
        btn9 = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btn5 = new JButton();
        btn4 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        
        panel2 = new JPanel();
        lblJogador1 = new JLabel();
        lblNumeroVitorias1 = new JLabel();
        jSeparator1 = new JSeparator();
        lblJogador2 = new JLabel();
        lblNumeroVitorias2 = new JLabel();
        jSeparator2 = new JSeparator();
        lblNumeroEmpates = new JLabel();
        lbl2 = new JLabel();
        lbl4 = new JLabel();
        
        panel3 = new JPanel();
        btnNovoJogo = new JButton();
        btnRanking = new JButton();
        btnVoltar = new JButton();
        btnSair = new JButton();
        
        panel4 = new JPanel();
        jSeparator3 = new JSeparator();
        lblNick1 = new JLabel();
        lblNumeroPartidas1 = new JLabel();
        lblNumeroVitorias3 = new JLabel();
        lblNumeroEmpates3 = new JLabel();
        lblNumeroDerrotas1 = new JLabel();
        lblNumeroEmpates4 = new JLabel();
        lblNumeroDerrotas2 = new JLabel();
        lblNumeroVitorias4 = new JLabel();
        lblNumeroPartidas2 = new JLabel();
        lblNick2 = new JLabel();
        lblPartidasJogador1 = new JLabel();
        lblNomeJogador2 = new JLabel();
        lblNomeJogador1 = new JLabel();
        lblVitoriasJogador1 = new JLabel();
        lblEmpatesJogador1 = new JLabel();
        lblDerrotasJogador1 = new JLabel();
        lblEmpatesJogador2 = new JLabel();
        lblDerrotasJogador2 = new JLabel();
        lblVitoriasJogador2 = new JLabel();
        lblPartidasJogador2 = new JLabel();
        
        addWindowListener(new JanelaListener());
        
        panel2.setBorder(BorderFactory.createTitledBorder(
                null,
                "Informações do Jogo Atual",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Tahoma", 2, 18),
                new Color(255, 255, 255))
        );
        panel2.setForeground(new Color(255, 255, 255));

        lblJogador1.setFont(new Font("Tahoma", 1, 14));
        lblJogador1.setForeground(new Color(255, 51, 51));
        lblJogador1.setText("Jogador 1");

        lblNumeroVitorias1.setFont(new Font("Tahoma", 1, 14));
        lblNumeroVitorias1.setForeground(new Color(255, 51, 51));
        lblNumeroVitorias1.setText("Número de vitórias: 0");

        lblJogador2.setFont(new Font("Tahoma", 1, 14));
        lblJogador2.setForeground(new Color(102, 255, 102));
        lblJogador2.setText("Jogador 2");

        lblNumeroVitorias2.setFont(new Font("Tahoma", 1, 14));
        lblNumeroVitorias2.setForeground(new Color(102, 255, 102));
        lblNumeroVitorias2.setText("Número de vitórias: 0");

        lblNumeroEmpates.setFont(new Font("Tahoma", 1, 14));
        lblNumeroEmpates.setForeground(new Color(102, 204, 255));
        lblNumeroEmpates.setText("Número de Empates: 0");

        lbl2.setFont(new Font("Tahoma", 1, 14));
        lbl2.setIcon(new ImageIcon(getClass().getResource("./img/charizard2.gif")));

        lbl4.setFont(new Font("Tahoma", 1, 14));
        lbl4.setIcon(new ImageIcon(getClass().getResource("./img/mewtwo.gif")));
        
        GroupLayout panel2Layout = new GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblJogador1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumeroVitorias1)
                        .addGap(93, 93, 93)
                        .addComponent(lbl2))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblJogador2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumeroVitorias2)
                        .addGap(94, 94, 94)
                        .addComponent(lbl4)))
                .addContainerGap())
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(lblNumeroEmpates)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2, GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroVitorias1)
                            .addComponent(lblJogador1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroVitorias2)
                            .addComponent(lblJogador2))
                        .addGap(55, 55, 55))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl4)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumeroEmpates)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        
        panel1.setBorder(BorderFactory.createTitledBorder(""));

        btn3.setFont(new java.awt.Font("Tahoma", 0, 36));
        btn3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btn3.addActionListener(new BotoesJogoListener());
        
        btn6.setFont(new Font("Tahoma", 0, 36));
        btn6.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btn6.addActionListener(new BotoesJogoListener());
        
        btn9.setFont(new Font("Tahoma", 0, 36));
        btn9.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btn9.addActionListener(new BotoesJogoListener());
        
        btn1.setFont(new Font("Tahoma", 0, 36));
        btn1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btn1.setName("");
        btn1.addActionListener(new BotoesJogoListener());

        btn2.setFont(new Font("Tahoma", 0, 36));
        btn2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btn2.addActionListener(new BotoesJogoListener());

        btn5.setFont(new Font("Tahoma", 0, 36));
        btn5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btn5.addActionListener(new BotoesJogoListener());

        btn4.setFont(new Font("Tahoma", 0, 36));
        btn4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btn4.addActionListener(new BotoesJogoListener());

        btn7.setFont(new Font("Tahoma", 0, 36));
        btn7.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btn7.addActionListener(new BotoesJogoListener());

        btn8.setFont(new Font("Tahoma", 0, 36));
        btn8.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btn8.addActionListener(new BotoesJogoListener());
        
        jogador1 = new ImageIcon(getClass().getResource("./img/charizard.gif"));
        jogador2 = new ImageIcon(getClass().getResource("./img/mewtwo2.gif"));
        
        GroupLayout panel1Layout = new GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn6, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btn3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))))
        );
        
        
        panel3.setBorder(BorderFactory.createTitledBorder(
                null,
                "Ações",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Tahoma", 2, 24),
                new Color(255, 255, 255))
        );
        panel3.setForeground(new Color(255, 255, 255));
        
        btnNovoJogo.setForeground(new Color(102, 255, 102));
        btnNovoJogo.setText("Novo Jogo");
        btnNovoJogo.setActionCommand("");
        btnNovoJogo.addActionListener(new NovoJogoListener());
        
        btnRanking.setForeground(new Color(204, 255, 0));
        btnRanking.setText("Ranking");
        btnRanking.addActionListener(new RankingListener());
        
        btnVoltar.setForeground(new Color(255, 51, 51));
        btnVoltar.setText("Voltar ao login");
        btnVoltar.addActionListener(new VoltarListener());
        
        btnSair.setForeground(new Color(255, 51, 51));
        btnSair.setText("Sair");
        btnSair.addActionListener(new SairListener());
        
        GroupLayout panel3Layout = new GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnNovoJogo)
                .addGap(36, 36, 36)
                .addComponent(btnRanking)
                .addGap(29, 29, 29)
                .addComponent(btnVoltar)
                .addGap(30, 30, 30)
                .addComponent(btnSair)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(btnNovoJogo)
            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(btnVoltar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRanking, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        
        panel4.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder(
                        null,
                        "Informações dos jogadores",
                        TitledBorder.CENTER,
                        TitledBorder.DEFAULT_POSITION,
                        new Font("Tahoma", 1, 18),
                        new Color(255, 255, 255)
                ),
                BorderFactory.createBevelBorder(
                        BevelBorder.RAISED,
                        new Color(255, 255, 255),
                        new Color(255, 255, 255),
                        new Color(255, 255, 255),
                        new Color(255, 255, 255)
                )
        ));
        panel4.setForeground(new Color(255, 255, 255));

        lblNick1.setFont(new Font("Tahoma", 1, 14));
        lblNick1.setForeground(new Color(255, 51, 51));
        lblNick1.setText("Nick:");

        lblNumeroPartidas1.setFont(new Font("Tahoma", 1, 14));
        lblNumeroPartidas1.setForeground(new Color(255, 51, 51));
        lblNumeroPartidas1.setText("Número de Partidas:");

        lblNumeroVitorias3.setFont(new Font("Tahoma", 1, 14));
        lblNumeroVitorias3.setForeground(new Color(255, 51, 51));
        lblNumeroVitorias3.setText("Número de Vitórias:");

        lblNumeroEmpates3.setFont(new Font("Tahoma", 1, 14));
        lblNumeroEmpates3.setForeground(new Color(255, 51, 51));
        lblNumeroEmpates3.setText("Número de Empates:");

        lblNumeroDerrotas1.setFont(new Font("Tahoma", 1, 14));
        lblNumeroDerrotas1.setForeground(new Color(255, 51, 51));
        lblNumeroDerrotas1.setText("Número de Derrotas:");

        lblNumeroEmpates4.setFont(new Font("Tahoma", 1, 14));
        lblNumeroEmpates4.setForeground(new Color(102, 255, 102));
        lblNumeroEmpates4.setText("Número de Empates:");

        lblNumeroDerrotas2.setFont(new Font("Tahoma", 1, 14));
        lblNumeroDerrotas2.setForeground(new Color(102, 255, 102));
        lblNumeroDerrotas2.setText("Número de Derrotas:");

        lblNumeroVitorias4.setFont(new Font("Tahoma", 1, 14));
        lblNumeroVitorias4.setForeground(new Color(102, 255, 102));
        lblNumeroVitorias4.setText("Número de Vitórias:");

        lblNumeroPartidas2.setFont(new Font("Tahoma", 1, 14));
        lblNumeroPartidas2.setForeground(new Color(102, 255, 102));
        lblNumeroPartidas2.setText("Número de Partidas:");

        lblNick2.setFont(new Font("Tahoma", 1, 14));
        lblNick2.setForeground(new Color(102, 255, 102));
        lblNick2.setText("Nick:");

        lblPartidasJogador1.setFont(new Font("Tahoma", 1, 14));
        lblPartidasJogador1.setForeground(new Color(255, 255, 255));
        lblPartidasJogador1.setText("Part J1");

        lblNomeJogador2.setFont(new Font("Tahoma", 1, 14));
        lblNomeJogador2.setForeground(new Color(255, 255, 255));
        lblNomeJogador2.setText("Jogador 2");

        lblNomeJogador1.setFont(new Font("Tahoma", 1, 14));
        lblNomeJogador1.setForeground(new Color(255, 255, 255));
        lblNomeJogador1.setText("Jogador 1");

        lblVitoriasJogador1.setFont(new Font("Tahoma", 1, 14));
        lblVitoriasJogador1.setForeground(new Color(255, 255, 255));
        lblVitoriasJogador1.setText("PartG J1");

        lblEmpatesJogador1.setFont(new Font("Tahoma", 1, 14));
        lblEmpatesJogador1.setForeground(new Color(255, 255, 255));
        lblEmpatesJogador1.setText("PartE J1");

        lblDerrotasJogador1.setFont(new Font("Tahoma", 1, 14));
        lblDerrotasJogador1.setForeground(new Color(255, 255, 255));
        lblDerrotasJogador1.setText("PartP J1");

        lblEmpatesJogador2.setFont(new Font("Tahoma", 1, 14));
        lblEmpatesJogador2.setForeground(new Color(255, 255, 255));
        lblEmpatesJogador2.setText("PartE J2");

        lblDerrotasJogador2.setFont(new Font("Tahoma", 1, 14));
        lblDerrotasJogador2.setForeground(new Color(255, 255, 255));
        lblDerrotasJogador2.setText("PartP J2");

        lblVitoriasJogador2.setFont(new Font("Tahoma", 1, 14));
        lblVitoriasJogador2.setForeground(new Color(255, 255, 255));
        lblVitoriasJogador2.setText("PartG J2");

        lblPartidasJogador2.setFont(new Font("Tahoma", 1, 14));
        lblPartidasJogador2.setForeground(new Color(255, 255, 255));
        lblPartidasJogador2.setText("Part J2");
        
        GroupLayout panel4Layout = new GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(lblNick1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeJogador1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(lblNick2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeJogador2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(lblNumeroVitorias3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVitoriasJogador1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(lblNumeroEmpates3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmpatesJogador1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(lblNumeroDerrotas1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDerrotasJogador1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(lblNumeroVitorias4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVitoriasJogador2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroPartidas2)
                                    .addComponent(lblNumeroEmpates4)
                                    .addComponent(lblNumeroDerrotas2))
                                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(panel4Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPartidasJogador2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDerrotasJogador2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmpatesJogador2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(lblNumeroPartidas1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPartidasJogador1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNick1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeJogador1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroPartidas1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPartidasJogador1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroVitorias3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVitoriasJogador1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroDerrotas1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDerrotasJogador1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroEmpates3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpatesJogador1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNick2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeJogador2))
                .addGap(22, 22, 22)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroPartidas2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPartidasJogador2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroVitorias4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVitoriasJogador2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroDerrotas2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDerrotasJogador2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroEmpates4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpatesJogador2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    
    private void configurarBotao(JButton btn, StringBuilder btnJogador) {
        if (jogoDaVelha.jogadorAtivo) {
            if (btnJogador.isEmpty()) {
                btnJogador.append("X");
                btn.setIcon(jogador1);
                jogoDaVelha.jogadorAtivo();
            }
        } else {
            if (btnJogador.isEmpty()) {
                btnJogador.append("O");
                btn.setIcon(jogador2);
                jogoDaVelha.jogadorAtivo();
            }
        }
    }
    
    private void carregarDadosJogadores() {
        usuario1 = dao.buscarPoId(FrmLogin.usuario.getId());
        usuario2 = dao.buscarPoId(FrmLogin.usuario2.getId());
        
        if (usuario1 != null && usuario2 != null) {
            lblJogador1.setText(usuario1.getNome());
            lblJogador2.setText(usuario2.getNome());
            lblNomeJogador1.setText(usuario1.getNome());
            lblNomeJogador2.setText(usuario2.getNome());
            
            atualizarCampos();
        }
    }
    
    private void limparCampos() {
        jogoDaVelha.btn1 = new StringBuilder();
        jogoDaVelha.btn2 = new StringBuilder();
        jogoDaVelha.btn3 = new StringBuilder();
        jogoDaVelha.btn4 = new StringBuilder();
        jogoDaVelha.btn5 = new StringBuilder();
        jogoDaVelha.btn6 = new StringBuilder();
        jogoDaVelha.btn7 = new StringBuilder();
        jogoDaVelha.btn8 = new StringBuilder();
        jogoDaVelha.btn9 = new StringBuilder();
        btn1.setIcon(null);
        btn2.setIcon(null);
        btn3.setIcon(null);
        btn4.setIcon(null);
        btn5.setIcon(null);
        btn6.setIcon(null);
        btn7.setIcon(null);
        btn8.setIcon(null);
        btn9.setIcon(null);

        jogoDaVelha.jogadorAtivo = true;
    }
    
    private void vitoriaJogador1() {
        JOptionPane.showMessageDialog(FrmJogo.this, usuario1.getNome() + " ganhou", "Mensagem de Vitória", JOptionPane.INFORMATION_MESSAGE);
        usuario1.incrementarPartida();
        usuario2.incrementarPartida();
        usuario1.incrementarVitoria();
        usuario2.incrementarDerrota();
        vitoriaJogador1++;
        atualizarCampos();
        
        lblNumeroVitorias1.setText("Número de vitórias: " + vitoriaJogador1);
        atualizarJogadores();
        limparCampos();
    }
    
    private void vitoriaJogador2() {
        JOptionPane.showMessageDialog(FrmJogo.this, usuario2.getNome() + " ganhou", "Mensagem de Vitória", JOptionPane.INFORMATION_MESSAGE);
        usuario1.incrementarPartida();
        usuario2.incrementarPartida();
        usuario2.incrementarVitoria();
        usuario1.incrementarDerrota();
        vitoriaJogador2++;
        atualizarCampos();
        
        lblNumeroVitorias2.setText("Número de vitórias: " + vitoriaJogador2);
        atualizarJogadores();
        limparCampos();
    }
    
    private void empate() {
        JOptionPane.showMessageDialog(FrmJogo.this, "O jogo empatou", "Mensagem de Empate", JOptionPane.INFORMATION_MESSAGE);
        usuario1.incrementarPartida();
        usuario2.incrementarPartida();
        usuario1.incrementarEmpate();
        usuario2.incrementarEmpate();
        empate++;
        atualizarCampos();
        
        lblNumeroEmpates.setText("Número de empates: " + empate);
        atualizarJogadores();
        limparCampos();
    }
    
    public void atualizarCampos() {
        lblPartidasJogador1.setText(Integer.toString(usuario1.getPartida()));
        lblVitoriasJogador1.setText(Integer.toString(usuario1.getVitoria()));
        lblDerrotasJogador1.setText(Integer.toString(usuario1.getDerrota()));
        lblEmpatesJogador1.setText(Integer.toString(usuario1.getEmpate()));

        lblPartidasJogador2.setText(Integer.toString(usuario2.getPartida()));
        lblVitoriasJogador2.setText(Integer.toString(usuario2.getVitoria()));
        lblDerrotasJogador2.setText(Integer.toString(usuario2.getDerrota()));
        lblEmpatesJogador2.setText(Integer.toString(usuario2.getEmpate()));
    }
    
    public void atualizarJogadores() {
        dao.atualizar(usuario1);
        dao.atualizar(usuario2);
    }
    
    private class JanelaListener extends WindowAdapter {

        @Override
        public void windowOpened(WindowEvent e) {
            getContentPane().setBackground(Color.BLACK);
            panel1.setBackground(Color.BLACK);
            panel2.setBackground(Color.BLACK);
            panel3.setBackground(Color.BLACK);
            panel4.setBackground(Color.BLACK);
            btnNovoJogo.setBackground(Color.BLACK);
            btnVoltar.setBackground(Color.BLACK);
            btnRanking.setBackground(Color.BLACK);
            btn1.setBackground(Color.gray);
            btn2.setBackground(Color.gray);
            btn3.setBackground(Color.gray);
            btn4.setBackground(Color.gray);
            btn5.setBackground(Color.gray);
            btn6.setBackground(Color.gray);
            btn7.setBackground(Color.gray);
            btn8.setBackground(Color.gray);
            btn9.setBackground(Color.gray);
            btnSair.setBackground(Color.BLACK);

            carregarDadosJogadores();
        }
        
    }
    
    private class BotoesJogoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obj = e.getSource();
            
            if (obj == btn1) {
                configurarBotao(btn1, jogoDaVelha.btn1);
            }
            if (obj == btn2) {
                configurarBotao(btn2, jogoDaVelha.btn2);
            }
            if (obj == btn3) {
                configurarBotao(btn3, jogoDaVelha.btn3);
            }
            if (obj == btn4) {
                configurarBotao(btn4, jogoDaVelha.btn4);
            }
            if (obj == btn5) {
                configurarBotao(btn5, jogoDaVelha.btn5);
            }
            if (obj == btn6) {
                configurarBotao(btn6, jogoDaVelha.btn6);
            }
            if (obj == btn7) {
                configurarBotao(btn7, jogoDaVelha.btn7);
            }
            if (obj == btn8) {
                configurarBotao(btn8, jogoDaVelha.btn8);
            }
            if (obj == btn9) {
                configurarBotao(btn9, jogoDaVelha.btn9);
            }
            
            int resultado = jogoDaVelha.verificarVencedor();
            
            if (resultado > 0) {
                switch (resultado) {
                    case 1:
                        vitoriaJogador1();
                        break;
                    case 2:
                        vitoriaJogador2();
                        break;
                    default:
                        empate();
                        break;
                }
            }
            
        }
        
    }
    
    private class NovoJogoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            limparCampos();
        }
        
    }
    
    private class VoltarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmLogin log = new FrmLogin();
            log.setVisible(true);

            setVisible(false);
        }
        
    }
}
