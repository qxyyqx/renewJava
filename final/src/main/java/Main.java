import javax.swing.*;
import  java.awt.event.*;
import java.util.concurrent.*;

public class Main extends JFrame{
    public Main()
    {
        final Field field=new Field();
        add(field);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500,1200);
        setLocationRelativeTo(null);
        setTitle("福禄娃");
        setVisible(true);


        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e)
            {

                if(e.getKeyCode()==KeyEvent.VK_SPACE)
                    field.init2();
            }
        });

    }

    public static void main(String[] args) {

        Main main=new Main();
    }

}
