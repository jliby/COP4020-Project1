package edu.ufl.cise.plc;


public class main {

    public static void main(String[] args) {
        Lexer scan = new Lexer("1");
        scan.Scanner("=");
        System.out.println(scan.tokens.get(0).literal);
    }

}