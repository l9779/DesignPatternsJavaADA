package creational.singleton.problema;

public class TesteAgenda {
    // Problema: a classe agenda precisa memorizar os dias da semana durante todo o funcionamento da aplicação
    // é necessário criar um Singleton
    public static void main(String[] args) {
        reservaDia("Sexta");
        reservaDia("Sabado");
    }

    public static void reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
