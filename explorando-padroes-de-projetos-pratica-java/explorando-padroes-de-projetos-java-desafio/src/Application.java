import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        String ope = "sum";
        int a = 10;
        int b = 20;

        CalculatorImpl calc = new CalculatorImpl();

        Map<String, Operation> opes = new HashMap<>();
        opes.put("sum", calc::sum);
        opes.put("sub", calc::subtraction);
        opes.put("multi", calc::multiplication);
        opes.put("div", calc::division);

        Operation opeExec = opes.get(ope);
        int resultSum = opeExec.operation(a, b);
        int resultMulti = opeExec.operation(a, b);
        System.out.println("Result: " + resultSum);

    }
}
