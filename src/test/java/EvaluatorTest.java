
import edu.csc413.calculator.evaluator.Evaluator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Evaluator Test")
public class EvaluatorTest {


    @Test
    public void testExpression01(){
        String exp = "1+2";
        double res;

        Evaluator ev = new Evaluator();
        res = ev.eval(exp);
        assertEquals("3.0", String.valueOf(res));

    }

    @Test
    public void testExpression03(){
        String exp = "1+2*3";
        double res;

        Evaluator ev = new Evaluator();
        res = ev.eval(exp);
        assertEquals("7.0", String.valueOf(res));
    }


    @Test
    public void testExpression07(){
        String exp = "3^2";
        double res;

        Evaluator ev = new Evaluator();
        res = ev.eval(exp);
        assertEquals("9.0", String.valueOf(res));
    }

    @Test
    public void testExpression08(){
        String exp = "3^2/2";
        double res;

        Evaluator ev = new Evaluator();
        res = ev.eval(exp);
        assertEquals("4.5", String.valueOf(res));
    }

}
