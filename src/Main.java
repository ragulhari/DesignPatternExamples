import com.examples.command.*;
import com.examples.decorator.*;
import com.examples.composite.*;
import com.examples.adapter.*;
import com.examples.memento.ExecutarMemento;
import com.examples.observer.*;
import com.examples.singleton.*;
import com.examples.strategy.*;
import com.examples.factoryMethod.*;
import com.examples.templateMethod.*;

public class Main {

    public static void main(String[] args){

        String pattern = "memento";

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
                TesteAdapter testeAdapter = new TesteAdapter();
                System.out.println("--------Iniciando teste com adapter do tipo classe-------");
                testeAdapter.iniciarClassTypeTest();
                System.out.println("---------------------------------------------------------");
                System.out.println("--------Iniciando teste com adapter do tipo objeto-------");
                testeAdapter.iniciarObjectTypeTest();
                System.out.println("---------------------------------------------------------");
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
            case "templateMethod":
                Partida p = new Basquetebol();
                p.jogo();
                p = new Futebol();
                p.jogo();
                break;
            case "command":
                ExecutarCommand ex = new ExecutarCommand();
                ex.iniciar();
                break;
            case "memento":
                ExecutarMemento.go();

        }

    }
}

