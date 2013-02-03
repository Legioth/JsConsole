package org.vaadin.jsconsole.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point that initializes the JavaScript console when GWT is initialized
 * loaded.
 */
public class JsConsole implements EntryPoint {

    @Override
    public void onModuleLoad() {
        initJs();
    }

    private static native void initJs()
    /*-{
        if ($wnd.vaadin.console) {
            //Already initialized, don't do anything
            return;
        }
        $wnd.vaadin.console = {
            log: $entry(function(msg) {
                @com.vaadin.client.VConsole::log(Ljava/lang/String;)(String(msg));
            }),
            error: $entry(function(msg) {
                @com.vaadin.client.VConsole::error(Ljava/lang/String;)(String(msg));
            })
        }
    }-*/;

}
