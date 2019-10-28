public class GetTotalArea{
    public static double getAllCircleArea(Circle[] clist){
        double sum = 0;
        for(int i = 0; i < clist.length; i++){
            sum += clist[i].getArea();
        }
        return sum;
    }
    public static double getAllRectangleArea(ArrayList<Rectangle> clist){
        double sum = 0;
        for(Rctangle r : clist){
            sum += r.getArea();
        }
        return sum;
    }
    public static double getAllTriangleArea(Triangle[][] clist){
        double sum = 0;
        for(Triangle[] r : clist){
            for(Triangle t : r){
                sum += t.getArea();
            }
        }
        return sum;
    }
