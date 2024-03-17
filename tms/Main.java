package edu.miu.mpp401.project.tms;

import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import org.beryx.textio.TextTerminal;

public class Main {
    public static void main(String[] args) {
        TextIO textIO = TextIoFactory.getTextIO();
        String user = textIO.newStringInputReader()
                .withDefaultValue("admin")
                .read("Username");

        String password = textIO.newStringInputReader()
                .withMinLength(6)
                .withInputMasking(true)
                .read("Password");

        int age = textIO.newIntInputReader()
                .withMinVal(13)
                .read("Age");

        TextTerminal terminal = textIO.getTextTerminal();
        terminal.printf("\nUser %s is %d years old, and has the password %s.\n",
                user, age, password);
    }
}