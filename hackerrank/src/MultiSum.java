import java.util.Scanner;

public class MultiSum {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        MultiSum s = new MultiSum();
        if(scanner.hasNextInt()){
            int tamanho = scanner.nextInt();

            Integer[] array = new Integer[tamanho];

            for (int i = 0; i < tamanho; i++) {
                array[i] = scanner.nextInt();
            }
            //sum the integers
            System.out.println(s.sum(array));
        }else{

            int tamanho = scanner.nextInt();

            String[] array = new String[tamanho];

            for (int i = 0; i < tamanho; i++) {
                array[i] = scanner.next();
            }

            //Concatenar string
            System.out.println(s.order(array));

        }


    }

    public Integer sum (Integer[]ints){
        int valor = 0;
        for(int i =0; i < ints.length;i++){
            valor += ints[i];
        }
        return valor;
    }

    public String order(String[] str){
        String palavras = "";
        for(int i = 0; i < str.length; i ++ ){
            palavras = palavras + ""+str[i];
        }
        return palavras;
    }
}
