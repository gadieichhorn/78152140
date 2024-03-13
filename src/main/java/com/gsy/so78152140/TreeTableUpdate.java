package com.gsy.so78152140;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;

import java.util.Set;
import java.util.UUID;

public class TreeTableUpdate extends TreeTableView<UpdateState> {

    public final Set<UpdateState> data;

    public void randomize() {
        data.forEach(d -> d.stateProperty().setValue(UUID.randomUUID().toString()));
    }


    public TreeTableUpdate(Set<UpdateState> data) {
        this.data = data;

        setColumnResizePolicy(TreeTableView.CONSTRAINED_RESIZE_POLICY_FLEX_LAST_COLUMN);

        TreeTableColumn<UpdateState, String> name = new TreeTableColumn<>("Name");
        TreeTableColumn<UpdateState, String> state = new TreeTableColumn<>("State");

        name.setCellValueFactory(n -> n.getValue().getValue().nameProperty());//new TreeItemPropertyValueFactory<>("name"));
        state.setCellValueFactory(s -> s.getValue().getValue().stateProperty());
        ;//new TreeItemPropertyValueFactory<>("state"));

        getColumns().add(name);
        getColumns().add(state);

        TreeItem<UpdateState> root = new TreeItem<>();
        setRoot(root);
        showRootProperty().setValue(false);

        data.forEach(d -> root.getChildren().add(new TreeItem<>(d)));
    }

}
