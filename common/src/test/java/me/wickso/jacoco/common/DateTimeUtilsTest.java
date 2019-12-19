package me.wickso.jacoco.common;

import static org.junit.Assert.*;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.Test;

public class DateTimeUtilsTest {

  @Test
  public void yesterday_test() {
    // given
    final ZonedDateTime yesterday = new DateTimeUtils().getYesterday(ZoneId.systemDefault());
    // when
    // then
    System.out.println(yesterday);
  }
}
