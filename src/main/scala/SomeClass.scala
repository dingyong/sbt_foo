object Sample3 extends Log {
    def main(args: Array[String]) {
        trace("trace test")
        trace("trace test")
        trace("trace test")
        trace("trace test")
        trace("trace test")
        debug("debug test")
        debug("debug test")
        debug("debug test")
        debug("debug test")
        debug("debug test")
        debug("debug test")
        debug("aaa " + " bbb " + w , 12345)
        debug("value debug : {} , {}", 4700, 4800)
        debug("value debug : {} , {}, {}, {}", 4700, 4800, "hello", "world")
        info("info test")
        info("info test")
        info("info test")
        info("info test")
        info("info test")
        info("info test")
        info("info test")
        info("value info : {} , {}", 4700, 4800)
        warn("warn test")
        warn("warn test")
        warn("warn test")
        warn("warn test")
        warn("warn test")
        warn("value warn : {} , {}", 4700, 4800)
        error("error test")
        error("error test")
        error("error test")
        error("error test")
        error("error test")
        error("error test")
        error("error test")
        error("value error : {} , {}", 4700, 4800)
    }

    def w(): String = {
        warn("at w() function ")
        "123 {}"
    }

}
// vim: set ts=4 sw=4 et:
