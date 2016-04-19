object Main extends App {
  System.loadLibrary("Impl")
  val impl = new Interface()
  impl.action()
}

