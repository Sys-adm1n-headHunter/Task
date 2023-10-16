package tasks.six;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить:1-масса,2-расстояние");
        int conversionParameter = scanner.nextInt();

        if (conversionParameter >= 1 && conversionParameter <= 2) {

            if (conversionParameter == 1)
                System.out.println("Выберите единицу измерения: 1 - килограмм,2 - пуд, 3 - фунт, 4 - унция");
            if (conversionParameter == 2)
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");

            int unitMeasurement = scanner.nextInt();

            if (unitMeasurement >= 1 && unitMeasurement <= 4) {
                System.out.println("Введите количество единиц: ");
                double numberUnits = scanner.nextDouble();
                distanceConversion(unitMeasurement, numberUnits, conversionParameter);
            } else {
                System.out.println("Некоррекно введен параметр!");
            }


        } else {
            System.out.println("Некоррекно введен параметр!");
        }


    }

    // Метод для конфертации дистанции и веса
    private static void distanceConversion(int unitMeasurement, double numberUnits, int conversionParameter) {


        // Создал массив коэффициентов относительно метра
        double[] distanceCoefficients = {1.0, 0.00062, 1.09, 3.28};
        String[] distanceNames = {"Метры", "Милли", "Ярды", "Футы"};
        // Создал массив коэффициентов относительно килограмма
        double[] weightCoefficients = {1.0, 0.061, 2.2, 35.27};
        String[] weightNames = {"Килограммы", "Пуды", "Фунты", "Унции"};

        // Присвоение к временным перменным
        double[] tempCoefficients = (conversionParameter == 1) ? weightCoefficients : distanceCoefficients;
        double tempCoefficient = tempCoefficients[unitMeasurement - 1];
        String[] tempNames = (conversionParameter == 1) ? weightNames : distanceNames;


        System.out.println("Результат:");

        for (int i = 0; i < distanceCoefficients.length; i++) {
            //Получаю значение исходя из полученные коэффициент * количество единиц
            tempCoefficients[i] = ((tempCoefficients[i] / tempCoefficient) * numberUnits);

            System.out.println(tempNames[i] + ": " + tempCoefficients[i]);


        }


    }

}
