public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        byte tempo = 123;
        short ano = 2023;
        int idade = 28;
        long cpf = 98765432109L; //zero no primeiro dígito tem que usar string - L no final
        float numeroAleatorio = 149.54F; //F no final do número
        double salario = 1327.54;
        char sexo = 'F';
        String boasVindas = "Seja Bem-Vindo!";
        final double VALOR_DE_PI = 3.15; //constante
        //Data dataNascimento = new Date(); //classe - criando um novo objeto


        System.out.println(boasVindas);
        System.out.print(VALOR_DE_PI);        
    }
}
