/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_sys;


/**
 *
 * @author HP PRO
 */
public class Billing_sys{
    Thread t;
    public Billing_sys(){
        t=new Thread((Runnable) this);
        t.start();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new NewJFrame1().setVisible(true);
        try{
            Thread.sleep(2500);
            //NewJFrame1().hide();
            new VIEW_BILL().setVisible(true);
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
