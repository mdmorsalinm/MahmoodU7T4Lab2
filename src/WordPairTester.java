public class WordPairTester {
    public static void main(String[] args) {

        System.out.println("------- TESTING PART A (constructor) ------");
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        //After the code segment has executed, the allPairs instance variable
        // of exampleOne should contain the following WordPair objects in some order:
        //("one", "two"), ("one", "three"), ("two", "three")
        System.out.println("TEST 1: " + exampleOne);
        System.out.println("TEST 2: " + exampleOne.getAllPairs().size());

        String[] phrase = {new String("the"), "more", new String("the"), "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        //After the code segment has executed, the allPairs instance variable
        // of exampleTwo should contain the following WordPair objects in some order:
        //("the", "more"), ("the", "the"), ("the", "merrier"), ("more", "the"),
        //("more", "merrier"), ("the", "merrier")
        System.out.println("TEST 3: " + exampleTwo);
        System.out.println("TEST 4: " + exampleTwo.getAllPairs().size());

        String[] moreWords = {new String("the"), new String("red"), "fox", new String("the"), new String("red")};
        WordPairList exampleThree = new WordPairList(moreWords);
        //After the code segment has executed, the allPairs instance variable
        //of exampleThree will contain the following WordPair objects in some order.
        //("the", "red"), ("the", "fox"), ("the", "the"), ("the", "red"),
        //("red", "fox"), ("red", "the"), ("red", "red"), ("fox", "the"),
        //("fox", "red"), ("the", "red")
        System.out.println("TEST 5: " + exampleThree);
        System.out.println("TEST 6: " + exampleThree.getAllPairs().size());

        System.out.println("\n------- TESTING PART B (numMatches) ------");
        System.out.println("TEST 7: " + exampleOne.numMatches());
        System.out.println("TEST 8: " + exampleTwo.numMatches());
        System.out.println("TEST 9: " + exampleThree.numMatches());
    }
}