public class GroupA_Kadai{
    public static void main(String[] args){
        int num1 = 500;
        int num2 = 21690;
        int num3 = 1308;
        int num4 = 113452;
        int num5 = 67;
        int num6 = 1;

        int sum = SI.Sum(num1, num2);
        int sub = SI.Sub(num3, num4);
        int multi = SI.Multi(num5, num6);

        int total = sum + sub + multi;

        System.out.printf("%d\n", total);
    }

    public static int Sum(int num1, int num2){
        int sum;

        sum = num1 + num2;
        return sum;
    }

    public static int Sub(int num1, int num2){
        int sub;

        sub = num2 - num1;
        return sub;
    }

    public static int Multi(int num1, int num2){
        int multi;

        multi = num1 * num2;
        return multi;
    }
}
