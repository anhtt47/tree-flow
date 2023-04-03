package org.vaadin.tatu;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class TreeTest {

    @Test
    public void treeSerializable() throws IOException {
        Tree<Department> tree = new Tree<>(Department::getName);
        new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(tree);
    }
}
