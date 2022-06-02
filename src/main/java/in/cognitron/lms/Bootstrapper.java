
package in.cognitron.lms;

import org.simplity.fm.core.app.App;
import org.simplity.fm.core.app.App.Config;
import org.simplity.fm.core.app.AppConfigProvider;
import org.simplity.fm.core.conf.IDbConnectionFactory;
import org.simplity.fm.core.rdb.DefaultConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class Bootstrapper implements AppConfigProvider {
	private static final Logger logger = LoggerFactory.getLogger(Bootstrapper.class);

	@Override
	public Config getConfig() {
		final App.Config config = new Config();
		config.appName = "lms";
		config.appRootPackage = this.getClass().getPackage().getName();
		config.dbConnectionFactory = dbSetupWithConString();
		config.contextFactory = new ContextFactory();
		config.texter = new Texter();
		return config;
	}

	/*
	 * these have to be taken from a config file in production..
	 */
	private static final String CON_STRING ="jdbc:postgresql://localhost:5432/bt?user=supreeth";

	private static final String DRIVER_NAME = "org.postgresql.Driver";
	// private static final String DB_FACTORY = "dbFactoryClassName";
	// private static final String DB_DATA_SOURCE = "dataSourceJndiName";

	/**
	 * method to be used if this app wants to use connection string for db
	 * connection
	 *
	 * @param conString
	 * @param driverName
	 */
	private static IDbConnectionFactory dbSetupWithConString() {
		final String conString = CON_STRING;
		final String driverName = DRIVER_NAME;
		logger.info("Hellllloooooooo Setting up db with driver name = {} and connectionString=****", driverName);
		return DefaultConnectionFactory.getFactory(conString, driverName);
	}

	/**
	 * method to be used to set up rdbms using data source JNDI
	 *
	 * @param dataSourceName
	 */
	@SuppressWarnings("unused")
	private static IDbConnectionFactory dbSetupWithDataSource() {
		final String dataSourceName = "the designated JNDI name as per the documentation of the container/framework that provides this service";
		logger.info("Helloooooooooooooooo Setting up db with dataSource name = {}", dataSourceName);
		return DefaultConnectionFactory.getFactory(dataSourceName);
	}

	/**
	 * method to be used if the app has a custom connection factory
	 *
	 * @param factory
	 */
	@SuppressWarnings("unused")
	private static IDbConnectionFactory dbSetupWithCustomFctory() {
		/*
		 * write the code to get the factory, whichever you are supposed to get
		 * it..
		 */
		final IDbConnectionFactory factory = null;
		// logger.info("Setting up db with a custom connection factory class
		// {}", factory.getClass().getName());
		return factory;
	}

}
