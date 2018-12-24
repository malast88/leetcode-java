package malast88.leetcode.problems.longestcommonprefix;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LongestCommonPrefixTest {

    @InjectMocks
    private LongestCommonPrefix sut;

    private static Stream<Arguments> getLongestCommonPrefixArgs() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, ""),
                Arguments.of(new String[]{}, ""),
                Arguments.of(new String[]{"", "asd", "asdasdas"}, ""),
                Arguments.of(new String[]{"flower", "flow", ""}, "")
        );
    }

    @ParameterizedTest
    @MethodSource("getLongestCommonPrefixArgs")
    public void itShouldFindLongestCommonPrefix(String[] strs, String expectedResult) {
        // init

        // test
        String result = sut.longestCommonPrefix(strs);

        // verify
        assertEquals(expectedResult, result);
    }
}
