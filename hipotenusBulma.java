import java.util.Scanner;
public class hipotenusBulma {
    public static void main(String[] args){
        int a,b;
        double hipotenusKare;
        Scanner input=new Scanner(System.in);

        System.out.print("a kenarının uzunluğunu giriniz:");
        a=input.nextInt();

        System.out.print("b kenarının uzunluğunu giriniz:");
        b=input.nextInt();

        hipotenusKare=(a*a)+(b*b);
      double  hipotenus=Math.sqrt(hipotenusKare);

        System.out.println("hipotenüs uzunluğu:"+hipotenus);
    }
}
