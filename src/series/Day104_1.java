package series;

import java.util.*;

public class Day104_1 {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
    static class Trie {
        TrieNode root = new TrieNode();
        public void insert(String word) {
            TrieNode curr = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (curr.children[index] == null) {
                    curr.children[index] = new TrieNode();
                }
                curr = curr.children[index];
            }
            curr.isEnd = true;
        }
        public List<String> autocomplete(String prefix) {
            List<String> result = new ArrayList<>();
            TrieNode curr = root;
            for (char ch : prefix.toCharArray()) {
                int index = ch - 'a';
                if (curr.children[index] == null) {
                    return result;
                }
                curr = curr.children[index];
            }
            dfs(curr, prefix, result);
            return result;
        }
        private void dfs(TrieNode node, String word, List<String> result) {
            if (node.isEnd) {
                result.add(word);
            }
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null) {
                    dfs(node.children[i],
                            word + (char) ('a' + i),
                            result);
                }
            }
        }
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");
        trie.insert("apply");
        trie.insert("banana");
        String prefix = "app";
        List<String> suggestions = trie.autocomplete(prefix);
        System.out.println("Suggestions: " + suggestions);
    }
}