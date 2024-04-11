import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> planA = new ArrayList<>();
        planA.add("Paris");
        planA.add("Berlin");
        planA.add("Kracow");
        System.out.println("PalnA: " + planA);

        List<String> planB = replan(planA, "Vienna", "Kracow");
        System.out.println("PlanB: " + planB);

        System.out.println("PlanA: " + planA);

        System.out.println("--- Coffee Break ---");

        List<Double> lapTimes = new ArrayList<>();
        lapTimes.add(31.0);
        lapTimes.add(20.9);
        lapTimes.add(21.1);
        lapTimes.add(21.3);

        System.out.printf("Total: %.1fs\n", totalTime(lapTimes));
        System.out.printf("Avg: %.1fs\n", avgTime(lapTimes));
    
    }

    static List<String> replan(List<String> plan,
                                String newCity,
                                String beforeCity) {
        int newCityIndex = plan.indexOf(beforeCity);
        List<String> replaned = new ArrayList<>(plan);
        replaned.add(newCityIndex, newCity);
        return replaned;
    }

    static double totalTime(List<Double> lapTimes) {
        List<Double> withoutWarmUp = new ArrayList<>(lapTimes);
        withoutWarmUp.remove(0);
        double sum = 0;
        for (double x : withoutWarmUp) {
            sum += x;
        }
        return sum;
    }

    static double avgTime(List<Double> lapTimes) {
        double time = totalTime(lapTimes);
        List<Double> withoutWarmUp = new ArrayList<>(lapTimes);
        withoutWarmUp.remove(0);
        int laps = withoutWarmUp.size();
        return time / laps;
    }
}
