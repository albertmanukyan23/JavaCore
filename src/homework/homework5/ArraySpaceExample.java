package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startCount = 0;
        int endCount = 0;
        //գտնում ենք թե քանի բացատ կա մասիվի սկզբից մինչև առարջին սինվոլը
        for (char c : spaceArray) {
            if (c != ' ') {
                break;
            }
            startCount++;

        }
        // գտնում ենք թե քանի բացատ կա վերջից մինչև առաջին հանդիպող սինվոլը
        for (char c : spaceArray) {
            if (c != ' ') {
                break;
            }
            endCount++;

        }
        char[] result = new char[spaceArray.length - (startCount + endCount)];
        System.out.print("result: ");

        for (int j = 0; j < result.length; j++) {
            result[j] = spaceArray[startCount++];
            System.out.print(result[j]);
        }

    }


}

