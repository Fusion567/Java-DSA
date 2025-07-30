public class Classroom{
    static class Node{
        Node[] children;
        boolean EndOfWord;

        public Node(){
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            EndOfWord = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if(root.children[idx]==null){
                //add new node
                root.children[idx] = new Node();
            }
            if(i==word.length()-1){
                root.children[idx].EndOfWord = true;
            }
            root = root.children[idx];
        }
    }
    public static void main(String[] args) {     
        String words[] = {"the","a","there"," their","any"};
        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }
    }
}
