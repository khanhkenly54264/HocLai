package com.K21CNT1.NQK.Lesson01.com.K21CNT1.NQK.Lesson01.pkg_LambdaExpression;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SortAfter8Example {
    public static void main(String[] args) {
        List<String> languages
                = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        Collections.sort(languages, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });

        for (String language : languages) {
            System.out.println(language);
        }

    }
}