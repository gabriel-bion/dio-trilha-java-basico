public class FormatadorCepEx {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376504");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de cegocios");
        }
       
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }
            //simulando um cep formatao
            return "23765-064";
    }
    static class CepInvalidoException extends Exception {
        public CepInvalidoException() {
            super("CEP inválido");
        }
    }
}
