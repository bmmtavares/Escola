
public class Principal {

	public static void main(String[] args) {
		
		Aluno macedo = new Aluno();
		macedo.bim1 = 70;
		macedo.bim2 = 60;
		macedo.bim3 = 80;
		macedo.bim4 = 70;

		System.out.println(macedo.media());
		System.out.println(macedo.passouDeAno());
	}

}
