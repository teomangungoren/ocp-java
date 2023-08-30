package coreJava.RecentlyAddedFeatures;

public class TextBlockTest {
    public static void main(String[] args) {
        String textBlock = """
             This is an example of a text block.
              It is a new feature in Java.
                Text blocks make it easy to work with multiple lines.
              You can use newline characters.
             You can also include " and  characters directly.
        """;

        String str="""
                 A text block can use double quotes without
                 the need for escape sequences.For example:

                 He said,"The cat is on the roof."
                 She asked,"How did it get up there?"
                """;


        String text="""
                    one \
                    two
                    three \
                    four
                """;        

        System.out.println(textBlock);
        System.out.println("**");
        System.out.println(str);
        System.out.println(text);
    }
}
