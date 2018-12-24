package malast88.leetcode.problems.reverseinteger;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ReverseIntegerTest {

    @InjectMocks
    private ReverseInteger sut;

    private static Stream<Arguments> getReverseIntegerArgs() {
        return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21),
                Arguments.of(1534236469, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getReverseIntegerArgs")
    public void itShouldReverseInteger(int x, int expectedResult) {
        // init

        // test
        int result = sut.reverse(x);

        // verify
        assertEquals(expectedResult, result);
    }
}
