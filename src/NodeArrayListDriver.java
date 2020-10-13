public class NodeArrayListDriver {
    public static void main(String[] args) {
        //Variable of NodeList
        NodeArrayList<String> StringNodes = new NodeArrayList<String>();
        StringNodes.add("Your Mom, this is the ancestor node");
        System.out.println("AncestorAdd succesful");
        StringNodes.add("Your dad, this is the first child node");
        System.out.println("Dad add succesful");
        StringNodes.add(1,"Your grandmother. This node squeezed in between your mom and your dad.");
        System.out.println("Squeezer add successful");
        System.out.println("Should say your mom...:");
        System.out.println(StringNodes.get(0));
        System.out.println("Should say Your grandmother...:");
        System.out.println(StringNodes.get(1));
        System.out.println("Should say Your Dad...:");
        System.out.println(StringNodes.get(2));
    }
}
