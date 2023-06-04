package Interface;

interface BEIT{
    public void useLaptop();
    public void knowGit();
};
interface extraBEIT extends BEIT{
    public void stackoverflow();
    static void java(){
        System.out.println("know java");
    }
};

class Implement implements extraBEIT{

    @Override
    public void useLaptop() {
        System.out.println("Laptop used");
    }

    @Override
    public void knowGit() {
        System.out.println("Know Git");
    }

    @Override
    public void stackoverflow() {
        System.out.println("Account on stack overflow");
    }
};

class Use{
    public static void main(String[] args) {
        Implement imple = new Implement();
        imple.knowGit();
        imple.stackoverflow();
        imple.useLaptop();
        extraBEIT.java();

    }
};

