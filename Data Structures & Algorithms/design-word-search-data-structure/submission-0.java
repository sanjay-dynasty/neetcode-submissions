class WordDictionary {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }
    private TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }

    public boolean search(String word) {
        return searchInNode(word, 0, root);
    }

    private boolean searchInNode(String word, int index, TrieNode curr) {
        if (index == word.length())
            return curr.isEndOfWord;
        char ch = word.charAt(index);

        if (ch == '.') {
            for (TrieNode child : curr.children) {
                if (child != null && searchInNode(word, index + 1, child))
                    return true;
            }
            return false;
        } else {
            int childIndex = ch - 'a';
            TrieNode child = curr.children[childIndex];
            if (child == null) {
                return false;
            }
            return searchInNode(word, index + 1, child);
        }
    }
}
