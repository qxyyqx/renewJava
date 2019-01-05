import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.concurrent.TimeUnit;

enum Name{
    老大,老二,老三,老四,老五,老六,老七
}
public class Huluwa extends Creature{

    int rank;
    Huluwa(int a,Field b,String picture)
    {
        super(Name.values()[a-1].toString(),b);
        this.rank=a;
        isAlive=true;
        isGood=true;
        level=10;
        URL url = this.getClass().getClassLoader().getResource(picture);
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
            else if (!field.p[xx -1][yy].getHolder().isGood) {
                field.battle(this, field.p[xx - 1][yy].getHolder());
            }
        }
        else if(xx<14&&field.isEnemy(this)==2) {
            if (field.p[xx + 1][yy].getHolder() == null)//右边没有东西
                field.putCreature(this, xx + 1, yy);
            else if (!field.p[xx + 1][yy].getHolder().isGood) {
                field.battle(this, field.p[xx + 1][yy].getHolder());
            }
        }
        else if(yy>=1&&field.Isup(this))
        {
            if(field.p[xx][yy-1].getHolder()==null)
                field.putCreature(this,xx,yy-1);
            else if(!field.p[xx][yy-1].getHolder().isGood)
                field.battle(this, field.p[xx][yy-1].getHolder());
        }
        else if(yy<=8&&!field.Isup(this))
        {
            if(field.p[xx][yy+1].getHolder()==null)
                field.putCreature(this,xx,yy-1);
            else if(!field.p[xx][yy+1].getHolder().isGood)
                field.battle(this, field.p[xx][yy+1].getHolder());
        }

    }
}
