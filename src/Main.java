public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int account = 100;
        int topUpAmount = 1100;
        int bonus;
        int result;
        if (topUpAmount <= 100) {
            result = topUpAmount + account;
            System.out.println("Клиент пополнил счёт на " + topUpAmount + " рублей - бонусов нет, итоговая сумма на счету клиента : " + result + " рублей");
        } else {
            bonus = topUpAmount / 100;
            result = bonus + topUpAmount + account;
            System.out.println("Клиент пополнил счёт на " + topUpAmount + " рублей - бонусов " + bonus + " , итоговая сумма на счету клиента : " + result + " рублей");
        }
    }
}
