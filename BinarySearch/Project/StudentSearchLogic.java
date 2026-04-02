public class StudentSearchSystem {
    public static int binarySearch(Student[] students, int targetId) {
        int lo = 0;
        int hi = students.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (students[mid].id == targetId) return mid;
            else if (students[mid].id < targetId) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
