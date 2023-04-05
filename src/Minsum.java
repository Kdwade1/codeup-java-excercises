import java.util.ArrayList;
import java.util.List;


    public class Minsum {
        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here
            int min = arr.get(0);
            int max = arr.get(0);
            long totalSum = 0;
            for (int n: arr) {
                totalSum += n;
                if (n < min) {
                    min = n;
                }
                if (n > max) {
                    max = n;
                }


            }
            System.out.println(totalSum-max);

            System.out.println(min);
            System.out.println(max);


        }

        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);

            miniMaxSum(arrayList);
        }
    }

