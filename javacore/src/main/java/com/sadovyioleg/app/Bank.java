package com.sadovyioleg.app;

import java.util.Scanner;

/**
 * Created by Oleg on 18.11.16.
 */
public class Bank {
        private static final float USD_RATE = 2601.1763F;
        private String bankName;

        public Bank(String bankName) {
            this.bankName = bankName;
        }

        public void showName() {

            System.out.println("Bank name: " + this.bankName);
        }
        public static float getUsdRate() {
            return 2601.1763F;
        }
        public boolean isloanCanBeIssue(Person person) {
            boolean result = false;
            byte score = 0;
            byte var10000;
            int score1;
            if(person.getAge() >= 18 && person.getAge() < 71) {
                score = (byte) (score + 1);
//                var10000 = score;
//                score1 = score + 1;
//                score = var10000;
            }
            if(person.isWorkFlag()) {
                score = (byte) (score + 1);
//                var10000 = score;
//                score1 = score + 1;
//                score = var10000;
            }
            if(person.getSalary('?') > 4000) {
                score = (byte) (score + 1);
//                var10000 = score;
//                score1 = score + 1;
//                score = var10000;
            }
            if(person.isFeedbackFlag()) {
                score = (byte) (score + 1);
//                var10000 = score;
//                score1 = score + 1;
//                score = var10000;
            }
            System.out.println("Score is: " + score);
            if(score >= 3) {
                System.out.println("Wooooooowww");
//                Scanner sc = new Scanner(System.in);
//                if(sc.nextInt() == 1) {

                    return true;
//                }
            } else {
                result = false;
            }
            return result;
        }
}
