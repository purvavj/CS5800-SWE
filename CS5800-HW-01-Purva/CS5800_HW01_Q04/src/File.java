class File {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public void print(String prefix) {
        System.out.println(prefix + name);
    }
}