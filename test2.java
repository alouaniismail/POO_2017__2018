public class test2 extends test1{
    public void display(){
	System.out.println(xn);
    }
     public void draw(){
	System.out.println("oui");
    }
    public test2 application(){
	this.draw();
	test2 t1=new test2();
	return t1;
    }
    public static void main (String[] args){
	test2 t2=new test2(); t2.display();
	t2.application();
	test2 t3=t2.application();
	t3.draw();
	test1 t_1=new test2();
    }
}
