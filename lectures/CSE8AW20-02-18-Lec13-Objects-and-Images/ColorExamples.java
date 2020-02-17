import java.awt.Color;
import image.Image;


class ColorExamples {

  static Color grayscale(Color c) {




  }

  public static void main(String[] args) {
    Color cyan = new Color(0, 255, 255);
    Color gray = new Color(128, 128, 128);
    System.out.println(cyan);
    System.out.println(cyan.getBlue());

    Color anotherC = gray;
    Color[] colors = {cyan, gray, cyan};

    System.out.println(grayscale(gray));
    System.out.println(grayscale(cyan));
  }
}


