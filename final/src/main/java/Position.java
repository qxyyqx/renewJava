public class Position{
    private int x,y;
    private Creature obj;//该位置上的实物
    Position(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void place(Creature c)//放置一个creature
    {
        this.obj=c;
    }
    public void freeHolder()//该creature死亡
    {
        obj=null;
    }
    public Creature getHolder()
    {
        return obj;
    }//获取位置上的东西
}
