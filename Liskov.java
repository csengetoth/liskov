
class Madar {
public
     void repul() {System.out.println("repul");};
}


class Program {
public
     void fgv ( Madar madar ) {
          madar.repul();
     }
}

class Sas extends Madar
{}

class Pingvin extends Madar 
{}

class Liskov{

	public static void main ( String[] args)
	{	
     		Program program = new Program();
     		Madar madar = new Madar();
     		program.fgv ( madar );

     		Sas sas = new Sas();
     		program.fgv ( sas );

     		Pingvin pingvin = new Pingvin();
     		program.fgv ( pingvin ); 
	}
}

