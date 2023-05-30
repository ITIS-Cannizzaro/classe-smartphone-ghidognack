
public class Smartphone {
	 private String marca;
	    private String modello;
	    private double prezzoDiLancio;
	    private double numPollici;
	    private double Ram;
	    public Smartphone() {
	        this.marca = " ";
	        this.modello = " ";
	        this.prezzoDiLancio = 0;
	        this.numPollici = 0.0;
	        this.Ram = 0;
	    }
	    public Smartphone(String marca, String modello, double prezzoDiLancio, double numPollici, double Ram) {
	        this.marca=marca;
	        this.modello=modello;
	        this.prezzoDiLancio=prezzoDiLancio;
	        this.numPollici=numPollici;
	        this.Ram=Ram;
	    }
	    public String getMarca() {
	        return marca;
	    }
	    public String getModello() {
	        return modello;
	    }
	    public double getPrezzoDiLancio() {
	        return prezzoDiLancio;
	    }
	    public double getNumPollici() {
	        return numPollici;
	    }
	    public double getRam() {
	        return Ram;
	    }
	    public void setMarca(String marc) {
	        marca = marc;
	    }
	    public void setModello(String model) {
	        modello = model;

	    }
	    public void setPrezzoDiLancio(double release) {
	        if(release > 3500) {
	            System.out.println("Prezzo non valido");
	        }
	        else
	            prezzoDiLancio = release;


	    }
	    public void setNumPollici(double inches) {
	        if(inches > 10) {
	            System.out.println("Parametro non valido");
	        }
	        else
	            numPollici = inches;

	    }
	    public void setRam(double random) {
	        if(random > 1500) {
	            System.out.println("Parametro non valido");
	        }
	        else
	            Ram = random;

	    }
	    public void ottieniFasciaDiPrezzo() {
	        if(prezzoDiLancio > 500) {
	            System.out.println("Fascia Alta");
	        }
	        else if(prezzoDiLancio >= 200 && prezzoDiLancio <= 500) {
	            System.out.println("Fascia Media");
	        }
	        else if(prezzoDiLancio < 200) {
	            System.out.println("Fascia Bassa");
	        }
	    }
	    public void ottieniTipologiaSmartphone() {
	        if(numPollici > 10) {
	            System.out.println("Non è uno smartphone");
	        }
	        else {
	        if(numPollici < 5) {
	            System.out.println("Mini");
	        }
	        else if(numPollici >= 5 && numPollici <= 7) {
	            System.out.println("Normal");
	        }
	        else if(numPollici > 7) {
	            System.out.println("Pro Max");
	            }
	        }
}
}
	    
