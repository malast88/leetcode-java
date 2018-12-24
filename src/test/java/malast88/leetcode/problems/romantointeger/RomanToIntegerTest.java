package malast88.leetcode.problems.romantointeger;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class RomanToIntegerTest {

    @InjectMocks
    private RomanToInteger sut;

    private static Stream<Arguments> getRomanToIntArgs() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("CDI", 401),
                Arguments.of("CDI_", 401)
        );
    }

    @ParameterizedTest
    @MethodSource("getRomanToIntArgs")
    public void itShouldConvertRomanToInt(String s, int expectedResult) {
        // init

        // test
        int result = sut.romanToInt(s);

        // verify
        assertEquals(expectedResult, result);
    }
}
