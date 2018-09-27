package org.exoplatform.addons;
import org.exoplatform.container.ExoContainer;
import org.exoplatform.container.ExoContainerContext;
import org.exoplatform.services.jcr.RepositoryService;



import org.exoplatform.services.log.ExoLogger;
import org.picocontainer.Startable;
import org.exoplatform.services.log.Log;


import javax.jcr.*;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.query.Query;
import javax.jcr.query.QueryManager;
import java.util.Calendar;


/**
 * Created by eXo Platform SAS.
 *
 */

public class MyService implements Startable {
	private static final Log LOG = ExoLogger.getLogger(MyService.class);
	Repository repository;
	MySecondService secondservice;
	Calendar rightNow = Calendar.getInstance();

	public  MyService (MySecondService mySecondService){
		this.secondservice=mySecondService;
	}

	public void start() {
		LOG.info("Service Started");
		LOG.info("***Today: "+rightNow);
		secondservice.echo();
		ExoContainer myContainer = ExoContainerContext.getCurrentContainer();
		RepositoryService repositoryService = (RepositoryService) myContainer. getComponentInstanceOfType(RepositoryService.class);

		LOG.info("My Container: " + myContainer);
		LOG.info("My Service: " + repositoryService);

		try {
			repository = repositoryService.getCurrentRepository();
			Credentials credentials = new SimpleCredentials("root", "gtn".toCharArray());
			Session jcrSession = repository.login(credentials, "collaboration");
			Node root = jcrSession.getRootNode();
			NodeIterator iterator = root.getNodes();
			while (iterator.hasNext()) {
				Node iterNode= iterator.nextNode();
				System.out.println(iterNode.getName());
			}

			Node node1 = root.getNode("Users/r___/ro___/roo___/root/Public/mynodes");
			//Node newNode = node1.addNode("Test", "exo:favoriteActivity3");
			//node1.getNode("Test").remove();
			QueryManager qm = jcrSession.getWorkspace().getQueryManager();
			Query q = qm.createQuery("select * from exo:favoriteActivity3", Query.SQL);
			NodeIterator ni = q.execute().getNodes();
			while (ni.hasNext()) {
				Node iNode= ni.nextNode();
				System.out.println("Nodes::"+ iNode.getName());
			}

			LOG.info("My Repository: " + repository);
			LOG.info("My Session: " + jcrSession);
			LOG.info("My RootNode: " + root);
			LOG.info("My Node1: " + node1);
			//LOG.info("My NewNode: " + newNode);
			jcrSession.save();
		} catch (RepositoryException e) {
			e.printStackTrace();
		}

	}

	public void stop() {
		LOG.info("Service Stopped");
	}

}