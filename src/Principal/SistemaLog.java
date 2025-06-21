package Principal;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;

public class SistemaLog {

    public static void main(String[]args){
//        Para isso, implemente um programa que:
//
//        Simule a criação de uma tarefa através de uma variável simples, por exemplo String tarefa = "Enviar relatório semanal";.
//        Registre a data e a hora exatas da criação.
//                Exiba essas informações no formato adequado.
//                Saída esperada:
//
//        Data atual: 2025-03-15
//        Hora atual: 14:30:45.089914300
        String tarefa = "Enviar relátorio semanal";


        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Tarefa: "+ tarefa);
        System.out.println("Data atual: "+ dataAtual);
        System.out.println("Hora atual: "+ horaAtual);
    }
}
