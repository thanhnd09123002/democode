/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Untilities;

/**
 *
 * @author Admin
 */
public class CheckInput {
    public  boolean checkSo(String str) {
        return str.matches("\\d+");  //match a number with optional '-' and decimal.
    }
   public boolean checkEmail(String email){
        return email.matches("^(.+)@(.+)$");
    }
   public boolean checkFloat(String txt) {
        return txt.matches("[-+]?[0-9]*\\.?[0-9]*");
    }
    public  boolean checkTungChu(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (checkSo(String.valueOf(str.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
}
