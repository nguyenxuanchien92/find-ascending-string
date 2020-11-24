import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String str = "Welcome";
        LinkedList<Character> listChar = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int val = character;
            LinkedList<Character> list = new LinkedList<>();
            System.out.printf("Character:%s - %d \n", character, val);

            list.add(character);

            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(j) > list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if(list.size() > listChar.size()){
                listChar.clear();
                listChar.addAll(list);
            }
            list.clear();
        }
        for(Character ch :listChar){
            System.out.printf("%s",ch);
        }

    }
}
