package malast88.leetcode.problems.pascalstriangle;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PascalsTriangleTest {

    @InjectMocks
    private PascalsTriangle sut;

    private static Stream<Arguments> getGenerateArgs() {
        return Stream.of(
                Arguments.of(0, Arrays.asList()),
                Arguments.of(1, Arrays.asList(Arrays.asList(1))),
                Arguments.of(2, Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1))),
                Arguments.of(5, Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 3, 1), Arrays.asList(1, 4, 6, 4, 1)))
        );
    }

    @ParameterizedTest
    @MethodSource("getGenerateArgs")
    public void itShouldGenerate(int numRows, List<List<Integer>> expectedResult) {
        // init

        // test
        List<List<Integer>> result = sut.generate(numRows);

        // verify
        assertEquals(expectedResult, result);
    }
}
