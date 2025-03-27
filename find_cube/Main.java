package find_cube;

class Main {
    void findCube() {
        int number = 5;
        int result = number * number * number;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.findCube();
    }
}