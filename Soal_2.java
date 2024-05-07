import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for kubus
        System.out.print("Masukkan panjang rusuk kubus: ");
        int rusukKubus = scanner.nextInt();
        Kubus kubus = new Kubus(rusukKubus);

        System.out.println("-----------------");
        
        // Input for balok
        System.out.print("Masukkan panjang balok: ");
        double panjangBalok = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebarBalok = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggiBalok = scanner.nextDouble();
        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);

        System.out.println("-----------------");
        
        // Input for silinder
        System.out.print("Masukkan jari-jari silinder: ");
        double jariSilinder = scanner.nextDouble();
        System.out.print("Masukkan tinggi silinder: ");
        double tinggiSilinder = scanner.nextDouble();
        Silinder silinder = new Silinder(jariSilinder, tinggiSilinder);

         System.out.println("-----------------");
        
        // Input for bola
        System.out.print("Masukkan jari-jari bola: ");
        double jariBola = scanner.nextDouble();
        Bola bola = new Bola(jariBola);

        System.out.println("================");
        
        // Output volume dan luas permukaan
        System.out.println("Volume kubus: " + kubus.hitungVolume());
        System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());

        System.out.println("Volume balok: " + balok.hitungVolume());
        System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());

        System.out.println("Volume silinder: " + silinder.hitungVolume());
        System.out.println("Luas permukaan silinder: " + silinder.hitungLuasPermukaan());

        System.out.println("Volume bola: " + bola.hitungVolume());
        System.out.println("Luas permukaan bola: " + bola.hitungLuasPermukaan());
    }
}

class Kubus {
    private int rusuk;

    public Kubus(int rusuk) {
        this.rusuk = rusuk;
    }

    public int hitungVolume() {
        return rusuk * rusuk * rusuk;
    }

    public int hitungLuasPermukaan() {
        return 6 * rusuk * rusuk;
    }
}

class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}

class Silinder {
    private final double jari;
    private final double tinggi;

    public Silinder(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * jari * jari * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }
}

class Bola {
    private final double jari;

    public Bola(double jari) {
        this.jari = jari;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jari * jari * jari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jari * jari;
    }
}