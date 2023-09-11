import java.util.Locale;
import java.util.Scanner; 

/**<h1>Conta Bancária - Projeto</h1>
 * O projeto ContaTerminal tem como objetivo colocar em prática os fundamentos aprendidos na linguagem Java
 * 
 * @author  Gabih Santana
 * @version 1.0
 * @since   10/09/2023
 * <br>
 * util.Locale - define o local que será levado em consideração, evitando má *interpretação de dados
 * <br>
 * util.Scanner - para utilizar a classe scanner e ter uma boa interação com o usuário
 * 
 */

public class ContaTerminal {
    /**
         * Este programa irá ler os dados inseridos pelo usuário e imprimir uma mensagem final
         * leituraDados está sendo criada, juntamente com a classe Scanner, para dar suporte ao restante do código e realizar uma interação assertiva com o usuário
         * <br><br>
         * Há variáveis que irão auxiliar a armazenar os dados inseridos pelo usuário
         *<br><br>
         * No final do programa, será delvolvido uma mensagem indicando que a operação ocorreu de forma satisfatória
         */
    public static void main(String[] args) {

        Scanner leituraDados = new Scanner(System.in).useLocale(Locale.US); 
        
        System.out.println(">>>> Seja bem-vindo(a) ao banco Santander! <<<<");

        //irá ler o número da conta inserido pelo cliente via stdin
        System.out.println("Por favor, insira o número da conta: ");
        int numero = leituraDados.nextInt();

        //irá ler o número da agência do cliente via stdin
        System.out.println("Insira a agência: ");
        String agencia = leituraDados.next();

        //irá ler o primeiro do cliente via stdin
        System.out.println("Insira o seu primeiro nome: ");
        String primeiroNome = leituraDados.next();

        //irá ler o sobrenome do cliente via stdin
        System.out.println("Insira o seu sobrenome: ");
        String sobrenome = leituraDados.next();

        //irá ler o valor que o cliente deseja sacar via stdin
        System.out.println("Insira o valor de saque (R$): ");
        Double saldo = leituraDados.nextDouble();

        //imprime na tela a mensagem de retorno para o usuário, indicando que tudo deu certo 
        System.out.println("Olá " + primeiroNome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + " Conta: " + numero + " e seu saldo R$" + saldo + " já está disponível para saque."); 
    }
}
