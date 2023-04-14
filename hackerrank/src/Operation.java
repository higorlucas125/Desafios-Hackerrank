import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Operation {
    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int ultimoNumero = arr.get(n - 1);
        int i = arr.size() - 2;
        while ( i >= 0 && arr.get(i) > ultimoNumero){
            arr.set(i+1,arr.get(i));
            i --;
            arr.forEach(e -> System.out.print( e + " "));
            System.out.println();
        }
        arr.set(i +1, ultimoNumero);
        arr.forEach(e -> System.out.print( e + " "));
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Coloque o tamanho do array");

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("Coloque os número de array");

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Operation.insertionSort1(n, arr);

        bufferedReader.close();
    }
}