public class Training36 {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 3, 6, 3, 3, 3, 3, 3, 543, 3};
        System.out.println(uniqueCount(array)+"/"+array.length+" numbers in array are unique");
    }

    static int uniqueCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++)
            {
                if (array[j] == array[i])
                {
                    count++;
                    break;
                }
            }
            }
        return count;
        }
    }
