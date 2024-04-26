package edu.gebson.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) throws Exception {
       
        String primeiroNome = "Gebson";
        String segundoNome = "Silva";
        
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        //aqui eu stou pedindo para imprimir o método
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto  (String primeiroNome, String segundoNome) {
        return " Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
