
public class Main {

	public static int sommeDeDeuxNombre(int a, int b) {
		return a+b;
	}
	
	public static int soustractionDeDeuxNombr(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int premier = 15, deuxieme = 25;
		int troisieme = sommeDeDeuxNombre(premier,deuxieme);
		int quatrieme = soustractionDeDeuxNombr(troisieme,deuxieme);
		System.out.println("premier : "+premier);
		System.out.println("deuxieme : "+deuxieme);
		System.out.println("troisieme (la somme de deux nombre : premier + deuxieme) : "+troisieme);
		System.out.println("quatrieme (la soustraction de deux nombre : troisieme - deuxieme) : "+quatrieme);
	}

}
