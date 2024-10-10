package gof.singleton;


public class SingletonLazy {
    private static SingletonLazy instancia;

    //garantindo que ninguem fora dessa classe possa instanciar
    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstance(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
    public String mostraMsn(){
        return "Mostrar mensagem";
    }
}
