public abstract class abstractClass{
    static int max=10;
    public void flight(){
	for(int nb=0;nb<=(int)(Math.random()*max);nb++){
	    faire();
	}
    }
    abstract public void faire();
}
