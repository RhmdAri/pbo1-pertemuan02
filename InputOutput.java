import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
	String nama;
	System.out.print("Masukkan nama anda: ");
	nama = scanner.nextLine();
	System.out.println("Hai. "+nama);
	
	System.out.print("Masukkan jumlah SKS yang sudah ditempuh: ");
	jumlahSKS = scanner.nextInt();
	
	System.out.print("Masukkan IPK Sementara: ");
	IPK = scanner.nextDouble();
	
	double jumlah = IPK * jumlahSKS;
	System.out.print("Total Nilai : "+jumlah);
 }
}