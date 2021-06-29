package chapterSevenExercises;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class MyersBriggsQuestionnaire {
    public static void main(String[] args) {

        String[][] myersBrigg = {{"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"},
                {"A. interpret literally", "B. look for meaning and possibilities"},
                {"A. logical, thinking, questioning", "B. empathetic, feeling, accommodating"},
                {"A. organized orderly", "B. flexible, adaptable"},
                {"A. more outgoing, think out loud", "B. more reserved,think to yourself"},
                {"A. practical, realistic, experiential", "B. imaginative, innovative, theoretical"},
                {"A. candid,straight forward, frank", "B. tactful, kind, encouraging"},
                {"A. plan, schedule", "B. unplanned, spontaneous"},
                {"A. seek many tasks, public activities,interaction with others", "B. seek private, solitary, activities with quiet to concentrate"},
                {"A. standard, unusual, conventional", "B. different,novel,unique"},
                {"A. firm,tend to criticize,hold the line", "B. gentle,tend to appreciate,conciliate"},
                {"A. regulated structured", "B. easygoing,live and  let live"},
                {"A. external,communicative,express yourself", "B. internal,reticent,keep to yourself"},
                {"A. focus on here and now", "B. look to the future, global perspective,big picture"},
                {"A. tough minded, just", "B. tender-hearted,merciful"},
                {"A. preparation, plan ahead", "B. go with the flow, adapt as you go"},
                {"A. active,initiate", "B. reflective,deliberate"},
                {"A. facts, things, what is", "B. ideas,dreams,what could be, philosophical"},
                {"A. matter of fact,issue-oriented", "B. sensitive,people-oriented,compassionate"},
                {"A. control, govern", "B. latitude,freedom"}};

        Scanner input = new Scanner(System.in);
        String userInput;
        int numA = 0;
        int numB = 0;
        char[] answers = new char[myersBrigg.length];
        char temp;
        boolean isValidEntry = false;
        int questionNumber = 1;


        for (int a = 0; a < myersBrigg.length; a++) {
            System.out.println("Choose the option that best suites you: A or B:");
            System.out.printf("Question %d%n",questionNumber);
            questionNumber++;
            for (int b = 0; b <= 1; b++) {
                System.out.println(myersBrigg[a][b] + " ");
            }
            System.out.println("Enter your option:");
            try {
                temp = input.next().charAt(0);
                System.out.println();

                if (temp == 'A' || temp == 'B' || temp == 'a' || temp == 'b') {
                    answers[a] = temp;
                    isValidEntry = true;
                } else {
                    isValidEntry = false;
                    throw new InvalidParameterException("Invalid letter option");
                }
            } catch (InvalidParameterException error) {
                System.out.println(error.getMessage());
            }
            if (!isValidEntry){
                a--;
                questionNumber--;
            }
            System.out.println("\n".repeat(30));
        }
        System.out.println("This is your best personality descriptions");
        String table = String.format("%5s%5s%s"," ","A","B");
        System.out.printf(table.repeat(4));
        for (int i = 1; i <= myersBrigg.length ; i += 4) {
            System.out.printf("%5d",i);
            if(answers[i - 1] == 'A' || answers[i - 1] =='a'){
                System.out.printf("%5s%5s","A"," ");
            } else
            {
                System.out.printf("%5s%5s"," ","B");
            }
            System.out.printf("%5d", i + 1);
            if(answers[i] == 'A' || answers[i] == 'a'){
                System.out.printf("%5s%5s","A"," ");
            }else
            {
                System.out.printf("%5s%5s"," ","B");
            }
            System.out.printf("%5d", i + 2);
            if(answers[i + 1] == 'A' || answers[i + 1] == 'a'){
                System.out.printf("%5s%5s","A"," ");
            }else
            {
                System.out.printf("%5s%5s"," ","B");
            }
            System.out.printf("%5d", i + 3);
            if(answers[i + 2] == 'A' || answers[i + 2] == 'a'){
                System.out.printf("%5s%5s","A"," ");
            }else
            {
                System.out.printf("%5s%5s"," ","B");
            }
        }
        int numberOfAs = 0;
        int numberOfBs = 0;

        System.out.printf("%5s","Total");

    }
}
