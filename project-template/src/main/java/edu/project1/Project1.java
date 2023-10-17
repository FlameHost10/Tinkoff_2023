package edu.project1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Project1 {
    public static void run() throws IOException {
        String word = word_change();
        Gallows main_gallows = new Gallows(word);
        Scanner sc = new Scanner(System.in);
        boolean flag = true; //Продолжаем игру?

        System.out.println("The game has begun. Word length: " + 5);
        System.out.println("If you want to finish the game, click '!'");
        while(flag){
            String user_input = sc.next();
            flag = main_gallows.guess_letter(user_input);
        }
    }

    public static String word_change() throws IOException {
        int len_file = 5;
        int ind_word = (int)(Math.random() * (len_file));
        String word;
        FileReader reader = new FileReader("C:\\Users\\User\\JavaProjects\\Tinkoff_2023\\project-template\\src\\main\\java\\edu\\project1\\words");
        BufferedReader br = new BufferedReader(reader);
        while(ind_word > 0){
            br.readLine();
            ind_word--;
        }
        word = br.readLine();
        return word;
    }

}
