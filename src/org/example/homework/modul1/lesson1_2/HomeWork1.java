package org.example.homework.modul1.lesson1_2;

public class HomeWork1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. Убрать лишние пробелы
        String nameTrim = name.trim();
        //2. Перевести текст в верхний регистр
        String nameTrimUpperCase = nameTrim.trim().toUpperCase();
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}

        if (nameTrimUpperCase.contains(("ова ").toUpperCase())){
            System.out.println("Уважаемая " + nameTrimUpperCase);
        } else if (nameTrimUpperCase.contains(("ов ").toUpperCase())) {
            System.out.println("Уважаемый " + nameTrimUpperCase);
        } else{
            System.out.println("Неизвестное лицо " + nameTrimUpperCase);
        }
    }

    public static void ex2() {
        //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (fuel >= 10
                && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                && !hasErrors
                && isEngineWork) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        //Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        String replaceToLowerSimply = simply.toLowerCase().replace("this is", "those are");

        int firstIndexOfO = replaceToLowerSimply.indexOf("o");
        int secondIndexOf0 = replaceToLowerSimply.indexOf("o", firstIndexOfO + 1);

        System.out.println("Индекс второй буквы 'o' = " + secondIndexOf0);
    }

    public static void ex4() {
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
        // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг

        int otherCost = 1_000_000;

        int weightSausage = 2_000;
        int weightHam = 8_511;
        int weightNeck = 6_988;

        int priceSausage = 800;
        int priceHam = 350;
        int priceNeck = 500;

        // Расчет себестоимость колбасы от объема продаж
        int costPriceSausage;
        if (weightSausage < 1_000) {
            costPriceSausage = 412;
        } else if (weightSausage >= 1_000 && weightSausage < 2_000) {
            costPriceSausage = 408;
        } else {
            costPriceSausage = 404;
        }

        // Себестоимость ветчины
        int costPriceHam = 275;

        // Расчет себестоимость шейки от объема продаж
        int costPriceNeck;
        if (weightNeck < 500) {
            costPriceNeck = 311;
        } else {
            costPriceNeck = 299;
        }

        // Доход компании
        int incomeCompany = (weightSausage * priceSausage)
                + (weightHam * priceHam) + (weightNeck * priceNeck);
        // Расходы компании
        int expenseCompany = (weightSausage * costPriceSausage)
                + (weightHam * costPriceHam) + (weightNeck * costPriceNeck) + otherCost;
        // Прибыль до вычета налогов
        int profitBeforeTax = incomeCompany - expenseCompany;

        // Расчет налогов на прибыль
         double incomeTax;
         if(profitBeforeTax > 0 && profitBeforeTax <= 1_000_000) {
             incomeTax = profitBeforeTax * 0.08;
         } else if (profitBeforeTax > 1_000_000 && profitBeforeTax <= 2_000_000) {
             incomeTax = 80_000 + (profitBeforeTax - 1_000_000) * 0.1;
         } else if (profitBeforeTax > 2_000_000) {
             incomeTax = 80_000 + 100_000 + (profitBeforeTax - 2_000_000) * 0.13;
         } else {
             incomeTax = 0;
         }

        // Чистая прибыль компани после вычета налогов
        double netIncome = profitBeforeTax - incomeTax;

        System.out.printf("Доход компании составил %s, расходы составили %s, " +
                "прибыль до вычета налогов = %s, налоги на прибыль = %s, чистая прибыль составила %s" ,
                incomeCompany, expenseCompany, profitBeforeTax, incomeTax, netIncome);
    }
}