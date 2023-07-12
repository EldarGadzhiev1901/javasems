
public class Notebook {
    int id;
    String opsys;
    String color;

    int RAMSize;
    int DisplaySize;
    int HDDSize;

    public Notebook(int id, String color, String opsys, int RAMSize, int HDDSize, int DisplaySize) {
        this.id = id;
        this.DisplaySize = DisplaySize;
        this.color = color;
        this.opsys = opsys;

        this.RAMSize = RAMSize;

        this.HDDSize = HDDSize;

    }

    @Override
    public String toString() {
        return String.format("id: %s\n %s\n %s\nRamSize: %s\nHDDValue: %s\nDisplaySize: ",
                id, opsys, color,
                RAMSize, HDDSize,
                DisplaySize);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook other = (Notebook) obj;
        return this.opsys.equals(other.opsys) &&
                this.RAMSize == other.RAMSize &&
                this.DisplaySize == other.DisplaySize;
    }
}