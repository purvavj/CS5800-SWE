import java.util.ArrayList;
import java.util.List;

class Folder {
    private final String name;
    private final List<File> files = new ArrayList<>();
    private final List<Folder> subFolders = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeFolder(String folderName) {
        subFolders.removeIf(folder -> folder.getName().equals(folderName));
    }

    public String getName() {
        return name;
    }

    public void print(String prefix) {
        System.out.println(prefix + name);
        for (Folder folder : subFolders) {
            folder.print(prefix + "  ");
        }
        for (File file : files) {
            file.print(prefix + "  ");
        }
    }
}