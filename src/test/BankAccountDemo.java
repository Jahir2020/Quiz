package test;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount accJahir = new BankAccount();
        accJahir.printInfo();

        accJahir.accountHolderName = "Jahir Tanvir";
        accJahir.accountNumber = "Vcs487";
        accJahir.amount = 0.0;
        accJahir.printInfo();

        BankAccount accTanvir = new BankAccount();

        accTanvir.accountHolderName = "Md Tanvir";
        accTanvir.accountNumber = " Abc554 ";
        accTanvir.amount = 500.0;
        accTanvir.printInfo();

    }
}

