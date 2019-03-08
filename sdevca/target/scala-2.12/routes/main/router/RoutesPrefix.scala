// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/github/SDev4/sdevca/conf/routes
// @DATE:Fri Mar 08 16:19:50 GMT 2019


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
