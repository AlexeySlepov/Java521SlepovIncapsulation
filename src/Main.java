public class Main {
    public static void main(String[] args) {

        // Задание 1

        ChildBankAccount account = new ChildBankAccount(10000);
        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(10000);
        account.depositMoney(-1000);
        System.out.println("Balance: " + account.getBalance());

        account.debitMoney(500);
        account.debitMoney(422.75);
        account.debitMoney(50000);
        account.debitMoney(-50);
        System.out.println("Balance: " + account.getBalance());


        System.out.println();
        System.out.println();

        //Задание 2

        Country country = new Country("Peru");
        country.setCapital("Lima");
        System.out.println("Capital: " + country.getCapital());

        country.setPopulation(33_850_000);
        country.setPopulation(33_750_000);
        System.out.println("Population: " + country.getPopulation());

    }
}
