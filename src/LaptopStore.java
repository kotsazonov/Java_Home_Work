

class Laptop {
    private int RAM;
    private int HDDSize;
    private String OS;
    private String color;

    public Laptop(int RAM, int HDDSize, String OS, String color) {
        this.RAM = RAM;
        this.HDDSize = HDDSize;
        this.OS = OS;
        this.color = color;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHDDSize() {
        return HDDSize;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        return RAM == laptop.RAM &&
                HDDSize == laptop.HDDSize &&
                OS.equals(laptop.OS) &&
                color.equals(laptop.color);
    }

    @Override
    public int hashCode() {
        int result = RAM;
        result = 31 * result + HDDSize;
        result = 31 * result + OS.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }
}
