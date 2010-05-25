import org.slf4j.{Logger, LoggerFactory}

trait Log {
    private[this] val log = LoggerFactory.getLogger(getClass().getName())

    def trace(message: => String, values:Any*): Unit =
        if (log.isTraceEnabled) log.trace(message, values.map(_.asInstanceOf[Object]).toArray)
    def trace(message: => String, error: => Throwable): Unit = 
        if (log.isTraceEnabled) log.trace(message, error)
    def trace(message: => String, error: => Throwable, values:Any*): Unit = 
        if (log.isTraceEnabled) log.trace(message, error, values.map(_.asInstanceOf[Object]).toArray)

    def debug(message: =>String, values:Any*): Unit =
        if (log.isDebugEnabled) log.debug(message, values.map(_.asInstanceOf[Object]).toArray)
    def debug(message: =>String, error: =>Throwable): Unit = 
        if (log.isDebugEnabled) log.debug(message, error)
    def debug(message: =>String, error: =>Throwable, values:Any*): Unit =
        if (log.isDebugEnabled) log.debug(message, error, values.map(_.asInstanceOf[Object]).toArray)

    def info(message: =>String, values:Any*): Unit =
        if (log.isInfoEnabled) log.info(message, values.map(_.asInstanceOf[Object]).toArray)
    def info(message: =>String, error: =>Throwable): Unit =
        if (log.isInfoEnabled) log.info(message, error)
    def info(message: =>String, error: =>Throwable, values:Any*): Unit =
        if (log.isInfoEnabled) log.info(message, error, values.map(_.asInstanceOf[Object]).toArray)

    def warn(message: =>String, values:Any*): Unit =
        if (log.isWarnEnabled) log.warn(message, values.map(_.asInstanceOf[Object]).toArray)
    def warn(message: =>String, error: =>Throwable): Unit =
        if (log.isWarnEnabled) log.warn(message, error)
    def warn(message: =>String, error: =>Throwable, values:Any*): Unit = 
        if (log.isWarnEnabled) log.warn(message, error, values.map(_.asInstanceOf[Object]).toArray)

    def error(message: =>String, values:Any*): Unit =
        if (log.isErrorEnabled) log.error(message, values.map(_.asInstanceOf[Object]).toArray)
    def error(message: =>String, error: =>Throwable): Unit =
        if (log.isErrorEnabled) log.error(message, error)
    def error(message: =>String, error: =>Throwable, values:Any*): Unit = 
        if (log.isErrorEnabled) log.error(message, error, values.map(_.asInstanceOf[Object]).toArray)
}

// vim: set ts=4 sw=4 et:
