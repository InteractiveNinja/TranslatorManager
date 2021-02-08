## Translator Manager

With this tool is it easy to add multiple Translations for Texts, the language is choosen by the ISO code you give when you create the Object

## Usage

```
TranslatorManager lang = new TranslatorManager("path", "iso code");

or 

ISO iso = new ISO("path", "iso code");
TranslatorManager lang = new TranslatorManager(iso);


String translatedText = lang.getString("key");

System.out.println(translatedText);




```

## Format of the language.json

This is the way the language.properties should look like.
Then you can use your TranslatorManager to the most.

Example:

```

String translatedText = lang.getString("wait");


```

``` 

de.wait=Warten sie
fr.wait=Attends-tu
it.wait=Stai aspettando


```