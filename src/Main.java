import com.examples.decorator.*;
import com.examples.composite.*;
import com.examples.adapter.*;
import com.examples.observer.SensorLuzes;
import com.examples.observer.SensorPortao;
import com.examples.observer.SistemaAlarme;
import com.examples.observer.Vigilancia;
import com.examples.singleton.*;
import com.examples.strategy.*;
import com.examples.factoryMethod.*;

public class Main {

    public static void main(String[] args){

        String pattern = "factorymethod";

        switch (pattern){
            case "facade":
                com.examples.facade.Carro cFacade = new com.examples.facade.Carro();
                System.out.println("Ligando o carro ==> " + cFacade.ligar());
                System.out.println("Desligando o carro ==> " + cFacade.desligar());
                break;
            case "mediator":
                com.examples.mediator.Carro cMediator = new com.examples.mediator.Carro();
                System.out.println("Ligando o carro ==> " + cMediator.ligar());
                System.out.println("Desligando o carro ==> " + cMediator.desligar());
                break;
            case "decorator":
                Weapon weapon = new BaseWeapon();
                Weapon zoomScopeWeapon = new ZoomScopeWeapon(new BaseWeapon());
                System.out.println("\nArma básica: ");
                weapon.load();
                System.out.println("\nArma com scope zoom: ");
                zoomScopeWeapon.load();
                break;
            case "composite":
                TestarCompositePattern testeComposite = new TestarCompositePattern();
                testeComposite.executarTestes();
            case "adapter":
                TestarAdapterPattern testeAdapter = new TestarAdapterPattern();
                testeAdapter.iniciar();
                break;
            case "singleton":
                Comunicador obj = new Comunicador();
                obj.realizarConexoes();
                break;
            case "strategy":
                StrategyDemo strat = new StrategyDemo();
                strat.executarDemo();
                break;
            case "observer":
                SistemaAlarme ss = new SistemaAlarme();
                ss.registrar( new SensorPortao());
                ss.registrar( new SensorLuzes());
                ss.registrar( new Vigilancia());
                System.out.println("Alarme disparado!!!");
                ss.dispararAlarme();
                break;
            case "factorymethod":
                Cozinheiro c = new Cozinheiro();
                Prato f1 = c.pedePrato("BIFE");
                f1.cozinhar();
                Prato f2 = c.pedePrato("FRANGO");
                f2.cozinhar();
                Prato f3 = c.pedePrato("PEIXE");
                f3.cozinhar();
                break;

        }

    }
}

