

public class Operadores {
    public static void main(String[] args) {
        //String nomeCompleto = "Linguadem " + " Java";

        //System.out.println(nomeCompleto);
        
        //String concatenacao = 1+1+1+"1";
        //System.out.println(concatenacao);

        //concatenacao = 1+"1"+1+1;
        //System.out.println(concatenacao);

        /*int numero = 5;
        numero++ ; 
        System.out.println(numero);*/

        //boolean variavel = true;
        //System.out.println(!variavel);//o sinal de exclamação é o inverso.

        /*int a, b;
        a = 6;
        b = 6;
        if(a==b)
            resultado = "verdadeito";
        else
            resultado = "falso";*/
        //operador ternario:
        /*String resultado = a==b ? "verdadeito" : "falso";


        System.out.println(resultado); */

        String nomeUm = "Gabriel";
        String nomeDois = "Gabriel";
        String nomeIgauis = "";

        System.out.print("Os nomes são iguais ?");

        System.out.println(nomeIgauis = nomeUm==nomeDois ? " sim" : "não");
        int numeroUm = 3;
        int numeroDois = 4;

        if(numeroUm < numeroDois) {
            System.out.println("A nossa condição é verdadeira");
        }else
            System.out.println("A nossa condição é falsa");

    }
}
