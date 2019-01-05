import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Grandpa extends Creature  {
    Grandpa(String name, Field a)
    {
        super(name,a);
        isGood=true;
        level=1;
        URL url = this.getClass().getClassLoader().getResource("grandpa.png");
        ImageIcon icona = new ImageIcon(url);
        Image image = icona.getImage();
        this.setImage(image);
    }
    public void move() {

        int xx=this.pos.getX();
        int yy=this.pos.getY();
        if(xx<14) {
            if (field.p[xx + 1][yy].getHolder() == null)//右边没有障碍就直接前进
                field.putCreature(this, xx + 1, yy);
            else if (!field.p[xx + 1][yy].getHolder().isGood ) {
                field.battle(this, field.p[xx + 1][yy].getHolder());
            }
        }
    }

}
