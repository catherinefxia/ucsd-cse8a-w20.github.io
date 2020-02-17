import java.awt.Color;
import image.Image;

class ImageExamples {
  public static void main(String[] args) {
    Color[][] colors = {
        { new Color(255, 0, 0), new Color(0, 255, 0) },
        { new Color(0, 0, 255), new Color(255, 255, 255) }
      };
    Image colorGrid = new Image(colors);
    System.out.println(colorGrid);
    colorGrid.explore();
  }
}
