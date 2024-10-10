package gof.singleton;

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    //garantindo que ninguem fora dessa classe possa instanciar
    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstance(){

        return instancia;
    }
}
