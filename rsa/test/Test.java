package rsa.test;

import java.util.Scanner;

import rsa.RSA;

public class Test {
    public static void main(String[] args) {
        RSA rsa = new RSA();
        Scanner sc = new Scanner(System.in);
        System.out.println(rsa.getPrivateKey()
                              .decrypt(rsa.getPublicKey()
                                          .encrypt(sc.nextLine())));
        sc.close();
    }
}