/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        CustomerFactory app = new CustomerFactory();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent = ");
        int type = inp.nextInt();
        String c = " ";
        switch (type) {
            case 1:
                c = app.createCustomer("Regular");
                break;
            case 2:
                c = app.createCustomer("Mountain");
                break;
            case 3:
                c = app.createCustomer("Delinquent");
                break;
        }
        System.out.println(c);
    }
}