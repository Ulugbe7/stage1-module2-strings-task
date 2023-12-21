package com.epam.mjc;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class StringSplitter {

    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source     source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        List<String> splittedList = new LinkedList<>();
        StringBuilder mWord = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (delimiters.contains(String.valueOf(source.charAt(i)))) {
                if (!mWord.isEmpty()) {
                    splittedList.add(mWord.toString());
                    mWord.setLength(0);
                }
            } else {
                mWord.append(source.charAt(i));
            }
        }
        if (!mWord.isEmpty()) {
            splittedList.add(mWord.toString());
        }
        return splittedList;
    }

    public static void main(String[] args) {
        System.out.println(new StringSplitter().splitByDelimiters("qw3e1rt4yu2i3opa1sd1fg2hj4kl", List.of("1", "2", "3")));
    }
}
