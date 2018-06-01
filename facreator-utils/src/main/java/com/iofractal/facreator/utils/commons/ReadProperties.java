/**
 * 
 */
package com.iofractal.facreator.utils.commons;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author dell
 *
 */
public class ReadProperties {

	private static final Logger LOG = Logger.getLogger(ReadProperties.class);

	public static Properties getProperties(String propertiesFile) {
		Properties properties = new Properties();
		FileInputStream resource = null;

		try {
			resource = new FileInputStream("/masiva/properties/"
					+ propertiesFile);
			properties.load(resource);
		} catch (Exception fnfe) {
			LOG.error("Error properties ", fnfe);
		} finally {

			try {

				if (resource != null) {
					resource.close();
				}

			} catch (IOException ioe) {
				LOG.error("ERROR ", ioe);
			}
		}
		return properties;
	}
}
