package gof.facade;

public class Main {
    public static void main(String[] args) {
        Projetor projetor = new Projetor();
        SistemaDeSom sistemaDeSom = new SistemaDeSom();
        ReprodutorDVD reprodutorDVD = new ReprodutorDVD();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projetor, sistemaDeSom, reprodutorDVD);

        homeTheater.assistirFilme(); // Liga todos os dispositivos
        homeTheater.desligarFilme(); // Desliga todos os dispositivos
    }
}
