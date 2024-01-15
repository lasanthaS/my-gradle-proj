/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package my.gradle.proj.app;

import my.gradle.proj.list.LinkedList;

import static my.gradle.proj.utilities.StringUtils.join;
import static my.gradle.proj.utilities.StringUtils.split;
import static my.gradle.proj.app.MessageUtils.getMessage;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(result);
    }
}
