import java.io.*;
import java.util.*;

public class Main {

    static class Node{
        Map<Character,Node> childNode;
        Boolean isEnd;

        public Node(){
            childNode = new HashMap<>();
            isEnd = false;
        }
    }

    static class Trie{
        Node root;
        public Trie(){
            root = new Node();
        }

        public void insert(String str){
            Node cur = this.root;
            for (char c: str.toCharArray()){
                if (!cur.childNode.containsKey(c)) cur.childNode.put(c,new Node());
                cur=cur.childNode.get(c);
            }
            cur.isEnd = true;
        }
        public boolean search(String str){
            Node cur = this.root;
            for (char c: str.toCharArray()){
                if (!cur.childNode.containsKey(c)) return false;
                cur=cur.childNode.get(c);
            }
            return cur.isEnd;
        }
    }

    public static void main(String[] args) throws IOException {

    }
}

