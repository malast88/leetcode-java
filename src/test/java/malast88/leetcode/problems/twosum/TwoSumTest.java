package malast88.leetcode.problems.twosum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class TwoSumTest {

    @InjectMocks
    private TwoSum sut;

    private static Stream<Arguments> getTwoSumArgs() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{}, 0, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getTwoSumArgs")
    public void itShouldReturnTwoSum(int[] nums, int target, int[] expectedResult) {
        // init

        // test
        int[] result = sut.twoSum(nums, target);

        // verify
        assertArrayEquals(expectedResult, result);
    }
}
