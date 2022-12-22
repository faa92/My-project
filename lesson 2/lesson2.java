import java.util.Scanner;

public class lesson2 {
    public static void main(String[] aregs) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Здравствуйте: " + username);
        System.out.print("Введите год вашего рождения: ");
        Scanner m = new Scanner(System.in);
        short year = m.nextShort();
        System.out.println("Ваш возраст " + (2022 - year) + " лет. Добро Пожаловать!");

}


}




