package creational.singleton.solucao;

import java.lang.reflect.InvocationTargetException;

public class TesteAgendaSingleton {
    // Solução: singleton é uma classe estática cuja instância vai existir durante toda a execução do programa
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        // ------ Singleton EAGER ------
//        AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
//        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
//        System.out.println(agenda1);
//        System.out.println(agenda2);

//        reservaDiaEAGER("Sexta");
//        reservaDiaEAGER("Sabado");

        // ------ Singleton LAZY ------
//        AgendaSingletonLAZY agenda3 = AgendaSingletonLAZY.getInstance();
//        AgendaSingletonLAZY agenda4 = AgendaSingletonLAZY.getInstance();
//        System.out.println(agenda3);
//        System.out.println(agenda4);
//        reservaDiaLAZY("Sexta");
//        reservaDiaLAZY("Sabado");
//        System.out.println(agenda4.getDias());

        // ainda é possível criar instâncias diferentes da classe usando o código abaixo
        // Solução é criar um enum da classe
//        Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
//        construtorTravesso.setAccessible(true);
//        AgendaSingletonLAZY agendaTravessa1 = construtorTravesso.newInstance();
//        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();
//        System.out.println(agendaTravessa1);
//        System.out.println(agendaTravessa2);

       // ----- Singleton ENUM ------
        AgendaSingletonEnum agenda5 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda6 = AgendaSingletonEnum.getInstance();
        System.out.println(agenda5.hashCode());
        System.out.println(agenda6.hashCode());

        // reflection - esse código vai dar uma exceção, não é possível criar duas instâncias do singleton enum
//        Constructor<AgendaSingletonEnum> construtorTravesso1 = AgendaSingletonEnum.class.getDeclaredConstructor();
//        construtorTravesso1.setAccessible(true);
//        AgendaSingletonEnum agendaTravessa3 = construtorTravesso1.newInstance();
//        AgendaSingletonEnum agendaTravessa4 = construtorTravesso1.newInstance();
//
//        System.out.println(agendaTravessa3.hashCode());
//        System.out.println(agendaTravessa4.hashCode());

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");

    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
    }

    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
    }

    public static void reservaDiaEnum(String dia){
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
