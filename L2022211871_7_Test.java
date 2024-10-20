import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @description: Solution7的单元测试类
 * 测试用例设计原则:
 * 1. 等价类划分：测试有效、无效输入。
 * 2. 边界值分析：输入字符串长度为1和最大长度的情况。
 * 3. 典型输入：输入典型的字符串及索引对来测试功能是否正常。
 * 4. 异常处理：确保输入不合法时程序能处理异常。
 */
public class L2022211871_7_Test {

    private Solution7 solution;

    @Before
    public void setUp() {
        solution = new Solution7(); // 初始化Solution7对象
    }

    /**
     * 测试目的：验证在有效的输入下，函数能够正确返回按字典序最小的字符串。
     * 测试用例1：s = "dcab"，pairs = [[0,3],[1,2]]
     * 预期输出：bacd
     */
    @Test
    public void testValidInputCase1() {
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2)
        );
        assertEquals("bacd", solution.smallestStringWithSwaps(s, pairs));
    }

    /**
     * 测试目的：验证在多个交换对下，函数能够返回正确的字典序最小的字符串。
     * 测试用例2：s = "dcab"，pairs = [[0,3],[1,2],[0,2]]
     * 预期输出：abcd
     */
    @Test
    public void testValidInputCase2() {
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2),
                Arrays.asList(0, 2)
        );
        assertEquals("abcd", solution.smallestStringWithSwaps(s, pairs));
    }

    /**
     * 测试目的：验证在多个字符连通时，函数能正确处理连通分量。
     * 测试用例3：s = "cba"，pairs = [[0,1],[1,2]]
     * 预期输出：abc
     */
    @Test
    public void testValidInputCase3() {
        String s = "cba";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 2)
        );
        assertEquals("abc", solution.smallestStringWithSwaps(s, pairs));
    }

    /**
     * 测试目的：验证函数对单字符输入的处理。
     * 测试用例4：s = "a"，pairs = []
     * 预期输出：a
     */
    @Test
    public void testSingleCharacterInput() {
        String s = "a";
        List<List<Integer>> pairs = Arrays.asList();  // 没有交换对
        assertEquals("a", solution.smallestStringWithSwaps(s, pairs));
    }

    /**
     * 测试目的：测试边界值情况，验证程序对空字符串的处理。
     * 测试用例5：s = ""，pairs = []
     * 预期输出：""（空字符串）
     */
    @Test
    public void testEmptyString() {
        String s = "";
        List<List<Integer>> pairs = Arrays.asList();  // 没有交换对
        assertEquals("", solution.smallestStringWithSwaps(s, pairs));
    }

    /**
     * 测试目的：验证无效输入（如索引超出字符串长度）的处理。
     * 测试用例6：s = "abc"，pairs = [[0, 3]]
     * 预期：可能抛出异常或返回原字符串
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testInvalidIndex() {
        String s = "abc";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 3) // 无效的索引对，超出范围
        );
        solution.smallestStringWithSwaps(s, pairs);
    }
}
