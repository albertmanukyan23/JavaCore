package chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println();
                    if (t) {
                        break second;
                    }
                    System.out.println("This line we do not see");
                }
                System.out.println("This line we do not see");
            }
            System.out.println("||||||");
        }
    }
}
