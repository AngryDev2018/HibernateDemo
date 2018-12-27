package test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Roh {

  public static void main(String[] args) throws ParseException {
    String date="2019-09-21 00:00:00";
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    Date parsedDate = dateFormat.parse(date);
    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
    System.out.println(timestamp);

  }

}
