import java.util.Scanner;
public class Proj2_1_AverageOfThree {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double number1;
        double number2;
        double number3;
        double avarege;

        System.out.println("Por favor entre com os trÊs números: ");
        number1 = keyboard.nextDouble();
        number2 = keyboard.nextDouble();
        number3 = keyboard.nextDouble();
        keyboard.nextLine(); //good habit

        //uso de nextLine() após um nextInt() ou nextDouble() é necessário quando você deseja ler uma linha de texto (como uma string) depois de ter lido um número. mas é um bom habito coloca-lo na ultima captura de uma não Strig
        //pois não sabemos se o proximo poderá ser uma entrada de String.

        avarege = (number1 + number2 + number3)/3.0; //Aqui temos que manter a divisão por outro número do tipo double, pois dividendo é um double logo o divisor deve ser um double por isso temos "3.0".
        System.out.println("A média é: " + avarege);

    }//end main
}

//duas opções de código

/*
        System.out.println("Por favor entre com os trÊs números: ");
        number1 = keyboard.nextDouble();
        number2 = keyboard.nextDouble();
        number3 = keyboard.nextDouble();
        keyboard.nextLine(); //good habit

        //Por que o Java consegue reconhecer que cada numero esta separado por "espaço"? isso por que o "espaço no processo de tokenização é como uma quebra de linha como um "enter"
        //Tokenization: A conversão de uma sequência de caracteres em tokens (unidades lógicas) que podem ser processadas separadamente.

        Como o Scanner realiza a tokenização?

        Delimitadores: O Scanner usa delimitadores para identificar onde um token começa e onde ele termina.
        Por padrão, ele usa espaços em branco (como espaços, quebras de linha, tabulação) como delimitadores.
        Ou seja, o Scanner separa a entrada do usuário sempre que encontra um desses caracteres.

        Leitura de tokens: Cada vez que você chama um  metodo como nextInt(), nextDouble(), ou nextLine(),
        o Scanner lê um token. Ele verifica o fluxo de entrada, identifica até onde vai o token
        (com base nos delimitadores) e o "extrai" para ser processado.

        Processamento dos tokens: Após identificar um token, o Scanner converte esse token para o tipo de dado apropriado.
        O tipo de processamento (como converter para int, double, ou ler uma String) depende de qual metodo
        o desenvolvedor escolhe, como nextInt(), nextDouble(), ou nextLine().
*/
//or
/*
        System.out.println("Insira o primeiro numero: ");
        number1 = keyboard.nextDouble();

        System.out.println("Insira o segundo numero: ");
        number2 = keyboard.nextDouble();

        System.out.println("Insira o terceiro numero: ");
        number3 = keyboard.nextDouble();
        keyboard.nextLine();
 */