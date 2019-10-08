public class TesteControleRemoto {
    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto(0,false,false);
        controle1.ligar();
        controle1.play();
        controle1.ligarMudo();
        controle1.abrirMenu();
    }

}
