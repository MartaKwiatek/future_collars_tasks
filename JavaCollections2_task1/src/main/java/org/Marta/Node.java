package org.Marta;

public class Node {
    private String key;
    private String value;
    Node left;
    Node right;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
        left = null;
        right = null;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
