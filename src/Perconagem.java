public abstract class Perconagem {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private int nivel;
    private int experiencia;

    public Perconagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = 1;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public boolean estaVivo(){
       return vida > 0;
    }
    
    public void receberDano(int dano){
        vida -= dano;
        if(vida < 0) {
            vida = 0;
        }
    }
    
    public int atacar(Perconagem inimigo){
        int dano = (ataque + (nivel * 2 )) - inimigo.defesa;
        if (dano < 0){
            dano = 0;
        }
        inimigo.receberDano(dano);
        return dano;
    }
    
    public void ganharExperiencia(int xp){
        experiencia += xp;
        if (experiencia >= nivel * 100){
            experiencia = 0;
            nivel ++;
            ataque += 2;
            defesa += 1;
            vida += 10;
            System.out.println("\n" + nome + " subiu de nível " + nivel);
        }
    }

    @Override
    public String toString() {
        return nome + " [Vida=" + vida + ", Ataque=" + ataque +
                ", Defesa=" + defesa + ", Nível=" + nivel + "]";
    }
}
