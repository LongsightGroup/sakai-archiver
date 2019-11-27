package org.sakaiproject.archiver.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Utility to convert an object into a JSON representation
 */
public class Jsonifier {

	private Jsonifier() {
	}

	/**
	 * Serialise an object to JSON
	 *
	 * @param obj the object to serialise
	 * @return a String of JSON
	 */
	public static String toJson(final Object obj) {
		ObjectMapper mapper = new ObjectMapper();
    try {
		  return mapper.writeValueAsString(obj);
    } catch (com.fasterxml.jackson.core.JsonProcessingException ex) {
      ex.printStackTrace();
    }
    return "";
	}
}
