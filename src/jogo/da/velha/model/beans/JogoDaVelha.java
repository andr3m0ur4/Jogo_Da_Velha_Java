package jogo.da.velha.model.beans;

public class JogoDaVelha {
    public boolean jogadorAtivo;
    public StringBuilder btn1;
    public StringBuilder btn2;
    public StringBuilder btn3;
    public StringBuilder btn4;
    public StringBuilder btn5;
    public StringBuilder btn6;
    public StringBuilder btn7;
    public StringBuilder btn8;
    public StringBuilder btn9;
    
    public JogoDaVelha() {
        jogadorAtivo = true;
        btn1 = new StringBuilder();
        btn2 = new StringBuilder();
        btn3 = new StringBuilder();
        btn4 = new StringBuilder();
        btn5 = new StringBuilder();
        btn6 = new StringBuilder();
        btn7 = new StringBuilder();
        btn8 = new StringBuilder();
        btn9 = new StringBuilder();
    }
    
    public void jogadorAtivo() {
        jogadorAtivo = !jogadorAtivo;
    }
}
