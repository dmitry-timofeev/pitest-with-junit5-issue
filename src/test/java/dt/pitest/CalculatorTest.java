package dt.pitest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

  @ParameterizedTest
  @CsvSource({
      // Purposefully redundant to show that pitest doesn't stop
      // at the first test killing the mutant
      "-1, 0",
      "0, 1",
      "1, 2",
      "2, 3",
      "3, 4"
  })
  void increment(int i, int expectedResult) {
    assertEquals(expectedResult, Calculator.increment(i));
  }
}
