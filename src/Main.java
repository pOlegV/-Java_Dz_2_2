public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int cshet = 100;
        int summaPopolneniy = 1100;
        int bonus;
        int itog;
        if (summaPopolneniy <= 100) {
            itog = summaPopolneniy + cshet;
            System.out.println("Клиент пополнил счёт на " + summaPopolneniy + " рублей - бонусов нет, итоговая сумма на счету клиента : " + itog + " рублей");
        } else {
            bonus = summaPopolneniy / 100;
            itog = bonus + summaPopolneniy + cshet;
            System.out.println("Клиент пополнил счёт на " + summaPopolneniy + " рублей - бонусов " + bonus + " , итоговая сумма на счету клиента : " + itog + " рублей");
        }
    }
}
