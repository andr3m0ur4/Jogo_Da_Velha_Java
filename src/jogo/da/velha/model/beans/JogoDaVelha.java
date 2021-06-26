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
        
        verificarVencedor(new StringBuilder("X"));
        verificarVencedor(new StringBuilder("O"));
    }
    
    public int verificarVencedor(StringBuilder palpite) {
        // ------------------ verificando linhas -----------------
        if (isEqual(btn1, palpite) && isEqual(btn2, palpite) && isEqual(btn3, palpite)) {

            if (isEqual(btn1, palpite)) {
                return 1;
            } else {
                return 2;
            }

        } else if (isEqual(btn4, palpite) && isEqual(btn5, palpite) && isEqual(btn6, palpite)) {

            if (isEqual(btn4, palpite)) {
                return 1;
            } else {
                return 2;
            }
        } else if (isEqual(btn7, palpite) && isEqual(btn8, palpite) && isEqual(btn9, palpite)) {

            if (isEqual(btn7, palpite)) {
                return 1;
            } else {
                return 2;
            }

        // ------------------ verificando colunas -----------------
        } else if (isEqual(btn1, palpite) && isEqual(btn4, palpite) && isEqual(btn7, palpite)) {

            if (isEqual(btn1, palpite)) {
                return 1;
            } else {
                return 2;
            }

        } else if (isEqual(btn2, palpite) && isEqual(btn5, palpite) && isEqual(btn8, palpite)) {

            if (isEqual(btn2, palpite)) {
                return 1;
            } else {
                return 2;
            }
        } else if (isEqual(btn3, palpite) && isEqual(btn6, palpite) && isEqual(btn9, palpite)) {

            if (isEqual(btn3, palpite)) {
                return 1;
            } else {
                return 2;
            }

        // ------------------ verificando diagonais -----------------
        } else if (isEqual(btn1, palpite) && isEqual(btn5, palpite) && isEqual(btn9, palpite)) {

            if (isEqual(btn1, palpite)) {
                return 1;
            } else {
                return 2;
            }

        } else if (isEqual(btn3, palpite) && isEqual(btn5, palpite) && isEqual(btn7, palpite)) {

            if (isEqual(btn3, palpite)) {
                return 1;
            } else {
                return 2;
            }
        } 
        // ------------------ verificando empates -----------------
        else if (
                btn1.isEmpty()
                && btn2.isEmpty()
                && btn3.isEmpty()
                && btn4.isEmpty()
                && btn5.isEmpty()
                && btn6.isEmpty()
                && btn7.isEmpty()
                && btn8.isEmpty()
                && btn9.isEmpty()
        ) {
            return 3;
        }
        
        return 0;
    }
    
    private boolean isEqual(StringBuilder str1, StringBuilder str2) {
        return str1.compareTo(str2) == 0;
    }
}
