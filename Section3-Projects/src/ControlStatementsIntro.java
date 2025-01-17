public class ControlStatementsIntro {
    public static void main(String[] args){
        int age = 19;
        //System.out.println(age);

         //Agora, e se quiséssemos tomar uma decisão com base na idade?

        //Digamos que se o ususário tiver pelo menos 16 anos, eles podem dirigir aqui nos Estados Unidos.

        //Então vamos escrever um teste para ver se a idade for superior a 16 anos, e imprimir se voce pode ou não pode dirigir.

        if (age >= 16){ //lembre-se da aula de operadores relacionais que retornam um valor booleano e aqui está nos auxiliando a tomar as decisões, pois se retornar true cairá dentro das chaves pertecentes ao if = se
            System.out.println("you can drive!");
        }
        else { //agora se fosse false cairá dentro das chaves do "else" = senão, e é dessa forma que formamos as estruturas de controle.
            System.out.println("You cannot drive yet!");
        }

        System.out.println();

        for(int i = 1; i <= age; i++){ //Chamado de loop for e se repete até que "i" seja menor ou igual a 19, por isso ele executará o println 19 vezes.
            System.out.println("Happy Birthday " + i);
        }
    }
}
