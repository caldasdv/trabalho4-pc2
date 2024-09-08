import java.util.ArrayList;

public class Exemplo1 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 1; i <= 200; i++) {
            lista.add("String " + i);
        }
        System.out.println("Número de elementos na lista: " + lista.size());
    }
}
