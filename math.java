public class math {

    public static void main(String[] args) {
        int a = Math.max(5,10);
        System.out.println(a);

        int b = Math.min(5,10);
        System.out.println(b);

        float c = (float) Math.sqrt(64);
        System.out.println(c);

        float d = (float) Math.abs(-3.8);
        System.out.println(d);

        float e = (float) Math.random();
        System.out.println(e);

        // int f = (int) Math.random();
        // System.out.println(f);

        int g = (int) (Math.random() * 101);
        System.out.println(g);
    }
}