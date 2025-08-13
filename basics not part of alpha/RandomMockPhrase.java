import java.util.Random;

public class RandomMockPhrase {
    public static void main(String[] args) {
        String[] adjectives = {
            "pagal", "gadhi", "bewakoof", "pitani wali", "iski besti kripa hai",
            "khushi hai ", "biharan pagli", "Psycho", "baklol", "boka"
        };

        String[] nouns = {
            "kuposit", "komal", "pagal", "girlcr ", 
        };

        Random rand = new Random();

        String randomAdjective = adjectives[rand.nextInt(adjectives.length)];
        String randomNoun = nouns[rand.nextInt(nouns.length)];

        System.out.println("You " + randomAdjective + " " + randomNoun + "!");
    }
}

