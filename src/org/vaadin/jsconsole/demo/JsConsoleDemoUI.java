package org.vaadin.jsconsole.demo;

import org.vaadin.jsconsole.ClientLog;

import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Main UI class
 */
@Widgetset("org.vaadin.jsconsole.demo.JsConsoleDemoWidgetset")
public class JsConsoleDemoUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        getPage().setTitle("JsConsole");
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);

        Button button = new Button("Log from server using ClientLog");
        button.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                ClientLog.log("Logged from server using ClientLog");
                ClientLog.error("Logged as error from server using ClientLog");
            }
        });
        layout.addComponent(button);
        layout.addComponent(new JsConsoleDemoComponent());
    }

}