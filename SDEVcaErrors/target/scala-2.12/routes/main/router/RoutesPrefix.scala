// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/ca/SDEVca1/conf/routes
// @DATE:Fri Mar 01 14:31:00 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
