package malast88.leetcode.problems.removeelement;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class RemoveElementTest {

    @InjectMocks
    private RemoveElement sut;

    private static Stream<Arguments> getRemoveElementArgs() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 3, 2}, 3, 2, new int[]{2, 2, -1, -1}),
                Arguments.of(new int[]{1, 2, 3}, 10, 3, new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("getRemoveElementArgs")
    public void itShouldRemoveElement(int[] nums, int val, int expectedResult, int[] expectedNums) {
        // init

        // test
        int result = sut.removeElement(nums, val);

        // verify
        assertEquals(expectedResult, result);
        for (int i = 0; i < expectedResult; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}
