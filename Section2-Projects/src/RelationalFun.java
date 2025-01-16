public class RelationalFun {
    public static void main(String[] args){
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        String myName = "John";
        String yourName = "John";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational operations
        boolean ageComparison = myAge > yourAge; // aqui se myAge for maior que yourAge, será atribuido "true" a variável ageComparison.
        System.out.println("myAge > youAge?: " + ageComparison); //aqui temos uma impressão de uma concatenação de uma string com uma variável.

        ageComparison = yourAge > bobsAge;
        System.out.println("youAge > bobsAge?: " + ageComparison);

        ageComparison =  yourAge == bobsAge; //aqui temos uma comparação de igualdade entre yourAge e bobsAge, então o "==" é como uma pergunta "como yourAge é igual a bobsAge".
        //E além disso o operador de igualdade "==" tem prioriridade sobre o operador de atribuição "=", por isso não precisamos colocar entre parenteses ()

        System.out.println("yourAge == bobsAge?: " + ageComparison);

        boolean nameComparison = myName.equals(yourName); //comparando se myName é igual yourName.
        System.out.println("do names match? " + nameComparison); //ele retornará true, porém se alterassemos uma letra de uma das variável, ele retornará false.




        //Challenge - desafio
        //minha solução
        int currentAge = 32;
        boolean ageComparisonChallege = currentAge >= 21;
        System.out.println("Is my age over 21? " + ageComparisonChallege);
    }//end main

}
