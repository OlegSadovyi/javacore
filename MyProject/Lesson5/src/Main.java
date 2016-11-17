public class Main {
    public static void main (String [] args){
        Bank pumb = new Bank("PUMB");
        Bank otp = new Bank ("OTP");

       /* pumb.showName ();
        otp.showName();


        System.out.println("USD rate: "+ Bank.getUsdRate());
        */


       Person richMan = new Person ();
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
        nishebrod.getSalary(40000);

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
        student.getSalary(40000);
        student.setWorkFlag(false);


        System.out.println("Loan accept: " + otp.isloanCanBeIssue(pensioner));

    }
}
