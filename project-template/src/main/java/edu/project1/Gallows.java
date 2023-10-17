package edu.project1;

public class Gallows {
    private String word;
    private int len_word;
    private int[] guessed_letters;// массив, который показывает, какие буквы уже угадали, а какие нет.
    private int number_attempts = 5;
    private int number_of_letters_guessed = 0;
    private Pictures pictures = new Pictures();

    public Gallows(String word){
        this.word = word;
        this.len_word = word.length();
        this.guessed_letters = new int[len_word];
    }

    public void word_output(){
        StringBuilder word_output = new StringBuilder();
        for(int i = 0; i < len_word; i++){
            if(guessed_letters[i] == 1){
                word_output.append(word.charAt(i));
            }
            else{
                word_output.append("*");
            }
        }
        System.out.println(word_output.toString());
    }

    public void give_up(){
        System.out.println("The hidden word:\t" + word);
    }

    public boolean guess_letter(String user_input){
        if(user_input.length() == 1 && user_input.charAt(0) == '!'){
            give_up();
            return true;
        }
        else if(user_input.length() == 1 && ((user_input.charAt(0) >= 'a' && user_input.charAt(0) <= 'z' || user_input.charAt(0) >= 'A' && user_input.charAt(0) <= 'Z'))){
            return guess_letter_clean(Character.toLowerCase(user_input.charAt(0)));
        }
        else{
            System.out.println("incorrect data");
            System.out.println("==================");
            return true;
        }

    }

    public boolean guess_letter_clean(char letter){//корректные данные
        if(word.indexOf(letter) != -1 && guessed_letters[word.indexOf(letter)] == 1){
            System.out.println("Have you tried this letter yet");
        }
        else if(word.indexOf(letter) != -1){
            for(int i = 0; i < len_word; i++){
                if(word.charAt(i) == letter){
                    guessed_letters[i] = 1;
                    number_of_letters_guessed++;
                }
            }

            System.out.println("You guessed right");
            word_output();
            if(number_of_letters_guessed == len_word){
                System.out.println("You have won");
                return false;
            }
        }
        else{
            System.out.println("You made a mistake");
            number_attempts--;
            System.out.println(number_attempts + " out of 5 attempts left");
            pictures.output(4 - number_attempts);
            if(number_attempts == 0){
                System.out.println("You've lost.");
                give_up();
                return false;
            }
        }

        System.out.println("=================================");
        return true;


    }




}

