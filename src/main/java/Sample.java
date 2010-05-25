import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public static void main(String [] args) {
        // final Logger log = LoggerFactory.getLogger(Sample.class);
        Sample sample = new Sample();
        sample.sayHello();
    }

    public void sayHello() {
        log.debug("log debug test........");
        log.info("log info test........");
        log.info("log info test........");
        log.info("log info test........");
    }
}
