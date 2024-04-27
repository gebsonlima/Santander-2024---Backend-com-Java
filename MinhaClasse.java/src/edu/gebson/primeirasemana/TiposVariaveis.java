package edu.gebson.primeirasemana;

public class TiposVariaveis {
    
    public static void main(String [] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 55750000; //se começar com zero, pode-se usar o tipo string
        long cpf = 98541568711L; //se começar com zero, pode-se utilizar outro tipo. precisa ser encerrado com L.
        float pi = 3.14f; //float se colocar a letra f no fim. 
        double salario = 1275.33;

        final double VALOR_DE_PI = 3.14;
    }

    //int, byte, short, long, float, double, boolean e char - não são considerados objetos - represetam valores brutos. Armazenados na pilha de memoria. (Memory stack)

    //byte - 1 byte - valor minimo -128
    //short - 2 byte - -32.768
    //int - 4 bytes - -2.147.483.648 - mais utilizado
    //long - 8 bytes - -9.223.372.036.854.775.808
    
    //tipos que podem conter partes fracionadas
    //float - 4 bytes - -3,4028E + 38
    //double - 8 bytes - -1,7976E 308  - mais comum em projetos. 
}
