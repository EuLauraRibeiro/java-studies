public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("O CEP não foi encontrado!");
        }
    }
    static String formatarCep (String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
            //simula cep formatado
            return "23.765-064";
    }
}
