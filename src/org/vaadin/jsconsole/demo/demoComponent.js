window.org_vaadin_jsconsole_demo_JsConsoleDemoComponent = function() {
	vaadin.console.log("Initializing demo component");
	
	var button = document.createElement('button');
	button.appendChild(document.createTextNode('Log from JS'));
	this.getElement().appendChild(button);
	
	button.onclick = function() {
		vaadin.console.log("Logged from JS");
		vaadin.console.error("Logged as error from JS");
	};
	
};