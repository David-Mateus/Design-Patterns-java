package gof.facade;

public class HomeTheaterFacade {
    private Projetor projetor;
    private SistemaDeSom sistemaDeSom;
    private ReprodutorDVD reprodutorDVD;
    public HomeTheaterFacade(Projetor projetor, SistemaDeSom sistemaDeSom, ReprodutorDVD reprodutorDVD) {
        this.projetor = projetor;
        this.sistemaDeSom = sistemaDeSom;
        this.reprodutorDVD = reprodutorDVD;
    }

    public void assistirFilme() {
        projetor.ligar();
        sistemaDeSom.ligar();
        reprodutorDVD.ligar();
        System.out.println("Preparando o home theater para assistir ao filme.");
    }

    public void desligarFilme() {
        projetor.desligar();
        sistemaDeSom.desligar();
        reprodutorDVD.desligar();
        System.out.println("Home theater desligado.");
    }
}
