public class Fattoriale extends Thread{
    private int val;

    public Fattoriale(String nome, int val) {
        super(nome);
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    public void run()
    {
        int tmp = 1;
        for (int i = val; i > 0; i--)
        {
            tmp = tmp * i;
            val = tmp;
        }
    }

}
