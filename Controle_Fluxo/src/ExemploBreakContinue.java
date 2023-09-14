public class ExemploBreakContinue {
    public static void main(String[] args) {
	
        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                break; //1, 2
            System.out.println(numero);
        }

        for(int numeros = 1; numeros <= 5; numeros ++){
            if(numeros == 3){
                System.out.println("Opa");
                continue;//1, 2, opa, 4, 5
            }
            System.out.println(numeros);
        }

    
        }
}
