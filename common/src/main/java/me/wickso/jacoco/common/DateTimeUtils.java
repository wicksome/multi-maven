package me.wickso.jacoco.common;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeUtils {
  public ZonedDateTime getYesterday(ZoneId zoneId) {
    return ZonedDateTime.now(zoneId).minusDays(1);
  }
}
