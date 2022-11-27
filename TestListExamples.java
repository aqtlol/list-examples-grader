import static org.junit.Assert.*;

import java.lang.reflect.Array;
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

      List<String> expected = new ArrayList<>(); // new String[] {"fruit", "pineapple"}
      expected.add("fruit");
      expected.add("pineapple");

      assertEquals(expected, ListExamples.filter(list, sc));
  }

  @Test
  public void testMerge() {
    ArrayList<String> list1 = new ArrayList<>();
    list1.add("a");
    list1.add("e");
    list1.add("z");
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("b");
    list2.add("c");
    list2.add("f");

    String[] expected = new String[]{"a", "b", "c", "e", "f", "z"};
    
    assertArrayEquals(expected, ListExamples.merge(list1, list2).toArray());
  }

    
}
