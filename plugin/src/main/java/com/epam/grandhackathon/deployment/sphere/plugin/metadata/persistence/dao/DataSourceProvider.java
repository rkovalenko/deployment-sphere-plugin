package com.epam.grandhackathon.deployment.sphere.plugin.metadata.persistence.dao;

import javax.sql.DataSource;

import jenkins.model.Jenkins;

import org.h2.jdbcx.JdbcConnectionPool;

import com.epam.grandhackathon.deployment.sphere.plugin.metadata.Constants;
import com.google.inject.Provider;

public class DataSourceProvider implements Provider<DataSource>{

	public DataSource get() {
		return JdbcConnectionPool
				.create("jdbc:h2:" + Jenkins.getInstance().getPluginManager().rootDir.getAbsolutePath() + "/../" + 
						Constants.PLUGIN_DB_FILE_NAME, "username", "password");
	}

}
