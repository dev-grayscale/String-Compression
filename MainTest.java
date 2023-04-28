import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void compressV1() {
    Assertions.assertEquals(null, Main.compressV1(null));
    Assertions.assertEquals("", Main.compressV1(""));
    Assertions.assertEquals("a", Main.compressV1("a"));
    Assertions.assertEquals("ab", Main.compressV1("ab"));
    Assertions.assertEquals("aa", Main.compressV1("aa"));
    Assertions.assertEquals("a3", Main.compressV1("aaa"));
    Assertions.assertEquals("  ", Main.compressV1("  "));
    Assertions.assertEquals("a2b1c5a3", Main.compressV1("aabcccccaaa"));
    Assertions.assertEquals("a11", Main.compressV1("aaaaaaaaaaa"));
    Assertions.assertEquals("a12b1", Main.compressV1("aaaaaaaaaaaab"));
    Assertions.assertEquals("a12b3c1", Main.compressV1("aaaaaaaaaaaabbbc"));
    Assertions.assertEquals("Hello John", Main.compressV1("Hello John"));
    Assertions.assertEquals("e28a8b2c1e1", Main.compressV1("eeeeeeeeeeeeeeeeeeeeeeeeeeeeaaaaaaaabbce"));
    Assertions.assertEquals("abc", Main.compressV1("abc"));
    Assertions.assertEquals("A4z4E2r2B2b2", Main.compressV1("AAAAzzzzEErrBBbb"));
  }
}
