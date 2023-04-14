import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SolutionNew {
    private Operacao operacao;
    public SolutionNew (Operacao operacao){
        this.operacao = operacao;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Coloque o tamanho do array");

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        SolutionNew solutionNew = new SolutionNew(new OperadorInverso());

        System.out.println("Coloque os número de array");

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        solutionNew.operacao.insertionSort2(n, arr);

        bufferedReader.close();
    }
}
