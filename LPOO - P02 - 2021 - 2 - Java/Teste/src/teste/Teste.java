/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();

    String input ="1 ; 2 ; red ; blue ;";
    Scanner s = new Scanner(input).useDelimiter("\\s*;\\s*");
    System.out.println(s.nextInt());
    System.out.println(s.nextInt());
    System.out.println(s.next());
    System.out.println(s.next());
    s.close();
    }
    
}
