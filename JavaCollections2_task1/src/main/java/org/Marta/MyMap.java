package org.Marta;

public class MyMap implements OwnMap {
    Node root;

    public Node putRecursively(Node current, String key, String value) {
        if (current == null) {
            return new Node(key, value);
        }
        if (key.compareTo(current.getKey()) < 0) {
            current.left = putRecursively(current.left, key, value);
        } else if (key.compareTo(current.getKey()) > 0) {
            current.right = putRecursively(current.right, key, value);
        } else {
            return current;
        }
        return current;
    }

    @Override
    public boolean put(String key, String value) {
        root = putRecursively(root, key, value);
        return true;
    }

    private boolean containsKeyRecursive(Node current, String key) {
        if (current == null) {
            return false;
        }
        if (current.getKey().equals(key)) {
            return true;
        }
        return key.compareTo(current.getKey()) < 0 ?
                containsKeyRecursive(current.left, key) :
                containsKeyRecursive(current.right, key);
    }

    @Override
    public boolean containsKey(String key) {
        return containsKeyRecursive(root, key);
    }

    private boolean containsValueRecursive(Node node, String value) {
        if (node != null) {
            if (node.getValue().equals(value)) {
                return true;
            } else {
                return containsValueRecursive(node.left, value) || containsValueRecursive(node.right, value);
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(String value) {
        return containsValueRecursive(root, value);
    }

    private String findSmallestKey(Node root) {
        return root.left == null ? root.getKey() : findSmallestKey(root.left);
    }

    private Node removeRecursive(Node current, String key) {
        if (current == null) {
            return null;
        }
        if (key.equals(current.getKey())) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            String smallestKey = findSmallestKey(current.right);
            current.setKey(smallestKey);
            current.right = removeRecursive(current.right, smallestKey);
            return current;
        }
        if (key.compareTo(current.getKey()) < 0) {
            current.left = removeRecursive(current.left, key);
            return current;
        }
        current.right = removeRecursive(current.right, key);
        return current;
    }

    @Override
    public String remove(String key) {
        String valueToRemove = get(key);
        root = removeRecursive(root, key);
        return valueToRemove;
    }

    private String getRecursive(Node current, String key) {
        if (current == null) {
            return "";
        }
        if (current.getKey().equals(key)) {
            return current.getValue();
        }
        if (key.compareTo(current.getKey()) < 0) {
            return getRecursive(current.left, key);
        } else {
            return getRecursive(current.right, key);
        }
    }

    @Override
    public String get(String key) {
        return getRecursive(root, key);
    }
}
