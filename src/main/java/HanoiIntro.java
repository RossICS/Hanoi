/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class HanoiIntro {
  public static void main(String[] args) {
    int n;
    String toPeg, fromPeg, tempPeg;

    fromPeg = "A";
    toPeg = "C";
    tempPeg = "B";
    //begin Towers of Hanoi with 4 disks
    n = 19;
    System.out.println("Towers of Hanoi problem");
    System.out.println("There are " + n + " discs on peg " +
      fromPeg + " initially");
    //Execute hanoi method to solve the problem
    hanoi(fromPeg, toPeg, tempPeg, n);
  }

  public static void hanoi(String fr,String to,String tp,int n){
    if (n == 1) {
      System.out.println("Move disc 1 from "+fr+" to "+to);
    } else {
      hanoi(fr, tp, to, n - 1);
      System.out.println("Move disc "+n+" from "+fr+" to "+to);
      hanoi(tp, to, fr, n - 1);
    }
  }
}