package collistiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Это плозая реализация поиска палиндрома, чисто демонстрация работы с ListIterator, 
 * а именно работа с предыдцщим элементом
 */
public class ListIteratorTest {

    public static void main(String[] args) {
        // Будем проверять слова на принадлежность к палиндрому
        String str = "voovr";
        List<Character> list = new LinkedList<>();
        for(char ch: str.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while(iterator.hasNext()){
            if (!iterator.next().equals(reversIterator.previous())){
                isPalindrome = false;
            }
        }
        
        if (isPalindrome) {
            System.out.println("palindrome!!!");
        } else {
            System.out.println("Not palindrome");
        }
    }
    
}
