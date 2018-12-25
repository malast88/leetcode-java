package malast88.leetcode.problems._dummysolution;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DummySolutionTest {

    @InjectMocks
    private DummySolution sut;

    private static Stream<Arguments> getXXXArgs() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(5, -5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getXXXArgs")
    public void itShouldXXX(int a, int b, int expectedResult) {
        // init

        // test
        int result = sut.xxx(a, b);

        // verify
        assertEquals(expectedResult, result);
    }
}
