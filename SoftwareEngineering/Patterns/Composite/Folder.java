package Composite;

import java.util.ArrayList;
import java.util.List;

// Ordner kann sowohl Dateien als auch andere Ordner enthalten
class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Ordner: " + name);
        for (FileSystemComponent component : children) {
            component.showDetails(); // Rekursiver Aufruf
        }
    }
}
