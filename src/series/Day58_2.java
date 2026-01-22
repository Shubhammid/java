package series;

import java.util.*;

public class Day58_2 {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                char[] arr = word.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    char original = arr[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[j] = c;
                        String newWord = new String(arr);
                        if (newWord.equals(endWord)) {
                            return level + 1;
                        }
                        if (set.contains(newWord)) {
                            queue.add(newWord);
                            set.remove(newWord);
                        }
                    }
                    arr[j] = original;
                }
            }
            level++;
        }
        return 0;
    }
    public static void main(String[] args) {
        String begin = "hit";
        String end = "cog";
        List<String> list = Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(ladderLength(begin, end, list));
    }
}
