package eu.imninja.translator;

import eu.imninja.iso.ISO;

import java.io.*;
import java.util.Properties;

public class TranslationManager{

	private String path;

	private String code;

	private Properties properties = new Properties();

	public TranslationManager(ISO iso) {
		this.path = iso.getPath();
		this.code = iso.getCode();

		loadFile();
	}

	public TranslationManager(String path,String code) {
		this.path = path;
		this.code = code;

		loadFile();
	}

	private void loadFile() {
		try {
			InputStream in = new FileInputStream(new File(this.path));
			properties.load(in);
		} catch (IOException e) {
			new IOException("File loading wasnt sucessfull!").printStackTrace();
		}

	}



	public String getString(String key) {
		key = code + "." + key;
		return properties.getProperty(key);
	}
	public int getInt(String key) {
		key = code + "." + key;

		return Integer.parseInt(properties.getProperty(key));
	}
	public boolean getBool(String key){
		key = code + "." + key;
		return Boolean.parseBoolean(properties.getProperty(key));
	}
}