import java.util.Scanner;

/**
 * Created by Oleg on 15.11.16.
 */
public class Bank {
    private static final float USD_RATE = 2601.1762f;

    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;

    }

    public void showName() {
        System.out.println("Bank name: " + bankName);
    }

    public static float getUsdRate() {
        return USD_RATE;
    }

    public boolean isloanCanBeIssue(Person person) {
        boolean result = false;
        int score = 0;
        if (person.getAge() >= 18 && person.getAge()<71) {
            score = score++;
        }
        if (person.isWorkFlag()) {
            score = score++;
        }
        if (person.getSalary(40000) > 4000) {
            score = score++;
        }
        if (person.isFeedbackFlag())
            score = score++;
        {
            System.out.println("Score is: " + score);
        }



    if (score >= 3) {
        System.out.print ("Wooooooowww");
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt()==1) {
            return true;
        }
    }

    else {
        result = true;
    }
    return result;
    }
}
