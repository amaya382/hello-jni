public class Main {
  public static void main(String[] args) {
    System.loadLibrary("Impl");
    Interface impl = new Interface();
    impl.action();
  }
}

