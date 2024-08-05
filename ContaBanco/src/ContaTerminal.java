import java.util.Scanner;
/*
 * @author AnthonyLuciano
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //informções vazias, ser preenchidas pelo usuario
        int numero = 0;
        String agencia = "";
        String nome_cliente = "";
        double Saldo = 1000;
        //interação com o sistema
        System.out.println("qual o seu nome?");
        nome_cliente = input.nextLine();
        System.out.println("ola "+ nome_cliente + " Por favor, digite o número da Agência !");
        vazio();
        agencia = input.nextLine();
        System.out.println("agora digite seu numero de Login");
        vazio();
        numero = input.nextInt();
        System.out.println("gerando saldo...");
        System.out.println(nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo incial de " + Saldo + " R$ já está disponível para saque");
    }
    public static void vazio(){
        System.out.print("");
    }
}
