package demo;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public int isGood() {
        return 9;
    }

    public boolean validatePhoneNum(String s) {
        if (s == null || s.isEmpty())
            return false;
        if (s.length() == 10)
            return true;
        return false;
    }
}

