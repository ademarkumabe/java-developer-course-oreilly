public class LogicalFun {
    public static void main(String[] Args){
        //dupla de valores boleanos com "true" e "true"
        //boolean isRaining = true;
        //boolean isWarm = true;

        //Desafio: testar diferentes valores para (isRaining) e (isWarm)
        //para isso comentarei cada uma das duplas de valores boleanos para não extender o código e testarei descomentando cada uma das duplas de cada vez.

        //dupla de valores boleanos com true e false
        //boolean isRaining = true;
        //boolean isWarm = false;

        //dupla de valores boleanos com false e true
        //boolean isRaining = false;
        //boolean isWarm = true;

        //dupla de valores boleanos com false e false
        boolean isRaining = false;
        boolean isWarm = false;

    boolean combined = isRaining && isWarm;
    System.out.println("Is it raining and warm? " + combined);

    combined = isRaining || isWarm;
    System.out.println("Is it raining or warm? " + combined);

    combined = !isRaining;
    System.out.println("Is it Not raining outside? " + combined);
    }//end main
}
