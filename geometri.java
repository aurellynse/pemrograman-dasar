import java.util.Scanner;

public class geometri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Pilihan anda: "); //ask user for their choice of shape
        int geometri = in.nextInt(); 
        float pi=3.14f; 

        switch (geometri) {
            case 1: //calculates the perimeter and area of a rectangle
            System.out.printf("%-17s : ", "Masukkan panjang");
            int panjang=in.nextInt();
            System.out.printf("%-17s : ", "Masukkan lebar");
            int lebar=in.nextInt();

            int kelilingp = ((panjang*2)+(lebar*2));
            int luasp = (panjang*lebar);

            System.out.println("");
            System.out.printf("%-17s : %d cm\n", "Keliling persegi", kelilingp);
            System.out.printf("%-17s : %d cm2\n", "Luas persegi", luasp);
            break;

            case 2: //calculates the perimeter and area of a circle
            System.out.print("Masukkan jari-jari : ");
            float r=in.nextFloat();

            float kelilingl = (2*pi*r);
            float luasl = pi*r*r;

            System.out.println("");
            System.out.printf("%-18s : %.2f cm\n", "Keliling lingkaran", kelilingl);
            System.out.printf("%-18s : %.2f cm2\n", "Luas lingkaran", luasl);
            break;

            case 3: //calculates the perimeter and area of a triangle
            System.out.printf("%-20s : ", "Masukkan tinggi");
            int tinggi=in.nextInt();
            System.out.printf("%-20s : ", "Masukkan alas");
            int alas=in.nextInt();
            System.out.printf("%-20s : ", "Masukkan hipotenusa");
            int hipotenusa=in.nextInt();

            float kelilings = (tinggi+alas+hipotenusa);
            float luass = (tinggi*alas/2);

            System.out.println("");
            System.out.printf("%-20s : %.2f cm\n", "Keliling segitiga", kelilings);
            System.out.printf("%-20s : %.2f cm2\n", "Luas segitiga", luass);            
            break;

            default: System.out.println("Data tak ditemukan, program dihentikan . . ."); 
        }
        in.close();
    }
}
