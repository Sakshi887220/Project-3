/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libarayfine;

/**
 *
 * @author Sonam
 */
// User.java

public class user {
  private String username;
  private String book;
  private Integer days;

  // constructor
  public user(String username, String book, Integer days) {
    this.username = username;
    this.book = book;
    this.days = days;
  }

  // important getter methods required in test class
  public String getUsername() {
    return username;
  }
  public Integer getDays() {
    return days;
  } 
}
