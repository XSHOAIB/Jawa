import java.util.ArrayList;

public class imp {

  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    System.out.println("Colors: " + colors);

    String secondColor = colors.get(1);
    System.out.println("Second color: " + secondColor);
    System.out.println(colors.get(1));

    colors.remove(0); // Remove "Red"
    System.out.println("Colors after removal: " + colors);
  }
}
