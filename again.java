import java.util.*;

public class again {

    static class Student {
        int studentId;
        int mark;
        int originalIndex;

        Student(int studentId, int mark, int originalIndex) {
            this.studentId = studentId;
            this.mark = mark;
            this.originalIndex = originalIndex;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStudents = sc.nextInt();

        int[] ids = new int[totalStudents];
        int[] marks = new int[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            ids[i] = sc.nextInt();
        }

        for (int i = 0; i < totalStudents; i++) {
            marks[i] = sc.nextInt();
        }

        Student[] studentArray = new Student[totalStudents];
        for (int i = 0; i < totalStudents; i++) {
            studentArray[i] = new Student(ids[i], marks[i], i);
        }


        Student[] sortedArray = Arrays.copyOf(studentArray, totalStudents);
        Arrays.sort(sortedArray, (s1, s2) -> {
            if (s2.mark != s1.mark) return s2.mark - s1.mark;
            return s1.studentId - s2.studentId;
        });


        int[] positionMap = new int[totalStudents];
        for (int i = 0; i < totalStudents; i++) {
            positionMap[sortedArray[i].originalIndex] = i;
        }


        boolean[] visited = new boolean[totalStudents];
        int minimumSwaps = 0;

        for (int i = 0; i < totalStudents; i++) {
            if (visited[i] || positionMap[i] == i) continue;

            int cycleLength = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = positionMap[j];
                cycleLength++;
            }

            if (cycleLength > 1) {
                minimumSwaps += (cycleLength - 1);
            }
        }


        System.out.println("Minimum swaps: " + minimumSwaps);
        for (Student student : sortedArray) {
            System.out.println("ID: " + student.studentId + " Mark: " + student.mark);
        }
    }
}
