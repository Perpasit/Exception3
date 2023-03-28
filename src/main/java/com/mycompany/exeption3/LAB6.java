
package com.mycompany.exeption3;

public class LAB6 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("list[10] is " + list[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());  
            //System.out.println(e.toString());
            //e.printStackTrace();
            StackTraceElement[] s = e.getStackTrace();
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[0].getClassName());
                System.out.println(s[0].getMethodName());
                System.out.println(s[0].getFileName());
                System.out.println(s[0].getLineNumber());  
            }
            
            
        }
    }
}
