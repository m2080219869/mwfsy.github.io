package 继承了解;

public class xxs extends xs {

    public xxs(float cj, int xh, String name) {
        super(cj, xh, name);
    }
    public void ss() {
        System.out.println(show());
    }
    public void text(){
       System.out.println("小学生"+name+"考数学");
   }
   public void text2(){
        her();
       float sor=getCj();
       if(sor>90){
           System.out.println("你取的优秀");
       }
       else {
           System.out.println("一般");
       }
   }

}
