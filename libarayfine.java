/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libarayfine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import libarayfine.user;

public class libarayfine {

  public static void main(String[] args) {
    // create list of User to store details
   
    
    try {
      // In this example fineDetails.txt is stored
      // at D drive (D:\) in Windows operating system.
      
      // read data from file and store in list
     

      // calculate fine and store in "fineReport.txt"
     
      // display some message
      System.out.println("Fine report is saved.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // method to read data from the fine “fineDetails.txt”
  // stored in your home (H:/) drive
  // and store the data using a suitable data structure
  public static void read(ArrayList<user> user,
                       String string) throws Exception {
    // variables
    BufferedReader br = null;
    String line = null;
    String str[] = null;
    int days = 0;
    
    // create BufferedReader object
    br = new BufferedReader(new FileReader(string));

    // read till end of the file
    while (br.ready()) {
      // read one line
      line = br.readLine();

      // Split line by comma(,)
      str = line.split(",");

      // convert String to int (for days)
      days = Integer.parseInt(str[2]);

      // store details to ArrayList
      user.add(new user(str[0], str[1], days));
    }
    
    // close BufferedReader
    br.close();
  }

  // method to calculate fine and store in "fineReport.txt"
  public static void calculateFine(ArrayList<user> user,
              String string) throws Exception {
    // variables
    PrintWriter pw = null;
    int days = 0;
    int fine = 0;
    
    // create PrintWriter object
    pw = new PrintWriter(string);
    
    // loop to iterate the list
    for (user usr : user) {
      // get late days
      days = usr.getDays();
      
      // calculate fine amount
      if(days <= 7)
        fine = days * 1;
      else if(days <= 14)
        fine = 7*1 + (days-7)*3;
      else
        fine = 7*1 + 7*3 + (days-14)*5;
      
      // store values
      pw.println(usr.getUsername() + "," + fine);
    } 
    
    // close Stream
    pw.close();
  }
}
