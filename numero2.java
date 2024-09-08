import java.util.ArrayList;

public class Exemplo2 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            lista.add("String 1");
            lista.add("String 2");
            lista.add("String 3");
        }

        for (String s : lista) {
            System.out.println(s);
        }

        // Exibe o tamanho da lista
        System.out.println("Número de elementos na lista: " + lista.size());
    }
}
