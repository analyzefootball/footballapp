package football.analyze.main.page;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class Group extends VerticalLayout implements View {
    private static final long serialVersionUID = 1L;

    @Override
    public void enter(ViewChangeEvent event) {
        Label title = new Label();

        title.setCaption("Group Standings");
        title.setValue("Coming soon");

        addComponent(title);
    }
}