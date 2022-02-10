import java.util.HashMap;

public class StepTracker {
    Converter converter = new Converter();
    int stepsToGoal = 10000;
    public HashMap<Integer, int[]> monthToData;

    public StepTracker() {
        monthToData = new HashMap<>();
        for (int i = 1; i < 13; i++) {
             {
                monthToData.put(i, new int[30]);
            }
        }
    }

    public void addSteps(int month, int day, int stepsPerDay) {
        int[] monthBuNum = monthToData.get(month);
        monthBuNum[day] = stepsPerDay;
    }

    public void getStatistic(int month) {
        int bestSeries = 0;
        int series = 0;
        int summ = 0;
        int maxSteps = 0;
        int k = 1;
        for (int steps : monthToData.get(month)) {
            System.out.println(k + " день: " + steps);
            k++;
            summ += steps;
            if (steps > maxSteps) {
                maxSteps = steps;
            }
            if (steps >= stepsToGoal) {
                series++;
                if (series>bestSeries) {
                    bestSeries = series;
                }
            } else  {
                    series = 0;
            }
        }


        System.out.println("Общее количество шагов за месяц: " + summ);
        System.out.println("Максимальное количество пройденных шагов: " + maxSteps);
        System.out.println("Среднее количество шагов: " + (summ/(k-1)));
        System.out.println("Пройденная дистанция составила: "  + converter.convertToKM(summ) + " км");
        System.out.println("Количество сожжённых килокалорий: " + converter.convertToCalories(summ));
        System.out.println("Лучшая серия: " + bestSeries + " дней");
    }

    void changeGoal(int change) {
        stepsToGoal = change;
        System.out.print("Целевое значение шагов измененно.\nНовая цель: " + stepsToGoal);
        if (change == 1) {
            System.out.println(" шаг");
        } else if (change>1 && change<5) {
            System.out.println(" шага");
        } else {
            System.out.println(" шагов");
        }

    }
}
