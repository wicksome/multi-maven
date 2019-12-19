package me.wickso.jacoco.component1;

import java.time.ZoneId;

import me.wickso.jacoco.common.DateTimeUtils;

public class Example {
  public void example() {
    System.out.println(new DateTimeUtils().getYesterday(ZoneId.systemDefault()));
  }
}
