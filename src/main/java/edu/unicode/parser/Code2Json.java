package edu.unicode.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * Created by myhome on 1/19/20.
 */
public class Code2Json {

    public static void main(String a[]) throws IOException {
        String codes = "src/main/resources/codes.txt";

        try (Stream<String> stream =  Files.lines(Paths.get(codes))) {
            stream.forEach(c -> {
                String[] fields = c.split("\t");
                if(isSubject(fields[0])) {
                    System.out.println("********************");
                    System.out.println("subject:"+ fields[2]);
                    System.out.println("********************");
                } else if(!isMarker(c)){
                    String[] codeMetadata = c.split("\t");

                    System.out.print(codeMetadata[0]);
                    System.out.println(codeMetadata[1]);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isSubject(String content) {
        return content.equalsIgnoreCase("@");
    }

    private static boolean isMarker(String content) {
        String codeFields[] = content.split("\t");
        return (codeFields.length == 1 || codeFields[0].startsWith("@") || codeFields[0].length() == 0);
    }
}
