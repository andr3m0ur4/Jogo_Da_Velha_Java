package jogo.da.velha.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public abstract class Janela extends JFrame {
    public Janela() {
        super("Jogo da Velha");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }
    
    protected void centralizar() {
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamanhoTela = getSize();
        
        int largura = (resolucao.width - tamanhoTela.width) / 2;
        int altura = (resolucao.height - tamanhoTela.height) / 2;
        
        setLocation(largura, altura);
        setResizable(false);
    }
    
    protected class SairListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
        
    }
    
    protected class CadastrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmCadastrar cad = new FrmCadastrar();
            cad.setVisible(true);
            
            setVisible(false);
        }
        
    }
    
    protected class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmLogin log = new FrmLogin();
            log.setVisible(true);
            
            setVisible(false);
        }
        
    }
    
    protected class VoltarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmInicio ini = new FrmInicio();
            ini.setVisible(true);

            setVisible(false);
        }
        
    }
    
    protected class RankingListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmRanking ranking = new FrmRanking();
            ranking.setVisible(true);
            
            setVisible(false);
        }
        
    }
}
