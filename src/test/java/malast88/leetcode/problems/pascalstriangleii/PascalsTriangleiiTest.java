package malast88.leetcode.problems.pascalstriangleii;

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
public class PascalsTriangleiiTest {

    @InjectMocks
    private PascalsTriangleii sut;

    private static Stream<Arguments> getGetRowArgs() {
        return Stream.of(
                Arguments.of(0, Arrays.asList(1)),
                Arguments.of(1, Arrays.asList(1, 1)),
                Arguments.of(4, Arrays.asList(1, 4, 6, 4, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("getGetRowArgs")
    public void itShouldGetRow(int rowIndex, List<Integer> expectedResult) {
        // init

        // test
        List<Integer> result = sut.getRow(rowIndex);

        // verify
        assertEquals(expectedResult, result);
    }
}
