import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, String> HashMap;

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        HashMap = new HashMap<>();
        System.out.println("Введите количество пользователей");
        int nume = scr.nextInt();
        for (int i = 0; i < nume; i++) {
            System.out.println();
            System.out.print("Введите логин:");
            String login;
            login = scr.next();
            System.out.print("Введите пароль:");
            String password;
            password = scr.next();
            HashMap.put(login, password);
        }
        for (Map.Entry entry : HashMap.entrySet()) {
            System.out.println("Вывод существующих пользователей ");
            System.out.println("Логин: " + entry.getKey() + " Пароль:  " + entry.getValue());
        }

    }
}


