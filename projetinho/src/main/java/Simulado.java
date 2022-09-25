public class Simulado {

    public int somaNumerosImpares (int numeros[]){

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0){
                soma += numeros[i];
            }
        }
        return soma;
    }

    public String concatenaArrayEmString(int numeros[]){

        String concatenacao = "";

        for (int i = 0; i < numeros.length; i++) {
            concatenacao += numeros[i] + ",";
        }
        return concatenacao;
    }

    public int quantidadeLetraNome(String nome){

        int quantidadeDeLetrasA = 0;

        for (int i = 0; i < nome.length(); i++) {
            char caractere = nome.charAt(i);
            if (caractere == 'A' || caractere == 'a'){
                quantidadeDeLetrasA += 1;
            }
        }
        return quantidadeDeLetrasA;
    }

    public int diasDeMilitar(int dia, int mes, int ano){

        int diaInicialDePraca = 1;
        int mesInicialDePraca = 6;
        int anoInicialDePraca = 2020;

        int anosDePracaEmDias = (ano-anoInicialDePraca)*365;
        int mesesDePracaEmDias = (mes-mesInicialDePraca)*30;
        int diasDePraca = dia-diaInicialDePraca;

        int tempoDePraca = anosDePracaEmDias+mesesDePracaEmDias+diasDePraca;
        return tempoDePraca;

    }

}
