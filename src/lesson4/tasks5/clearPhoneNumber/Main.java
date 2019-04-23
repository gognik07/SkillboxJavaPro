package lesson4.tasks5.clearPhoneNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер телефона: ");
        String phoneNumber = reader.readLine();
        System.out.println();

        String clearedPhoneNumber = phoneNumber.replaceAll("[^0-9]", "");
        System.out.println("Очищенный номер телефона: " + clearedPhoneNumber);
    }
}
