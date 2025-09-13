public class Batalha {

    public static void lutar(Perconagem p1, Perconagem p2){
        System.out.println("\n=== Batalha: " + p1.getNome() + " VS " + p2.getNome() + " ===");

        while (p1.estaVivo() && p2.estaVivo()){
            int dano1 = p1.atacar(p2);
            System.out.println("\n" + p1.getNome() + " causou " + dano1 + " de dano em " + p2.getNome());

            if (!p2.estaVivo()) break;

            int dano2 = p2.atacar(p1);
            System.out.println("\n" + p2.getNome() + " causou " + dano2 + " de dano em " + p1.getNome());
        }

        if (p1.estaVivo()) {
            System.out.println("\n" + p1.getNome() + " venceu a batalha!");
            p1.ganharExperiencia(120);
        } else {
            System.out.println("\n" + p2.getNome() + " venceu a batalha!");
            p2.ganharExperiencia(120);
        }
    }

}
