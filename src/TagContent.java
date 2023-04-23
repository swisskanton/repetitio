import org.junit.platform.engine.support.discovery.SelectorResolver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Given a string of text in a tag-based language, parse this text and retrieve the contents
enclosed within sequences of well-organized tags meeting the following criterion:
    1. The name of the start and end tags must be same. The HTML code <h1>Hello World</h2>
    is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

    2. Tags can be nested, but content between nested tags is considered not valid.
    For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

    3. Tags can consist of any printable characters.

//Input Format
//    The first line of input contains a single integer, N (the number of lines).
//    The N subsequent lines each contain a line of text.

Output Format
    For each line, print the content enclosed within valid tags.
    If a line contains multiple instances of valid content, print out each instance
    of valid content on a new line; if no valid content is found, print "None".
 */
public class TagContent {

    public static void main(String[] args) {

        String file = "src/resources/tagContent.txt";
        Path path = Paths.get(file);
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(2);
        }
        String regex = "<(.+)>([^<>]+)</\\1>";
        //String regex = "<([a-z A-Z][a-z A-Z0-9]*)\\b[^>]*>.*?<\\/\\1>";
        Pattern pattern = Pattern.compile(regex);
        for (String line: content) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                matcher.reset();
                while (matcher.find())

                    for (int i = 0; i < matcher.groupCount(); i++) {
                        System.out.println(matcher.group(i));
                    }
                System.out.println();
                // it passes the Hackerrank test, but it doesn't work properly because
                // line 6 should print "this content <Amee>invalid tags</amee> is valid"

                    //System.out.println(matcher.group(2));
            } else
                System.out.println("None");
        }
    }
}