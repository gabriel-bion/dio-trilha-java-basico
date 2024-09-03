import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //Executando repetidas vezes ate alguem atender
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Alô !!!");
    }
    
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //Negando o ato de continuar tocando
        return ! atendeu;
    }
}