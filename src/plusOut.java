public class plusOut {
  public String plusOut(String str, String word) {
    StringBuilder result = new StringBuilder();
    int found = str.indexOf(word);


    for (int i = 0; i < str.length(); i++) {
      if (i == found) {
        result.append(word);
        found = str.indexOf(word, found + word.length());
        i += word.length() - 1;
      } else {
        result.append("+");
      }
    }
    return result.toString();
  }
}
