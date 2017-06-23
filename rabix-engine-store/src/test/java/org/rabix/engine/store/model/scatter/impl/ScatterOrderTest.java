package org.rabix.engine.store.model.scatter.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableList;

@Test(groups = { "functional" })
public class ScatterOrderTest {

  @Test
  public void testOrder() {
    ScatterCartesian.Combination c1 = new ScatterCartesian.Combination(1, true, ImmutableList.of(2, 3));
    ScatterCartesian.Combination c2 = new ScatterCartesian.Combination(1, true, ImmutableList.of(10, 1));
    List<ScatterCartesian.Combination> combinations = new ArrayList<>();
    combinations.add(c1);
    combinations.add(c2);
    Collections.sort(combinations, new Comparator<ScatterCartesian.Combination>() {
      @Override
      public int compare(ScatterCartesian.Combination o1, ScatterCartesian.Combination o2) {
        String s1 = o1.indexes.toString();
        String s2 = o2.indexes.toString();
        int cmp = s1.compareTo(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(cmp);
        return cmp;
      }
    });

  }

}
