@main def main: Unit =
  val app = new com.hashicorp.cdktf.App
  new MainStack(app, "example")
  app.synth()
