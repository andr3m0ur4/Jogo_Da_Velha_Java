package jogo.da.velha.model.beans;

public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private int partida;
    private int vitoria;
    private int derrota;
    private int empate;

    public Usuario() {
    }

    public Usuario(int id, String nome, String senha, int partida, int vitoria, int derrota, int empate) {
        setId(id);
        setNome(nome);
        setSenha(senha);
        setPartida(partida);
        setVitoria(vitoria);
        setDerrota(derrota);
        setEmpate(empate);
    }

    public Usuario(String nome, String senha) {
        setNome(nome);
        setSenha(senha);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPartida() {
        return partida;
    }

    public void setPartida(int partida) {
        this.partida = partida;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", senha=" + senha + ", partida=" + partida + ", vitoria=" + vitoria + ", derrota=" + derrota + ", empate=" + empate + '}';
    }
}
