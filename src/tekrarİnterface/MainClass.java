package tekrar�nterface;

public class MainClass {

	public static void main(String[] args) {
		Tamirci tamir =new Tamirci();
		Laptop l1 = new Laptop();
		Monit�r m1 = new Monit�r();
		tamir.tamirEt(l1);
		tamir.tamirEt(m1);

	}

}
