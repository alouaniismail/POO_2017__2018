package gems;

public class Universe extends Steven{
    public Universe(int xStart, int yStart){
	super(xStart,yStart);
    }

    public static void draw(){
	Steven sv=new Steven(11,23);
        sv.draw();
	System.out.println("Draw a star at:" + xCurrent + ", " + yCurrent);
    }
    public static void main(String[] args){
	Universe u1=new Universe(12,23);
	u1.move(23,48);
    }
}
