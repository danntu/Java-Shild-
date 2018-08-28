var importIt = new JavaImporter(java.lang.String, java.util, java.io);
with (importIt) {
    var linkedHS = new LinkedHashSet();
    linkedHS.add(new File("abc"));
    linkedHS.add(new File("hello.js"));
    linkedHS.add("kazakhstan".toUpperCase());
}
print(linkedHS);