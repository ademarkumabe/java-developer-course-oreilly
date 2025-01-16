import java.util.Scanner;
import java.util.Locale; //pacote para capturar o tipo de separador decimal, pois em alguns países usa-se "," e em outros "."


public class KeyboardInput {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String name; //criado uma variavel do tipo referencia chamada name
    String city; //criado uma variavel do tipo referencia chamada city
    int age; //criado uma variavel do tipo primitivo chamada age
    double height;
    Locale locale = Locale.getDefault(); //tipo de separador decimal


    System.out.println("What is your name? "); //imprime no fluxo de saida "console" uma mensagem
    name = keyboard.nextLine(); //atribui à variavel name o

    System.out.println("What's your age? ");
    age = keyboard.nextInt();
    keyboard.nextLine(); //consume the newline

    //
    System.out.println("How tall are you? Ex. 1.50 or 1.00 -> (1 meter)");
    height = 2*keyboard.nextDouble();
    keyboard.nextLine(); //consume the newline

    System.out.println("What city do you live in? ");
    city = keyboard.nextLine();

    System.out.println("locale: "+ locale); //tipo de separador decimal
    System.out.println("Hello, " + name);
    System.out.println("age is " + age);
    System.out.println("The value of twice your height is " + height);
    System.out.println("city is " + city);

    }
}
