package malast88.leetcode.problems.implementstrstr;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ImplementStrStrTest {

    @InjectMocks
    private ImplementStrStr sut;

    private static Stream<Arguments> getStrStrArgs() {
        return Stream.of(
                Arguments.of("hello", "ll", 2),
                Arguments.of("hello", "", 0),
                Arguments.of("hello", "aaa", -1),
                Arguments.of("aa", "aaa", -1),
                Arguments.of("aababc", "abc", 3),
                Arguments.of("mississippi", "issip", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getStrStrArgs")
    public void itShouldDoStrStr(String haystack, String needle, int expectedResult) {
        // init

        // test
        int result = sut.strStr(haystack, needle);

        // verify
        assertEquals(expectedResult, result);
    }
}
