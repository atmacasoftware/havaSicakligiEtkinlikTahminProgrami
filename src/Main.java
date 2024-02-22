import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int sicaklik = 0;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sıcaklık değerinin alınması
        System.out.print("Sıcaklık kaç derece? : ");
        sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik <=15){
            System.out.println("Sinamaya gidebilirsiniz.");
        } else if (sicaklik >= 16 && sicaklik <= 25){
            System.out.println("Hava piknik için uygun.");
        } else if (sicaklik > 25){
            System.out.println("Havalar çok sıcak. Bence serinlemek için yüzmeye gitmelisin.");
        } else{
            System.out.println("Bir hata meydana geldi.");
        }


    }
}