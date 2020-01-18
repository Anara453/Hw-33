package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("HomeWork33.Answer(B).txt");
        fileWriter.write("Exeption это проблема возникающая при выполнение программы");
        fileWriter.write("\nNullPointerExeption,IndexBoudofExeption,ArrayoutOFBoudExeption");
        fileWriter.write("\nExeption это класс в котором обробатываются ошибки Exeption наследуется от throwoble a throwoble нвследуется от обьекта");
        fileWriter.write("Не красиво будет выдовать ошибку :)");
        fileWriter.write("\ntry - вызывает находит исключение,catch - какую именно ошибку вызвать и отработает его ");
        fileWriter.close();
        FileReader fileReader = new FileReader("HomeWork33.Answer(B).txt");
        Scanner sc = new Scanner(fileReader);
        int i = 1;
        while (sc.hasNextLine()) {
            System.out.println(i + ": " + sc.nextLine());
            i++;
            fileWriter.close();
        }
        FileWriter fileWriter1 = new FileWriter("HomeWork33.Answer(C).txt");
        fileWriter1.write("Error - это ошибка которая ведет программу к смерти и их нельзя обработать, RunTimeExeption и Error они не проверяемые ошибки которых нельзя обработать" +
                "CheckedExeption это ошибка каторую можно обработать и словить");
        fileWriter1.write("\nUnchecked Exceptions их нельзя обработать ; Checked Exceptions их можно обработать");
        fileWriter1.write("\ntry - вызывает находит исключение,catch - какую именно ошибку вызвать и отработает его, final -" +
                " это блок который выполняется всегда  вне зависимости было ли исключение или нет");
         fileWriter1.close();

         File file=null;
         try{
            FileReader fr = new FileReader("C:\\Users\\Anara\\IdeaProjects\\Hw 34\\HomeWork33.Answer(C).txt");
         }catch (FileNotFoundException e) {
         }
        file = new File("C:\\Users\\Anara\\IdeaProjects\\Hw 34\\HomeWork33.Answer(C).txt");

        if(file.length() >100000){
             throw new IllegalStateException();
         }

    }
}