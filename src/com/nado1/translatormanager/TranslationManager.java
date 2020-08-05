package com.nado1.translatormanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class TranslationManager{

	private String language;
	private JSONObject obj;
	private String path;

	public TranslationManager(String isocode,String path) {
		this.language = isocode;
		this.path = path;
		readJson();

	}

	private void readJson() {
		String json = null;
		StringBuilder jsontext = new StringBuilder();
		try {
			InputStream in = getClass().getClassLoader()
					.getResourceAsStream(path);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			while ((json = reader.readLine()) != null) {
				jsontext.append(json);
			}
		} catch (IOException e) {
			new IOException("Übersetzungsdatei wurde nicht gefunden oder konnte nicht gelesen werden");
		}

		try {
			obj = new JSONObject(jsontext.toString());
		} catch (Exception e) {
			new Exception("Ein Fehler in der JSON Übersetzungsdatei ist aufgetretten");
		}

	}
	

	public String getText(String key) {
		return obj.getJSONObject(language).getString(key);

	}

}