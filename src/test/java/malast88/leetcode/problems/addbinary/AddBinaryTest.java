package malast88.leetcode.problems.addbinary;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AddBinaryTest {

    @InjectMocks
    private AddBinary sut;

    private static Stream<Arguments> getXXXArgs() {
        return Stream.of(
                Arguments.of("11", "1", "100"),
                Arguments.of("110", "101", "1011"),
                Arguments.of("1", "11", "100")
        );
    }

    @ParameterizedTest
    @MethodSource("getXXXArgs")
    public void itShouldXXX(String a, String b, String expectedResult) {
        // init

        // test
        String result = sut.addBinary(a, b);

        // verify
        assertEquals(expectedResult, result);
    }
}
