class CuboidBox {
    private double length;
    private double width;
    private double height;

    public void changeLength(double length) {
        this.length = length;
    }

    public void changeWidth(double width) {
        this.width = width;
    }

    public void changeHeight(double height) {
        this.height = height;
    }

    public double printVolume() {
        System.out.println("The volume of the box is "
                + width * length * height + ".");
        return width * length * height;
    }
}
