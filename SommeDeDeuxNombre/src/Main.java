
public class Main {

	public static int sommeDeDeuxNombre(int a, int b) {
		return a+b;
	}
	
	public static int multiplicationDeDeuxNombre(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int premier = 15, deuxieme = 25;
		int troisieme = sommeDeDeuxNombre(premier,deuxieme);
		int cinquieme = multiplicationDeDeuxNombre(premier, deuxieme);
		System.out.println("premier : "+premier);
		System.out.println("deuxieme : "+deuxieme);
		System.out.println("cinquieme (multiplication de deux nombre : premier x deuxieme ) : "+cinquieme);
	}

}
