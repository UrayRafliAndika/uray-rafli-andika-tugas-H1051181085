import java.util.Scanner;

public class Latihan{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("            Persediaan Baju di Gudang     ");
		System.out.println("	          Toko Clothing Serdam               ");
		
		


		System.out.print("Nama Baju 		= ");
		String a = keyboard.next();

		System.out.print("Merek baju	        = ");
		String b = keyboard.next();

		System.out.print("kode baju 		= ");
		String c = keyboard.next();

		System.out.print("Jumlah Baju di Toko     = ");
		int d = keyboard.nextInt();
		System.out.print("Jumlah Baju di Gudang   = ");
		int e = keyboard.nextInt();
		int f = hasilFunction(d,e);
		System.out.println("Sales: Uray Rafli Andika");
		
		System.out.println("              Toko Clothing Serdam                 ");
		System.out.println("       jl Pembangunan Komplek Sejahtera No A420  ");
		

	}
		public static int hasilFunction (int n1, int n2){
			for(n1=0; n1<1; n1++)
				if(n2-n1<=50)
					System.out.println("Harus Ambil Stock Di Gudang");
				else
					System.out.println("Jual Stock Yang Ada Ditoko");
				return n1;
		
		}	
}