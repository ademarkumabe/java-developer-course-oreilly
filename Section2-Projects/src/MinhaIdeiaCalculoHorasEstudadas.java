public class MinhaIdeiaCalculoHorasEstudadas {
    public static void main (String[] args){
        //uso de divisao inteira para calcular rapidamente quantas horas estudei, somando os minutos e dividindo por 60
        int a =24; //minutos estudados.
        int b =56;
        int c =49;
        int d =116;
        //int e =;
        //int f =14;


        int soma = a+b+c+d;
        int horas = soma/60;
        int min = soma%60;
        String minutosFormatados = String.format("%02d", min); //ajuste do código, pois quando resultava em 3:08 os minutos apareciam apenas o 8, assim 3:8
        System.out.println("Horas estudadas: " + horas + ":" +minutosFormatados);
    }
}
