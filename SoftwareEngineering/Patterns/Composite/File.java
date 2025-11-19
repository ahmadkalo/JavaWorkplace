package Composite;

// Datei ist ein "Leaf", also ein einzelnes Element
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Datei: " + name);
    }
}
