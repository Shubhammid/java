package series;

public class Day103_2 {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
    }
    static class Trie {
        private final TrieNode root;
        public Trie() {
            root = new TrieNode();
        }
        public void insert(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                current = current.children[index];
            }
            current.isEndOfWord = true;
        }
        public boolean search(String word) {
            TrieNode node = findNode(word);
            return node != null && node.isEndOfWord;
        }
        public boolean startsWith(String prefix) {
            return findNode(prefix) != null;
        }
        private TrieNode findNode(String str) {
            TrieNode current = root;
            for (char ch : str.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    return null;
                }
                current = current.children[index];
            }
            return current;
        }
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}