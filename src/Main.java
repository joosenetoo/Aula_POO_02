//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    variaveis();
    switchcase();
    array();

    }

    static void variaveis(){
        int idade = 20;

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }

    static void switchcase(){
        int dia = 3;
        String nomeDoDia;

        switch (dia) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Dia inválido";
                break;
        }

        System.out.println(nomeDoDia);


    }

    static void repeticaof(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    static void repeticaow(){
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

    }

    static void repeticaod(){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

    }

    static void array(){
        int[] array = new int[5];  // cria um array de inteiros com tamanho 5
        array[0] = 1;  // define o primeiro elemento do array como 1
        array[1] = 2;  // define o segundo elemento do array como 2

        // e assim por diante...
        // alimentando o array com valores através do loop for
        for (int i = 2; i < array.length; i++) {
            array[i] = i + 1;  // insere o valor i + 1 no índice i do array
        }

        // exibindo os valores do array através do loop for
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + array[i]);
        }

    }
}