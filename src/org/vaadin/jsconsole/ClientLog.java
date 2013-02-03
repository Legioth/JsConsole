package org.vaadin.jsconsole;

import com.vaadin.server.Page;

public class ClientLog {
    public static void log(String message) {
        log(message, Page.getCurrent());
    }

    public static void log(String message, Page page) {
        page.getJavaScript().execute(
                "vaadin.console.log('" + escape(message) + "')");
    }

    public static void error(String message) {
        error(message, Page.getCurrent());
    }

    public static void error(String message, Page page) {
        page.getJavaScript().execute(
                "vaadin.console.error('" + escape(message) + "')");
    }

    private static String escape(String message) {
        String escaped = message.replaceAll("'", "\\\\'");
        return escaped;
    }
}
