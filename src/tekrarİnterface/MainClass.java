package tekrarÝnterface;

public class MainClass {

	public static void main(String[] args) {
		Tamirci tamir =new Tamirci();
		Laptop l1 = new Laptop();
		Monitör m1 = new Monitör();
		tamir.tamirEt(l1);
		tamir.tamirEt(m1);

	}

}
