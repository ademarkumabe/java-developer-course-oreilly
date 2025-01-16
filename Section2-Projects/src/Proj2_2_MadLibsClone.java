import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String []args){

        String adjective1;
        String girls_name;
        String adjective2;
        String occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boys_name;
        String mans_name;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("insira um adjetivo:\t"); //aqui usamos o print ao invés do println, pois o print não quebra linha e podemos colocar a resposta na mesma linha da pergunta.
        adjective1 = keyboard.nextLine();

        System.out.print("insira um nome de uma garota:\t");
        girls_name = keyboard.nextLine();

        System.out.print("insira outro adjetivo:\t");
        adjective2 = keyboard.nextLine();

        System.out.print("insira uma ocupação:\t");
        occupation1 = keyboard.nextLine();

        System.out.print("insira um lugar:\t");
        place = keyboard.nextLine();

        System.out.print("insira uma roupa:\t");
        clothing = keyboard.nextLine();

        System.out.print("insira um hobby:\t");
        hobby = keyboard.nextLine();

        System.out.print("insira outro adjetivo:\t");
        adjective3 = keyboard.nextLine();

        System.out.print("insira outra ocupação:\t");
        occupation2 = keyboard.nextLine();

        System.out.print("insira um nome de um garoto:\t");
        boys_name = keyboard.nextLine();

        System.out.print("insira um nome de um homem:\t");
        mans_name = keyboard.nextLine();

        System.out.println('\n' + "There once was a " + adjective1 + " girl named " + girls_name + " who was a " + adjective2 + " " + occupation1 + " in the Kingdom of " + place + "." + '\n' +"She loved to wear " + clothing + " and to " + hobby +"."+
                 " She wanted to marry the " + adjective3 + " " + occupation2 + " named " + boys_name + " but her father, King " + mans_name + " forbid her from seeing him.");
    }
}
