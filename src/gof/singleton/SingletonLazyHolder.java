package gof.singleton;



public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static  SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    //garantindo que ninguem fora dessa classe possa instanciar
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstance(){

        return InstanceHolder.instancia;
    }
}
