import java.util.Scanner;
public class luasLingkaranDanVolumeBalok {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jari-jari lingkaran : ");
        double jariJari = input.nextDouble();

        double luasLingkaran = 3.14 * jariJari * jariJari;
        System.out.println("Luas Lingkaran : " + luasLingkaran);
        System.out.print("Masukan panjang balok : ");
        double panjang = input.nextDouble();
        System.out.print("Masukan lebar balok : ");
        double lebar = input.nextDouble();
        System.out.print("Masukan tinggi balok : ");
        double tinggi = input.nextDouble();

        double volumeBalok = panjang * lebar * tinggi;
        System.out.println("Volume balok : " + volumeBalok);

        System.out.println("Hasil dari Luas lingkaran ( " + luasLingkaran + " ) " + "dan Volume Balok ( " + volumeBalok +" )");
    }
}
