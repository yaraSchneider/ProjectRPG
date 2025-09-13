public class Main {
    public static void main(String[] args) {

        Perconagem guerreiro = new Guerreiro("Steve Rogers", 150, 50,10);
        Perconagem mago = new Mago("Dr. Estranho", 40, 80, 25);
        Perconagem arqueiro = new Arqueiro("Clint Barton", 45, 60, 15);

        System.out.println(guerreiro);
        System.out.println(mago);
        System.out.println(arqueiro);

        // Batalha entre guerreiro e mago
        Batalha.lutar(guerreiro, mago);

        // Batalha entre vencedor e arqueiro
        if (guerreiro.estaVivo()) {
            Batalha.lutar(guerreiro, arqueiro);
        } else {
            Batalha.lutar(mago, arqueiro);
        }
    }
}
