class Student {
    String name;
    int score;

    void checkPassFail() {
        if (this.score >= 35) System.out.println(this.name + " passed the exam.");
        else System.out.println(this.name + " failed the exam.");
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Jack";
        student1.score = 78;

        student1.checkPassFail();

        Student student2 = new Student();
        student2.name = "Rosa";
        student2.score = 32;

        student2.checkPassFail();
    }
}