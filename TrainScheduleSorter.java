import java.util.*;

public class TrainScheduleSorter {

    static class TrainEntry {
        String fullDescription;
        String trainName;
        String departureTime;
        int inputOrder;

        TrainEntry(String fullDescription, int inputOrder) {
            this.fullDescription = fullDescription;
            this.inputOrder = inputOrder;

            String[] words = fullDescription.split(" ");
            this.trainName = words[0];
            this.departureTime = words[words.length - 1];
        }

        int convertTimeToMinutes(String timeStr) {
            String[] timeParts = timeStr.split(":");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);
            return hours * 60 + minutes;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTrains = Integer.parseInt(scanner.nextLine());
        List<TrainEntry> trainList = new ArrayList<>();

        for (int i = 0; i < totalTrains; i++) {
            String trainInfoLine = scanner.nextLine();
            trainList.add(new TrainEntry(trainInfoLine, i));
        }

        trainList.sort((entry1, entry2) -> {
            if (!entry1.trainName.equals(entry2.trainName)) {
                return entry1.trainName.compareTo(entry2.trainName);
            } else {
                int time1 = entry1.convertTimeToMinutes(entry1.departureTime);
                int time2 = entry2.convertTimeToMinutes(entry2.departureTime);
                if (time1 != time2) {
                    return Integer.compare(time2, time1);
                } else {
                    return Integer.compare(entry1.inputOrder, entry2.inputOrder);
                }
            }
        });

        for (TrainEntry train : trainList) {
            System.out.println(train.fullDescription);
        }
    }
}
