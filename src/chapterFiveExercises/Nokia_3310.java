package chapterFiveExercises;

import java.util.Scanner;

public class Nokia_3310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            String prompt1 = """
                    Menu Functions
                    1. PhoneBook
                    2. Messages
                    3. Chat
                    4. Call Register
                    5. Tones
                    6. Settings
                    7. Call Divert
                    8. Games
                    9. Calculator
                    10. Reminders
                    11. Clock
                    12. Profiles
                    13. Sim service         
                    """;
            System.out.println(prompt1);
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    String prompt2 = """
                            PhoneBook
                            1. Search
                            2. Service Nos.
                            3. Add name
                            4. Erase
                            5. Edit
                            6. Assign tone
                            7. Send b'card
                            8. Options
                            9. Speed dials
                            10. Voice tags
                            """;
                    System.out.println(prompt2);
                    switch (userInput) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            String prompt3 = """
                                    Option
                                    1.Type of view
                                    2.Memory status
                                    """;
                            System.out.println(prompt3);
                            break;
                        case 9:
                        case 10:
                            break;
                    }
                    break;
                case 2:
                    String prompt4 = """
                            Messages
                            1. Write messages
                            2. Inbox
                            3. Outbox
                            4. Picture messages
                            5. Templates
                            6. Smileys
                            7. Messages settings
                            8. Info service
                            9. Voice mailbox number
                            10. Service command editor                 
                            """;
                    System.out.println(prompt4);
                    switch (userInput) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 7:
                            String prompt5 = """
                                    Message setting
                                    1. set
                                    2. Common
                                    """;
                            switch (userInput) {
                                case 1:
                                case 2:
                                    break;
                            }
                        case 8:
                        case 9:
                        case 10:
                            break;
                    }
                case 3:
                    break;
                case 4:
                    String prompt6 = """
                            Call register
                            1. Missed calls
                            2. Received calls
                            3. Dialled numbers
                            4. Erase recent call lists
                            5. show call duration
                            6. Show call costs
                            7. Call cost settings
                            8. Prepaid credit
                            """;
                    System.out.println(prompt6);
                    switch (userInput) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            break;
                        case 5:
                            String prompt7 = """
                                    Call duration
                                    1. Last call duration
                                    2. All calls duration
                                    3. Received  calls duration 
                                    4. Dialled calls duration
                                    5. Clear timers
                                    """;
                            System.out.println(prompt7);
                            switch (userInput) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    break;
                            }
                        case 6:
                            String prompt8 = """
                                    Call costs
                                    1. Last call cost
                                    2. All calls cost
                                    3. Clear counters
                                    """;
                            System.out.println(prompt8);
                            switch (userInput) {
                                case 1:
                                case 2:
                                case 3:
                                    break;
                            }
                        case 7:
                            String prompt9 = """
                                    Cost settings
                                    1. Call cost limit
                                    2. Show costs in
                                    """;
                            System.out.println(prompt9);
                            switch (userInput) {
                                case 1:
                                case 2:
                                    break;
                            }
                        case 8:
                            break;
                    }
                case 5:
                    String prompt10 = """
                            Tones
                            1. Ringing tone 
                            2. Ringing volume
                            3. Incoming call alert
                            4. Composer
                            5. Message alert tone
                            6. Keypad tone
                            7. Warning and game tones
                            8. Vibrating alert
                            9. screen saver
                            """;
                    System.out.println(prompt10);
                    switch (userInput) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            break;
                    }
                case 6:
                    String prompt11 = """
                            Settings
                            1. Call settings
                            2. Phone settings
                            3. Security settings
                            4. Restore factory settings
                            """;
                    System.out.println(prompt11);
                    switch (userInput) {
                        case 1:
                            String prompt12 = """
                                    Call settings
                                    1. Automatic redial
                                    2. Speed dialling
                                    3. Call waiting options
                                    4. Own number sending
                                    5. Phone line in use
                                    6. Automatic answer
                                    """;
                            System.out.println(prompt12);
                            switch (userInput) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                            }
                            break;
                        case 2:
                            String prompt13 = """
                                    Phone settings
                                    1. Language
                                    2. Cell info display
                                    3. Welcome note
                                    4. Network selection
                                    5. Lights
                                    6. Confirm SIM service actions
                                    """;
                            System.out.println(prompt13);
                            switch (userInput) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                            }
                            break;
                        case 3:
                            String prompt14 = """
                                    Security settings
                                    1. PIN code request 
                                    2. Call barring service
                                    3. Fixed dialling
                                    4. Closed user group
                                    5. Phone security
                                    6. Change access codes
                                    """;
                            System.out.println(prompt14);
                            switch (userInput) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    break;
                            }
                            break;
                        case 4:
                            break;
                    }
                case 7:
                case 8:
                case 9:
                case 10:
                    break;
                case 11:
                    String prompt15 = """
                            1. Alarm clock
                            2. Clock settings
                            3. Date setting
                            4. Stopwatch
                            5. Countdown timer
                            6. Auto update of date and time
                            """;
                    System.out.println(prompt15);
                    switch (userInput) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                    }
                case 12:
                case 13:
                    break;
            }
        }while (userInput <= 13);
    }
}
