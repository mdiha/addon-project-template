package org.exoplatform.addons;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;

public class MySecondService {
    private static final Log LOG = ExoLogger.getLogger(MySecondService.class);

    public void echo() {
        LOG.info("Second Service Started");

    }
}



