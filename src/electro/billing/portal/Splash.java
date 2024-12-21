package electro.billing.portal;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2= i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        add(image);
        
        setVisible(true);
        
        //to set image size and location dynamically
        int x=1;
        for (int i=2; i<600; i+=6, x+=1){
        setSize(i+x , i);
        setLocation(650 -((i + x)/2) , 380-(i/2));
        try {
        Thread.sleep(15);
        } catch (Exception e){
        e.printStackTrace();
        }
     }
        t= new Thread(this);
        t.start();

        setVisible(true);
}
    // to hold the excuation
    public void run(){
        try {
            Thread.sleep(1000);
            setVisible(false);
            //login frame
            
            new Login(); 
        }catch (Exception e){
            e.printStackTrace();
        }
    }
        
    
    public static void main(String args[]){
    new Splash();
    } 
    
}
