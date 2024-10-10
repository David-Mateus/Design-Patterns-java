import gof.singleton.SingletonLazy;
import gof.strategy.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        SingletonLazy singletonLazy =  SingletonLazy.getInstance();
//        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
//        singletonLazy1.mostraMsn();
//        singletonLazy.mostraMsn();
//        System.out.println(singletonLazy1);
//        System.out.println(singletonLazy);

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();

    }
}