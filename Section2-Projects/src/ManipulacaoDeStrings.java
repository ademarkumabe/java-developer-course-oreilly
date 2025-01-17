public class ManipulacaoDeStrings {
    public static void main(String[] args){

        String name = "Ademar";
        String lastName = "Kumabe";

        //Java Linkedin - Manipulação de Strings
        //metodo charAt - acessar um index da string
        System.out.println(name.charAt(0)); //Como vemos podemos acessar o indice da String o primeiro indice que é a letra "A" é sempre 0, e assim por diante.

        //metodo length  - verificar o tamanho da String
        System.out.println(name.length());

        //poderiamos usar o metodo char com o metodo length para acessarmos a ultima letra do nome.
        System.out.println(name.charAt(name.length() -1));

        //metodo equals - compara se duas strings são iguais
        System.out.println(name.equals(lastName));
    }
}
