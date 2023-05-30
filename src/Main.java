import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Smartphone iPhone = new Smartphone("Apple", "iPhone 14 Pro Max", 1600, 6.5, 6);
        Smartphone Samsung = new Smartphone();

        String modello = " ";
        String marca = " ";
        double prezzo;
        double pollici;
        double ram;
        System.out.println("Inserire marca: ");
        marca = sc.nextLine();
        System.out.println("Inserire modello: ");
        modello = sc.nextLine();

        System.out.println("Inserire prezzo: ");
        prezzo = sc.nextDouble();
        System.out.println("Inserire pollici: ");
        pollici = sc.nextDouble();
        System.out.println("Inserire ram: ");
        ram = sc.nextDouble();
        Samsung.setMarca(marca);
        Samsung.setModello(modello);
        Samsung.setNumPollici(pollici);
        Samsung.setPrezzoDiLancio(prezzo);
        Samsung.setRam(ram);
        System.out.println();
        System.out.println(Samsung.toString());
        System.out.println();
        System.out.println("Marca: "+iPhone.getMarca());
        System.out.println("Modello: "+iPhone.getModello());
        System.out.println("Pollici: "+iPhone.getNumPollici());
        System.out.println("Ram: "+iPhone.getRam()+"Gb");
        System.out.println("Prezzo al lancio: "+iPhone.getPrezzoDiLancio()+"€");
        System.out.println();

    }


	}


