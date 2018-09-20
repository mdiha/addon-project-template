package org.exoplatform.addons;
import org.exoplatform.container.ExoContainer;
import org.exoplatform.container.ExoContainerContext;
import org.exoplatform.services.log.ExoLogger;
import org.picocontainer.Startable;
import org.exoplatform.services.log.Log;

/**
 * Created by eXo Platform SAS.
 *
 */

public class MyService implements Startable {
	ExoContainer myContainer = ExoContainerContext.getCurrentContainer();
	MySecondService myService = (MySecondService) myContainer.getComponentInstanceOfType(MySecondService.class);

	private static final Log LOG = ExoLogger.getLogger(MyService.class);

	public void start() {
		LOG.info("Service Started");
		myService.echo();
	  }
  
  	public void stop() {
	  LOG.info("Service Stopped");
	  }

}
