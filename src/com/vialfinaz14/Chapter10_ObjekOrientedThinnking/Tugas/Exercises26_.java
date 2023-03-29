package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

public class Exercises26_ {
    public static void main(String[] args) {
        String a = args[0].replaceAll(" ", "");
        a = a.replaceAll("[+]", "#+#");
        a = a.replaceAll("[-]", "#-#");
        a = a.replaceAll("[*]", "#*#");
        a = a.replaceAll("[/]", "#/#");
        args = a.split("#");

        if (args.length != 3) {
            System.out.println("Usage : java Calculator operand1" +
                    " operator operand2");
            System.exit(0);
        }
    }
}
