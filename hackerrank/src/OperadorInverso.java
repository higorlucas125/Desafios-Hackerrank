import java.util.List;

public class OperadorInverso implements Operacao{
    @Override
    public void insertionSort1 (int n, List<Integer> arr) {
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

    @Override
    public void insertionSort2(int n, List<Integer> arr) {
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n -1 ;j++){
                if(arr.get(j) > arr.get(j +1)){
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j + 1));
                    arr.set(j +1,temp);
                }
                arr.forEach(e  -> System.out.print(" " + e));
                System.out.println();
            }
        }
    }

    @Override
    public void insertionSort3(int n, List<Integer> arr) {

    }
}