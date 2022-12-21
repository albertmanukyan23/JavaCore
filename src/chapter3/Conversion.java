package chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double a = 323.145;
        System.out.println("\nпреобразование типа int в byte");
        b = (byte) i;
        System.out.println("i = " + i + "b = " + b);
        System.out.println("преобразование типа double в int");
        i=(int)a;
        System.out.println("a = " + a + "i = " + i);
        System.out.println("преобразование типа double в byte");
        b= (byte)a;
        System.out.println("a = " + a+ "b = " + b);


    }

    public static class Area {
        public static void main(String[] args) {
            double pi, s, r;
            pi = 3.1416;
            r = 10.8;
            s = pi * r * r;
            System.out.println(s);
        }

        public static class IfForExample {
            public static void main(String[] args) {

                int a = 88;
                int b = 95;
                int max;

                //Գրել կոդ, որը կտպի այդ երկու փոփոխականից մեծը։

                if (a > b) {
                    max = a;
                    System.out.println(max);
                } else {
                    max = b;
                    System.out.println(max);
                }

                //Գրել կոդ, որ այդ նույն թվերից փոքրից մինչև մեծ ցիկլ կֆռռա, ու կտպի իրենց արանքում գտնվող բոլոր թվերը։

                for (int i = a; i <= b; i++) {
                    System.out.println(i);

                }
                //Փոխակերպել a-ի արժեքը char-տիպի, ու տպել թե ինչ սինվոլ ստացվեց։ Նույնը b-ի համար։

                char a1 = (char) a;
                char b1 = (char) b;

                System.out.println("a= " + a1 + "\nb= " + b1);

                //Գրել կոդ, որը կստուգի եթե a-ն հավասար է b-ին, կտպի` a-ն հավասար է բ-ին, եթե ոչ, կտպի որ հավասար չէ։

                if (a == b) {
                    System.out.println("\na-ն հավասար է b-ին");
                } else {
                    System.out.println("\na-ն հավասար չէ b-ին");

                }


            }
        }
    }
}
