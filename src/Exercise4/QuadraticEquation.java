package Exercise4;

public class QuadraticEquation {
    private float a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float getDiscriminant(){
        float delta = b*b - 4*a*c;
        return delta;
    }
    public float getRoot1(float delta){
        float root1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
        return root1;
    }
    public float getRoot2(float delta){
        float root2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
        return root2;
    }
    public float getRoot(){
        float root = (-b / (2 * a));
        return root;
    }

    @Override
    public String toString() {
        return
                "a =" + a +
                ", b =" + b +
                ", c =" + c ;
    }
}
