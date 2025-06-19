package Principal;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args){
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 10, 19);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataPrimeiraParcela.isEqual(LocalDate.now())){
            System.out.println("Hoje é o dia do vencimento");
        }else if (dataPrimeiraParcela.isAfter(LocalDate.now())) {
            System.out.println("Ainda não está no dia do vencimento");
        }else {
            System.out.println("Parcela vencida!!!");
        }

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);
    }

}
