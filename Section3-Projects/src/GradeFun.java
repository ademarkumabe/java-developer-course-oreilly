import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        char grade;

        System.out.println("Enter a grade");
        grade = keyboard.next().charAt(0);

        switch(grade){ //O Java é case sensitive, logo para que reconheça letras minusculos aqui, podemos adcionar um case adicional abaixo do que tem a letra maiusculo isso é o mesmo que (A maiusculo) ou (a minusculo).
            case 'A':
            case 'a':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job!");
                break;
            case 'C':
            case 'c':
                System.out.println("You can do better.");
                break;
            case 'D':
            case 'd':
                System.out.println("You're getting pretty close to failing");
                break;
            case 'F':
            case 'f':
                System.out.println("You are failing the course!");
                break;
            default:
                System.out.println("You have entered an invalid grade");
        }
    }
}
