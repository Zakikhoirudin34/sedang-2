import java.util.Scanner;
public class volumetabung {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("masukkan jari- jari: ");
       double jari2=input.nextInt();
       System.out.println("masukkan tinggi tabung");
       double tinggi=input.nextInt();
       double p=3.14;
       double hasil=p*jari2*tinggi;
       
    
       System.out.println("volume tabung: "+hasil);
    }}