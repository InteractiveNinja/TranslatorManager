## Translator Manager

With this tool is it easy to add multiple Translations for Texts, the language is choosen by the ISO code you give when you create the Object

# NEEDS THIS
[Java-JSON](https://github.com/stleary/JSON-java)

## Usage

```
TranslatorManager lang = new TranslatorManager("iso code", "path to the language.json file");


String translatedText = lang.getText("key");

System.out.println(translatedText);




```

## Format of the language.json

This is the way the language.json should look like.
then you can use your TranslatorManager to the most.

Example:

```

String translatedText = lang.getText("wait");


```

``` 

{
	"de": {
		"wait": "Bitte warten Sie einen Augenblick..",
		"wait2": "Systeminformationen werden gesammelt, bitte warten",
		"main":"Systeminformationen",
		"user.title":"User Informationen",
		"user.name":"Benutzer:",
		"user.language":"Sprache:",
		"user.country":"Land:",
		"java.title":"Java Informationen",
		"java.name":"Name:",
		"java.vendor":"Herausgeber:",
		"java.version":"Version:",
		"system.title":"System Informationen",
		"system.name":"OS Name:",
		"system.version":"OS Version:",
		"system.uptime":"OS Startzeit:"
		
	},"fr": {
		"wait": "Bitte warten Sie einen Augenblick..",
		"wait2": "Systeminformationen werden gesammelt, bitte warten",
		"main":"Systeminformationen",
		"user.title":"User Informationen",
		"user.name":"Benutzer:",
		"user.language":"Sprache:",
		"user.country":"Land:",
		"java.title":"Java Informationen",
		"java.name":"Name:",
		"java.vendor":"Herausgeber:",
		"java.version":"Version:",
		"system.title":"System Informationen",
		"system.name":"OS Name:",
		"system.version":"OS Version:",
		"system.uptime":"OS Startzeit:"
		
	},"it": {
		"wait": "Bitte warten Sie einen Augenblick..",
		"wait2": "Systeminformationen werden gesammelt, bitte warten",
		"main":"Systeminformationen",
		"user.title":"User Informationen",
		"user.name":"Benutzer:",
		"user.language":"Sprache:",
		"user.country":"Land:",
		"java.title":"Java Informationen",
		"java.name":"Name:",
		"java.vendor":"Herausgeber:",
		"java.version":"Version:",
		"system.title":"System Informationen",
		"system.name":"OS Name:",
		"system.version":"OS Version:",
		"system.uptime":"OS Startzeit:"
		
	},"en": {
		"wait": "Bitte warten Sie einen Augenblick..",
		"wait2": "Systeminformationen werden gesammelt, bitte warten",
		"main":"Systeminformationen",
		"user.title":"User Informationen",
		"user.name":"Benutzer:",
		"user.language":"Sprache:",
		"user.country":"Land:",
		"java.title":"Java Informationen",
		"java.name":"Name:",
		"java.vendor":"Herausgeber:",
		"java.version":"Version:",
		"system.title":"System Informationen",
		"system.name":"OS Name:",
		"system.version":"OS Version:",
		"system.uptime":"OS Startzeit:"
		
	}
}


```