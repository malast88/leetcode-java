package malast88.leetcode.problems.majorityelement;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MajorityElementTest {

    @InjectMocks
    private MajorityElement sut;

    private static Stream<Arguments> getMajorityElementArgs() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2),
                Arguments.of(new int[]{1, 3, 2, 3, 3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getMajorityElementArgs")
    public void itShouldReturnMajorityElement(int[] nums, int expectedResult) {
        // init

        // test
        int result = sut.majorityElement(nums);

        // verify
        assertEquals(expectedResult, result);
    }
}
