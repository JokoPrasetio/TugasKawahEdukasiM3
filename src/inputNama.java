import java.util.Scanner;
public class inputNama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama Kamu :");
        String nama = input.nextLine();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi, " + nama);
    }
}
