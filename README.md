JsConsole
=========

Enables logging to the Vaadin debug console from JavaScript

JsConsole lets you log messages to Vaadin's debug console directly from JavaScript. This is convenient when debugging a JavaScript connector on a platform where a native JavaScript console is not easily available.   

To enable this add-on, inherit org.vaadin.jsconsole.JsConsoleWidgetset in your widgetset. To log something to Vaadin's console, use vaadin.console.log(message) or vaadin.console.error(message) from your JavaScript code. You should also remember to include ?debug in the URL to enable the debug console.