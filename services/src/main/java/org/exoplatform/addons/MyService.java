package org.exoplatform.addons;
import org.exoplatform.services.log.ExoLogger;
import org.picocontainer.Startable;
import org.exoplatform.services.log.Log;

/**
 * Created by eXo Platform SAS.
 *
 */

public class MyService implements Startable {
	private static final Log LOG = ExoLogger.getLogger(MyService.class);

	public void start() {
		LOG.info("Service started");
	  }

  
  public void stop() {
	  LOG.info("service stopped");
  }
}
