package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.io.*;

public class Exercises7_ {
    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        try (
                ObjectInputStream input = new ObjectInputStream(new
                        BufferedInputStream(new FileInputStream("Exercises17_07.dat")))
                ){
            while (true) {
                Loan loan = (Loan) input.readObject();
                System.out.println(loan);
                System.out.printf("Total loan amount: $%.2f\n",
                        loan.getTotalPayment());
                System.out.println();
            }
        }
        catch (EOFException ex) {

        }
    }
}
//*********************************************************************************
// * (Restore objects from a file) Suppose a file named Exercise17_07.dat has been  *
// * created using the ObjectOutputStream. The file contains Loan objects. The Loan *
// * class in Listing 10.2 does not implement Serializable. Rewrite the Loan class  *
// * to implement Serializable. Write a program that reads the Loan objects from    *
// * the file and displays the total loan amount. Suppose you don’t know how many   *
// * Loan objects are there in the file, use EOFException to end the loop.          *
// *********************************************************************************/