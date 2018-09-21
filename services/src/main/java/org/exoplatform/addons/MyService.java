package org.exoplatform.addons;
import org.exoplatform.services.log.ExoLogger;
import org.picocontainer.Startable;
import org.exoplatform.services.log.Log;

/**
 * Created by eXo Platform SAS.
 *
 */

public class MyService implements Startable {
	MySecondService secondservice;
	private static final Log LOG = ExoLogger.getLogger(MyService.class);

	public  MyService (MySecondService mySecondService){
		this.secondservice=mySecondService;
	}

	public void start() {
		LOG.info("Service Started");
		secondservice.echo();
	}

	public void stop() {
		LOG.info("Service Stopped");
	}

}