import sbt._
class SampleProject(info: ProjectInfo) extends DefaultWebProject(info) {
    import BasicScalaProject._

    lazy val print = task {log.info("Start custom task."); None}
    val repo = "Java.net Repository" at "http://download.java.net/maven/2/"
    val struts2_core  = "org.apache.struts" % "struts2-core" % "2.1.8"
    val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.14" % "test->default"
    val asm           =  "asm"           %  "asm"          % "3.1"
    val jersey_server = "com.sun.jersey" % "jersey-server" % "1.1.5"
    val jersey_core   = "com.sun.jersey" % "jersey-core" % "1.1.5" 
    val jsr           = "javax.ws.rs"    % "jsr311-api-1.1.1.jar"
    val slf4j_api        = "org.slf4j" % "slf4j-api" % "1.6.0"
    val jcl_over_slf4j   = "org.slf4j" % "jcl-over-slf4j" % "1.6.0"
    val jul_to_slf4j     = "org.slf4j" % "jul-to-slf4j" % "1.6.0"
    val log4j_to_slf4j   = "org.slf4j" % "log4j-over-slf4j" % "1.6.0"
    val logback_core     = "ch.qos.logback" % "logback-core" % "0.9.21"
    val logback_classic  = "ch.qos.logback" % "logback-classic" % "0.9.21"

    val scalaTest = "org.scalatest" % "scalatest" % "1.0" % "test"

    override def javaCompileOptions = super.javaCompileOptions ++
        Seq("-source", "1.6", "-encoding", "utf8").map(x => JavaCompileOption(x))

}

// vim: set ts=4 sw=4 et:
