public class Heyi {
    public void mv(int x,int y,Field s,Creature []creatures,int length){
        int div=length/2;
        s.putCreature(creatures[0],x,y);
        for(int i=1;i<div+1;i++){
            s.removeCreature(x+i,y-i);
            s.putCreature(creatures[2*i-1],x+i,y-i);
            s.removeCreature(x+i,y+i);
            s.putCreature(creatures[2*i],x+i,y+i);

        }

    }
}
