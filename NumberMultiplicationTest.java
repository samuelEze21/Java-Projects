import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

   public class NumberMultiplicationTest {


	@Test
	public void testThatNumberCanMultiply() {
	
	//given
	NumberMultiplication calculator = new NumberMultiplication();
	//when
	int firstNumber = 7;
	int secondNumber = 5;
	int sum = calculator.TwoNumbersAddMultiple(firstNumber, secondNumber); 


	//assert
	assertEquals(35, sum);
	
	}

  }

