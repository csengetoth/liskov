class Szulo{
	public void uzenet(){
	System.out.println("I'm the parent class");}
}

class Gyerek extends Szulo{
	public void uzenet2(){
	System.out.println("I'm the child class");}
}

class Szulogyerek{
	public static void main (String[] args){

	Szulo szulo=new Gyerek();
	szulo.uzenet();
	//szulo.uzenet2();

	}
}
