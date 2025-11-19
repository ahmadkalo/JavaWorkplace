public class Editor {

    private EditorInterface adapter;

    public Editor(EditorInterface adapter) {
        this.adapter = adapter;
    }

    public void saveLinie(Farbe farbe, int zentimeter) {
        adapter.saveLinie(farbe, zentimeter);
    }
}
