import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
        int num = 0;

        for(int numero : numeros){
            if(numero > 50){
                num = numero;
                break;
            }
        }

        System.out.println(num);

    }
}