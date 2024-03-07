package OOPS_Interview_Questions;

class Base{
    private void amethod(int iBase)
{
    System.out.println("Base.amethod");
}
}
class Over extends Base{
    public void amethod(int iOver){
        System.out.println("Over.amethod");
    }


    public static void main(String[] args) {

        Over o = new Over();
        int iBase=0;
        o.amethod(iBase);
    }


}
