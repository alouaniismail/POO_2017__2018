package gems;

public class Quartz implements Interface1{
    private Steven s;
    public Quartz(int xStart,int yStart){
	s=new Steven(xStart,yStart);
    }
     public void sing(){
	System.out.println("oui");
    }
    final public void move(int dx, int dy){
	/*xCurrent+=dx;yCurrent+=dy;*/
	s.attribut1+=dx;s.attribut2+=dy;
	/*
	s.draw2();//appel à draw2 donc en général: <=>à: s.draw2().
	*/
	drawShield(s.attribut1,s.attribut2);
    }
    private void drawShield(int x, int y){
	s.draw2();//de même.
	System.out.println("Draw a shild at: "+x+", "+y);
    }
}

/*
dans move drawShield est essentiel car si on s'amuse à faire les héritages et le 1er cas, ca se ferait pas car avec 2 instances bien définies, à l'éxecution il saura quoi faire contrairement à l'exo précédent.
Universe u1=new Universe(1,2);
u1.move();//cela va exécuter s.draw2() seulement
avec le comment et l'ajout de draw Shield le 1er cas se retrouve.
((QUI EST COHERENT SANS SE SOUCIER SU CARACTERE STATIQUE DU DEUXIEME.))
*/

/*
pas de substitution d'objets, passons oar un tyoe commun soit des choses communes soit en total implémentation d'une interface qui fournit un typoe commune !
*/



