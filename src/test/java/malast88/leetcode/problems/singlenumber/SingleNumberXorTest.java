package malast88.leetcode.problems.singlenumber;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SingleNumberXorTest {

    @InjectMocks
    private SingleNumberXor sut;

    private static Stream<Arguments> getSingleNumberArgs() {
        return Stream.of(
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{1, 2, 2, 4, 1}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getSingleNumberArgs")
    public void itShouldReturnSingleNumber(int[] nums, int expectedResult) {
        // init

        // test
        int result = sut.singleNumber(nums);

        // verify
        assertEquals(expectedResult, result);
    }
}
