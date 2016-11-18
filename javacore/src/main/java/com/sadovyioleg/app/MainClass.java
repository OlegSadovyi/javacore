package com.sadovyioleg.app;

public class MainClass {

    public static void main(String[] args) {
        new Bank ("Privat");
        Bank otp = new Bank("OTP");
        Person richMan = new Person();

        richMan.setAge(45);
        richMan.setFeedbackFlag(true);
        richMan.setSalary(30000);
        richMan.setWorkFlag(false);
        richMan.setWorkingTime(0);

        Person nishebrod = new Person();
        nishebrod.setAge(28);
        nishebrod.setFeedbackFlag(false);
        nishebrod.setWorkFlag(false);
        nishebrod.setWorkingTime(1);
        nishebrod.getSalary(2000);

        Person teenager = new Person();
        teenager.setAge(17);
        teenager.setFeedbackFlag(true);
        teenager.setWorkingTime(0);
        teenager.setSalary(5000);

        Person pensioner = new Person();
        pensioner.setAge(70);
        pensioner.setSalary(2000);
        pensioner.setWorkFlag(true);
        pensioner.setFeedbackFlag(true);

        Person student = new Person();
        student.isFeedbackFlag();
        student.getSalary(4000);
        student.setWorkFlag(false);

        System.out.println("richMan Loan accept: " + otp.isloanCanBeIssue(richMan));
        System.out.println("nishebrod Loan accept: " + otp.isloanCanBeIssue(nishebrod));
        System.out.println("teenager Loan accept: " + otp.isloanCanBeIssue(teenager));
        System.out.println("pensioner Loan accept: " + otp.isloanCanBeIssue(pensioner));
        System.out.println("student Loan accept: " + otp.isloanCanBeIssue(student));
    }
}


