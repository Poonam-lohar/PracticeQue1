public class prime4 {
        public static void main(String[] args) {
            int num = 4;
            boolean flag = false;
            for (int i =2; i<=num/2; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
            {
                System.out.println("munber is prime");
            } else {
                System.out.println("number is not prime");
            }
        }
    }
