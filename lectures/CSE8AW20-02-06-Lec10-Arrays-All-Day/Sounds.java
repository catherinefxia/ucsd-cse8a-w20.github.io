public class Sounds {

    public static void main(String[] args){
      int[] sound = CSE8ALib.readSound("sounds/UpbeatFunk.wav");
      CSE8ALib.explore(sound);

      for(int i = 0; i < 1000; i += 1) {
        System.out.print(sound[i] + " ");
      }
    }

}
