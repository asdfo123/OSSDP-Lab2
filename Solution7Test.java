import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class Solution7Test {

    @Test
    public void testSmallestStringWithSwaps() {
        Solution7 solution = new Solution7();
        
        // 示例 1
        String s1 = "dcab";
        List<List<Integer>> pairs1 = Arrays.asList(
            Arrays.asList(0, 3), Arrays.asList(1, 2)
        );
        assertEquals("bacd", solution.smallestStringWithSwaps(s1, pairs1));

        // 示例 2
        String s2 = "dcab";
        List<List<Integer>> pairs2 = Arrays.asList(
            Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2)
        );
        assertEquals("abcd", solution.smallestStringWithSwaps(s2, pairs2));

        // 示例 3
        String s3 = "cba";
        List<List<Integer>> pairs3 = Arrays.asList(
            Arrays.asList(0, 1), Arrays.asList(1, 2)
        );
        assertEquals("abc", solution.smallestStringWithSwaps(s3, pairs3));
    }
}
