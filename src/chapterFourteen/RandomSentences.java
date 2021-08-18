package chapterFourteen;

import java.security.SecureRandom;

public class RandomSentences {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        String[] article = {"the" , "a" , "one" , "some", "any"};
        String[] noun = {"boy" , "girl" , "dog" , "town","car"};
        String[] verb = {"drove" , "jumped" , "ran" , "walked","skipped"};
        String[] prepositions = {"to" , "from" , "over" , "under","on"};

        for (int i = 0; i < 20; i++){
            String articles = (article[random.nextInt(article.length-1)]);

            System.out.println(Character.toUpperCase(articles.charAt(0)) + articles.substring(1) + " " +
                    noun[random.nextInt(noun.length-1)]
            + " " + verb[random.nextInt(verb.length-1)] + " " +
                    prepositions[random.nextInt(prepositions.length-1)]
            + " " + article[random.nextInt(article.length-1)] + " " +
                    noun[random.nextInt(noun.length-1)] + ".");
        }
    }
}
