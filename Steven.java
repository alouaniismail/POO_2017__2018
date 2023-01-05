package gems;

public class Steven implements Interface1{
    public static int xCurrent;
    public static int yCurrent;
    public int attribut1;
    public int attribut2;
    public Steven(int xStart, int yStart){
	/*xCurrent=xStart;
	  yCurrent=yStart;*/
	attribut1=xStart;
	attribut2=yStart;
    }
    public void sing(){
	System.out.println("oui");
    }
    final public void move(int dx, int dy){
	/*xCurrent+=dx;yCurrent+=dy;*/
	attribut1+=dx;attribut2+=dy;
	this.draw2();//même chose carrément.
    }
    /* public static void draw(){
       System.out.println("drawing");*/ //car statique.
    
    public void draw2(){
	System.out.println("drawing!");
    }
}
