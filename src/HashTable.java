import java.util.Objects;

public class HashTable<K, V> {

    Node<K, V> [] nodes = new Node[16];
    private static final int RESIZE = 2;
    private static int count = 0;

    public V put(K key, V value) {

        Objects.requireNonNull(value);
        Objects.requireNonNull(key);
        if (nodes.length == count) {
            resize();
        }
        int index = Math.abs(key.hashCode()) % nodes.length;
        Node<K, V> kvNode = nodes[index];
        Node<K, V> last = nodes[index];
        Node<K, V> add = new Node<>(key, value);
        if (kvNode == null) {
            kvNode = new Node<>(key, value);
            nodes[index] = kvNode;
        } else {
            while (last.next != null) {
                if(value.equals(last.value)) {
                    return value;
                }
                last = last.next;
            }
            last.next = add;
        }

        count ++;
        return value;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        Node<K, V>[] nodesResize = new Node[nodes.length * RESIZE];
        System.arraycopy(nodes, 0, nodesResize, 0, nodes.length);
        nodes = nodesResize;
    }

    public void printTable() {
        for (int i = 0; i < nodes.length; i++) {
            System.out.print(i + ": ");

            Node<K, V> node = nodes[i];
            while (node != null) {
                if(node.next != null)
                    System.out.print(node.key + ":" + node.value + " ->  ");
                else
                    System.out.print(node.key + ":" + node.value);

                node = node.next;
            }
            System.out.println();
        }
    }
}
