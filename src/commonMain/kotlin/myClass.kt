package myPackage

expect annotation class CommonJsExport()

@CommonJsExport
open class MyClass {
  var myString: String = "Bob"
}
