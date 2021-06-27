package jogo.da.velha.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import jogo.da.velha.model.beans.Usuario;
import jogo.da.velha.model.dao.UsuarioDAO;

public class FrmRanking extends JFrame {
    private JButton btnVoltar;
    private JPanel jPanel1;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lblColocacao;
    private JLabel lblColocacaoAtual;
    private JLabel lblJogadorAtual1;
    private JLabel lblJogadorAtual2;
    private JLabel lblNomeDoJogador;
    private JLabel lblNomeJogador1;
    private JLabel lblNomeJogador2;
    private JLabel lblNomeJogador3;
    private JLabel lblNomeJogador4;
    private JLabel lblNomeJogador5;
    private JLabel lblNomeJogadorAtual;
    private JLabel lblPontuacao;
    private JLabel lblPontuacao1;
    private JLabel lblPontuacao2;
    private JLabel lblPontuacao3;
    private JLabel lblPontuacao4;
    private JLabel lblPontuacao5;
    private JLabel lblPontuacaoAtual;
    private JLabel lblPontuacaoAtual1;
    private JLabel lblPontuacaoAtual2;
    private JLabel lblPosicaoAtual1;
    private JLabel lblPosicaoAtual2;
    private JLabel lblTopo;
    private JPanel panel1;
    private JPanel panel2;
    private UsuarioDAO dao;
    
    public FrmRanking() {
        initComponents();
        dao = new UsuarioDAO();
    }
    
    private void initComponents() {
        panel1 = new JPanel();
        lblNomeDoJogador = new JLabel();
        lbl1 = new JLabel();
        lblPontuacao = new JLabel();
        lblColocacao = new JLabel();
        lbl2 = new JLabel();
        lbl3 = new JLabel();
        lbl4 = new JLabel();
        lbl5 = new JLabel();
        lblNomeJogador1 = new JLabel();
        lblNomeJogador2 = new JLabel();
        lblNomeJogador3 = new JLabel();
        lblNomeJogador4 = new JLabel();
        lblNomeJogador5 = new JLabel();
        lblPontuacao1 = new JLabel();
        lblPontuacao2 = new JLabel();
        lblPontuacao3 = new JLabel();
        lblPontuacao4 = new JLabel();
        lblPontuacao5 = new JLabel();
        jPanel1 = new JPanel();
        btnVoltar = new JButton();
        panel2 = new JPanel();
        lblPosicaoAtual1 = new JLabel();
        lblJogadorAtual1 = new JLabel();
        lblPontuacaoAtual1 = new JLabel();
        lblPontuacaoAtual = new JLabel();
        lblNomeJogadorAtual = new JLabel();
        lblColocacaoAtual = new JLabel();
        lblPosicaoAtual2 = new JLabel();
        lblJogadorAtual2 = new JLabel();
        lblPontuacaoAtual2 = new JLabel();
        lblTopo = new JLabel();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new JanelaListener());
        
        panel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(
                null,
                "Ranking",
                TitledBorder.CENTER,
                TitledBorder.DEFAULT_POSITION,
                new Font("Tahoma", 1, 18),
                new Color(255, 255, 255)
        ), BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.white, Color.white, Color.white, Color.white)));

        lblNomeDoJogador.setFont(new Font("Tahoma", 1, 14));
        lblNomeDoJogador.setForeground(new Color(255, 255, 255));
        lblNomeDoJogador.setText("Nome do Jogador");

        lbl1.setFont(new Font("Tahoma", 1, 14));
        lbl1.setForeground(new Color(204, 255, 0));
        lbl1.setText("1º");

        lblPontuacao.setFont(new Font("Tahoma", 1, 14));
        lblPontuacao.setForeground(new Color(255, 255, 255));
        lblPontuacao.setText("Pontuação");

        lblColocacao.setFont(new Font("Tahoma", 1, 14));
        lblColocacao.setForeground(new Color(255, 255, 255));
        lblColocacao.setText("Colocação");

        lbl2.setFont(new Font("Tahoma", 1, 14));
        lbl2.setForeground(new Color(204, 204, 204));
        lbl2.setText("2º");

        lbl3.setFont(new Font("Tahoma", 1, 14));
        lbl3.setForeground(new Color(171, 74, 2));
        lbl3.setText("3º");

        lbl4.setFont(new Font("Tahoma", 1, 14));
        lbl4.setForeground(new Color(255, 255, 255));
        lbl4.setText("4º");

        lbl5.setFont(new Font("Tahoma", 1, 14));
        lbl5.setForeground(new Color(255, 255, 255));
        lbl5.setText("5º");

        lblNomeJogador1.setFont(new Font("Tahoma", 1, 14));
        lblNomeJogador1.setForeground(new Color(204, 255, 0));
        lblNomeJogador1.setText("Nome do Jogador");

        lblNomeJogador2.setFont(new Font("Tahoma", 1, 14));
        lblNomeJogador2.setForeground(new Color(204, 204, 204));
        lblNomeJogador2.setText("Nome do Jogador");

        lblNomeJogador3.setFont(new Font("Tahoma", 1, 14));
        lblNomeJogador3.setForeground(new Color(171, 74, 2));
        lblNomeJogador3.setText("Nome do Jogador");

        lblNomeJogador4.setFont(new Font("Tahoma", 1, 14));
        lblNomeJogador4.setForeground(new Color(255, 255, 255));
        lblNomeJogador4.setText("Nome do Jogador");

        lblNomeJogador5.setFont(new Font("Tahoma", 1, 14));
        lblNomeJogador5.setForeground(new Color(255, 255, 255));
        lblNomeJogador5.setText("Nome do Jogador");

        lblPontuacao1.setFont(new Font("Tahoma", 1, 14));
        lblPontuacao1.setForeground(new Color(204, 255, 0));
        lblPontuacao1.setText("Pontuação");

        lblPontuacao2.setFont(new Font("Tahoma", 1, 14));
        lblPontuacao2.setForeground(new Color(204, 204, 204));
        lblPontuacao2.setText("Pontuação");

        lblPontuacao3.setFont(new Font("Tahoma", 1, 14));
        lblPontuacao3.setForeground(new Color(171, 74, 2));
        lblPontuacao3.setText("Pontuação");

        lblPontuacao4.setFont(new Font("Tahoma", 1, 14));
        lblPontuacao4.setForeground(new Color(255, 255, 255));
        lblPontuacao4.setText("Pontuação");

        lblPontuacao5.setFont(new Font("Tahoma", 1, 14));
        lblPontuacao5.setForeground(new Color(255, 255, 255));
        lblPontuacao5.setText("Pontuação");
        
        GroupLayout panel1Layout = new GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblColocacao)
                    .addComponent(lbl1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeJogador2)
                    .addComponent(lblNomeJogador1)
                    .addComponent(lblNomeJogador3)
                    .addComponent(lblNomeJogador4)
                    .addComponent(lblNomeDoJogador)
                    .addComponent(lblNomeJogador5))
                .addGap(58, 58, 58)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblPontuacao, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontuacao5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontuacao4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontuacao3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontuacao2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontuacao1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDoJogador, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontuacao, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColocacao, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeJogador1)
                    .addComponent(lblPontuacao1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeJogador2)
                    .addComponent(lblPontuacao2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeJogador3)
                    .addComponent(lblPontuacao3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeJogador4)
                    .addComponent(lblPontuacao4))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeJogador5)
                    .addComponent(lblPontuacao5))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        
        panel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(
                null,
                "Posição e Pontuação dos Jogadores Logados",
                TitledBorder.CENTER,
                TitledBorder.DEFAULT_POSITION,
                new Font("Tahoma", 1, 18),
                new Color(255, 255, 255)
        ), BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.white, Color.white, Color.white, Color.white)));

        lblPosicaoAtual1.setFont(new Font("Tahoma", 1, 14));
        lblPosicaoAtual1.setForeground(new Color(255, 255, 255));
        lblPosicaoAtual1.setText("Pos");

        lblJogadorAtual1.setFont(new Font("Tahoma", 1, 14));
        lblJogadorAtual1.setForeground(new Color(255, 255, 255));
        lblJogadorAtual1.setText("Jogador 1");

        lblPontuacaoAtual1.setFont(new Font("Tahoma", 1, 14));
        lblPontuacaoAtual1.setForeground(new Color(255, 255, 255));
        lblPontuacaoAtual1.setText("pont");

        lblPontuacaoAtual.setFont(new Font("Tahoma", 1, 14));
        lblPontuacaoAtual.setForeground(new Color(255, 51, 51));
        lblPontuacaoAtual.setText("Pontuação");

        lblNomeJogadorAtual.setFont(new Font("Tahoma", 1, 14));
        lblNomeJogadorAtual.setForeground(new Color(102, 255, 102));
        lblNomeJogadorAtual.setText("Nome do Jogador");

        lblColocacaoAtual.setFont(new Font("Tahoma", 1, 14));
        lblColocacaoAtual.setForeground(new Color(204, 255, 0));
        lblColocacaoAtual.setText("Colocação");

        lblPosicaoAtual2.setFont(new Font("Tahoma", 1, 14));
        lblPosicaoAtual2.setForeground(new Color(255, 255, 255));
        lblPosicaoAtual2.setText("Pos");

        lblJogadorAtual2.setFont(new Font("Tahoma", 1, 14));
        lblJogadorAtual2.setForeground(new Color(255, 255, 255));
        lblJogadorAtual2.setText("Jogador 1");

        lblPontuacaoAtual2.setFont(new Font("Tahoma", 1, 14));
        lblPontuacaoAtual2.setForeground(new Color(255, 255, 255));
        lblPontuacaoAtual2.setText("pont");
        
        btnVoltar.setForeground(new Color(255, 51, 51));
        btnVoltar.setText("Voltar ao jogo");
        btnVoltar.addActionListener(new VoltarListener());
        
        GroupLayout panel2Layout = new GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblColocacaoAtual)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNomeJogadorAtual)
                        .addGap(58, 58, 58)
                        .addComponent(lblPontuacaoAtual, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblPosicaoAtual1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblJogadorAtual1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPontuacaoAtual1)
                        .addGap(38, 38, 38))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblPosicaoAtual2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblJogadorAtual2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPontuacaoAtual2)
                        .addGap(38, 38, 38))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeJogadorAtual, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontuacaoAtual, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColocacaoAtual, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosicaoAtual1)
                    .addComponent(lblJogadorAtual1)
                    .addComponent(lblPontuacaoAtual1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosicaoAtual2)
                    .addComponent(lblJogadorAtual2)
                    .addComponent(lblPontuacaoAtual2))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTopo.setIcon(new ImageIcon(getClass().getResource("./img/coroa.gif")));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTopo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTopo)
                        .addGap(37, 37, 37)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }
    
    private void ranking() {
        List<Usuario> usuarios = dao.ranking();
        
        lblNomeJogador1.setText(usuarios.get(0).getNome());
        lblPontuacao1.setText(Integer.toString(usuarios.get(0).getVitoria()));
        lblNomeJogador2.setText(usuarios.get(1).getNome());
        lblPontuacao2.setText(Integer.toString(usuarios.get(1).getVitoria()));
        lblNomeJogador3.setText(usuarios.get(2).getNome());
        lblPontuacao3.setText(Integer.toString(usuarios.get(2).getVitoria()));
        lblNomeJogador4.setText(usuarios.get(3).getNome());
        lblPontuacao4.setText(Integer.toString(usuarios.get(3).getVitoria()));
        lblNomeJogador5.setText(usuarios.get(4).getNome());
        lblPontuacao5.setText(Integer.toString(usuarios.get(4).getVitoria()));
        
        Usuario usuario1 = dao.buscarPoId(FrmLogin.usuario.getId());
        Usuario usuario2 = dao.buscarPoId(FrmLogin.usuario2.getId());
        
        int posicao = 0;
        
        for (Usuario usuario : usuarios) {
            posicao++;
            
            if (usuario1.getId() == usuario.getId()) {
                lblPosicaoAtual1.setText(posicao + "°");
                lblJogadorAtual1.setText(usuario.getNome());
                lblPontuacaoAtual1.setText(Integer.toString(usuario.getVitoria()));
            }
            
            if (usuario2.getId() == usuario.getId()) {
                lblPosicaoAtual2.setText(posicao + "°");
                lblJogadorAtual2.setText(usuario.getNome());
                lblPontuacaoAtual2.setText(Integer.toString(usuario.getVitoria()));
            }
        }
    }
    
    private class JanelaListener extends WindowAdapter {

        @Override
        public void windowOpened(WindowEvent e) {
            getContentPane().setBackground(Color.BLACK);
            panel1.setBackground(Color.BLACK);
            panel2.setBackground(Color.BLACK);
            btnVoltar.setBackground(Color.BLACK);

            ranking();
        }
        
    }
    
    private class VoltarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmJogo jogo = new FrmJogo();
            jogo.setVisible(true);

            setVisible(false);
        }
        
    }
}
