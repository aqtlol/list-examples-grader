import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void testFilter() {
      List<String> list = new ArrayList<>();
      list.add("apple");
      list.add("mango");
      list.add("fruit");
      list.add("strawberry");
      list.add("pineapple");
      list.add("grapes");

      StringChecker sc = new StringChecker() {
        public boolean checkString(String s) {
          if(s.contains("i")) {
            return true;
          }
          return false;
        }
      };

      List<String> expected = new ArrayList<>(); // new String[] {"strawberry", "pineapple"}
      expected.add("strawberry");
      expected.add("pineapple");

      assertEquals(expected, ListExamples.filter(list, sc));
  }

    
}
