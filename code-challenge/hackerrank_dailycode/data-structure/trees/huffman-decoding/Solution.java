/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root) {
    StringBuilder sb = new StringBuilder();
    Node tmpNode = root;

    for (int i = 0; i < S.length(); i++) {
        if(S.charAt(i) == '1') {
            tmpNode = tmpNode.right;
        } else if(S.charAt(i) == '0') {
            tmpNode = tmpNode.left;
        }

        if(tmpNode.data != '\0') {
            sb.append(tmpNode.data);
            tmpNode = root;
        }
    }

    System.out.println(sb.toString());
}
