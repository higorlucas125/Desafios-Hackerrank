import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.stream.IntStream;
//Um colchete é considerado qualquer um dos seguintes caracteres: (, ), {, }, [ou ].
//
//Dois colchetes são considerados um par correspondente se um colchete de abertura (isto é, (, [ou {) ocorrer à esquerda de um colchete de fechamento (isto é, ), ]ou }) exatamente do mesmo tipo . Existem três tipos de pares correspondentes de colchetes: [], {}, e ().
//
//Um par correspondente de colchetes não é balanceado se o conjunto de colchetes que ele contém não for compatível. Por exemplo, {[(])}não está balanceado porque os conteúdos intermediários {e }não estão balanceados. O par de colchetes inclui um único colchete de abertura desbalanceado, (, e o par de parênteses inclui um colchete de fechamento único e desbalanceado, ].
//
//Por essa lógica, dizemos que uma sequência de colchetes é balanceada se as seguintes condições forem atendidas:
//
//Ele não contém colchetes incomparáveis.
//O subconjunto de colchetes dentro dos limites de um par de colchetes correspondente também é um par de colchetes correspondente.
//Dadosequências de colchetes, determine se cada sequência de colchetes é balanceada. Se uma string for balanceada, retorne YES. Caso contrário, retorne NO.
public class BalancedBrackets {
    class Result {
        public static String isBalanced (String s){
            Stack<Character> bracketStack = new Stack<>();
            HashMap setOfBrackets = new HashMap<Character, Character>();

            setOfBrackets.put('(', ')');
            setOfBrackets.put('{', '}');
            setOfBrackets.put('[', ']');

            for(int i= 0; i < s.length(); i++){
                if(setOfBrackets.get(s.charAt(i)) != null){
                    bracketStack.push(s.charAt(i));
                } else{
                    if(bracketStack.empty()) return "NO";
                    if(setOfBrackets.get(bracketStack.pop()).equals(s.charAt(i))){
                        continue;
                    }else {
                        return "NO";
                    }
                }
            }

            return bracketStack.isEmpty() ? "YES" : "NO";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
