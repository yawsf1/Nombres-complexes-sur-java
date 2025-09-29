public class Complexe {
    private final double im;
    private final double re;
    public Complexe(){
        im = 0;
        re = 0;
    }
    public Complexe(double re, double im){
        this.im = im;
        this.re = re;
    }
    public Complexe addCom(Complexe z){
        return new Complexe((this.re + z.re), (this.im + z.im));
    }
    public  Complexe multiCom(Complexe z){
        double re1 = this.re * z.re - this.im * z.im;
        double im1 = this.re * z.im + this.im * z.re ;
        return new Complexe(re1, im1);
    }
    public String toString() {
        String newRe = (re % 1 == 0) ? String.format("%.0f", re) : String.format("%.2f", re);
        String newIm = (im % 1 == 0) ? String.format("%.0f", im) : String.format("%.2f", im);

        if (im > 0) {
            return newRe + " + " + newIm + "i";
        }
        else if (im < 0) {
            return newRe + " - " + newIm.substring(1) + "i";
        }
        else {
            return newRe;
        }
    }
}
