package tekrarİnterface;

public class Tamirci {
	//TamirEdilebilir implement eden sınıfları tamir edebilir.
    public void tamirEt(TamirEdilebilir tamiredilebilir){ //interfaceden oluşturduk
        tamiredilebilir.tamirEdilebilir();
    }
}
