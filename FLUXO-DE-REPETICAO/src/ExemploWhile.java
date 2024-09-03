import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int contadorDoces = 0; // Inicializa o contador de doces

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
            contadorDoces++; // Incrementa o contador de doces
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        System.out.println("Joãozinho comprou " + contadorDoces + " doces"); // Exibe o número de doces comprados
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
