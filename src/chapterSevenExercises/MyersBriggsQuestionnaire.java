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
            System.out.println("\n".repeat(50));
        }
        System.out.println("This is your best personality descriptions");
        String table = String.format("%5s%5s%5s"," ","A","B");
        System.out.print(table.repeat(4));
        System.out.println();
        System.out.println("_____________________________________________________________");

        int totalOneAs = 0;
        int totalOneBs = 0;
        int totalTwoAs = 0;
        int totalTwoBs = 0;
        int totalThreeAs = 0;
        int totalThreeBs = 0;
        int totalFourAs = 0;
        int totalFourBs = 0;

        for (int i = 1; i <= myersBrigg.length ; i += 4) {
            System.out.printf("%5d",i);
            if(answers[i - 1] == 'A' || answers[i - 1] =='a'){
                System.out.printf("%5s%5s","A"," ");
                totalOneAs+=1;
            } else
            {
                System.out.printf("%5s%5s"," ","B");
                totalOneBs+=1;
            }
            System.out.printf("%5d", i + 1);
            if(answers[i] == 'A' || answers[i] == 'a'){
                System.out.printf("%5s%5s","A"," ");
                totalTwoAs+=1;
            }else
            {
                System.out.printf("%5s%5s"," ","B");
                totalTwoBs+=1;
            }
            System.out.printf("%5d", i + 2);
            if(answers[i + 1] == 'A' || answers[i + 1] == 'a'){
                System.out.printf("%5s%5s","A"," ");
                totalThreeAs+=1;
            }else
            {
                System.out.printf("%5s%5s"," ","B");
                totalThreeBs+=1;
            }
            System.out.printf("%5d", i + 3);
            if(answers[i + 2] == 'A' || answers[i + 2] == 'a'){
                System.out.printf("%5s%5s","A"," ");
                totalFourAs+=1;
            }else
            {
                System.out.printf("%5s%5s"," ","B");
                totalFourBs+=1;
            }
            System.out.println();
        }
        System.out.println("_____________________________________________________________");
        System.out.printf("%5s%5d%5d%5s%5d%5d%5s%5d%5d%5s%5d%5d%n","Total",totalOneAs,totalOneBs," ",totalTwoAs,totalTwoBs,
                " ",totalThreeAs,totalThreeBs," ",totalFourAs,totalFourBs);
        char columnOne = 'a';
        char columnTwo = 'a';
        char columnThree = 'a';
        char columnFour = 'a';

        if (totalOneAs > totalOneBs) columnOne = 'E';
        if (totalOneAs < totalOneBs) columnOne = 'I';
        if (totalTwoAs > totalTwoBs) columnTwo = 'S';
        if (totalTwoAs < totalTwoBs) columnTwo = 'N';
        if (totalThreeAs > totalThreeBs) columnThree = 'T';
        if (totalThreeAs < totalThreeBs) columnThree = 'F';
        if (totalFourAs > totalFourBs) columnFour = 'J';
        if (totalFourAs < totalFourBs) columnFour = 'P';

        System.out.println("_____________________________________________________________");

        System.out.printf("%5s%5c%5s%5s%5c%5s%5s%5c%5s%5s%5c%n"," ",columnOne," "," ",columnTwo," "," ",columnThree,
                " "," ",columnFour);

        String personality = """
                            E - Extrovert   I - Introvert
                            S - Sensing     N - Intuition
                            T - Thinking    F - Feeling
                            J - Judging     P - Perceive
                            """;
        System.out.println(personality);
    }
}
