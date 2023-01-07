package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startIndex = 0;
        int endIndex = 0;
        //գտնում ենք թե քանի բացատ կա մասիվի սկզբից մինչև առարջին սինվոլը
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                break;
            }
            startIndex++;
        }
        // գտնում ենք թե քանի բացատ կա վերջից մինչև առաջին հանդիպող սինվոլը
        for (int j = spaceArray.length - 1; j > 0; j--) {
            if (spaceArray[j] != ' ') {
                break;
            }
            endIndex++;
        }
        char[] result = new char[spaceArray.length - (startIndex + endIndex)];
        System.out.print("result: ");

        for (int j = 0; j < result.length; j++) {
            result[j] = spaceArray[startIndex++];
            System.out.print(result[j]);
        }

    }


}

