public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;
       
        if(nota >= 7)
         System.out.println("Aprovado");
 
        else if(nota >= 4 && nota < 7){
            System.out.println("Recuperação!");
        }
        else
         System.out.println("Reprovado");

        String resultado = nota >= 7? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        String resultado2 = nota >= 7 ? "Aprovado" : nota >= 4 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

    }
}
