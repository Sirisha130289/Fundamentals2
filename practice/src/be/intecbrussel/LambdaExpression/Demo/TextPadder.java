package be.intecbrussel.LambdaExpression.Demo;

public class TextPadder {

    private int size;

    public TextPadder(int size) {
        this.size = size;
    }

    public String pad(String s){
        StringBuilder sb = new StringBuilder();
      for(int i=0; i<s.length();i++){
          sb.append(' ');
        }
      sb.append(s);
      return sb.toString();
    }
}
