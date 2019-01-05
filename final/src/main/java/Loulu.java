import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Loulu extends Creature {
    Loulu(String name, Field a)
    {
        super(name,a);
        isAlive=true;
        isGood=false;
        level=3;
        URL url = this.getClass().getClassLoader().getResource("loulu.png");
        ImageIcon icona = new ImageIcon(url);
        Image image = icona.getImage();
        this.setImage(image);
    }

    public void move() {

        int xx=this.pos.getX();
        int yy=this.pos.getY();


        if(xx>=1&&field.isEnemy(this)==1) {
            if (field.p[xx - 1][yy].getHolder() == null)//左边没有东西
                field.putCreature(this, xx - 1, yy);
            else if (field.p[xx -1][yy].getHolder().isGood ) {
                field.battle(this, field.p[xx - 1][yy].getHolder());
            }
        }
        else if(xx<14&&field.isEnemy(this)==2) {
            if (field.p[xx + 1][yy].getHolder() == null)//右边没有东西
                field.putCreature(this, xx + 1, yy);
            else if (field.p[xx + 1][yy].getHolder().isGood ) {
                field.battle(this, field.p[xx + 1][yy].getHolder());
            }
        }
        else if(yy>=1&&field.Isup(this))
        {
            if(field.p[xx][yy-1].getHolder()==null)
                field.putCreature(this,xx,yy-1);
            else if(field.p[xx][yy-1].getHolder().isGood )
                field.battle(this, field.p[xx][yy-1].getHolder());
        }
        else if(yy<=8&&!field.Isup(this))
        {
            if(field.p[xx][yy+1].getHolder()==null)
                field.putCreature(this,xx,yy-1);
            else if(field.p[xx][yy+1].getHolder().isGood )
                field.battle(this, field.p[xx][yy+1].getHolder());
        }
    }

}
