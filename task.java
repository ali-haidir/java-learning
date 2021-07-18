abstract class animal{
    protected int legs;

    protected animal(int a){
        legs=a;

    }

    public abstract void eat();

    public void walk(){
        System.out.println("this  animal has legs = "+ legs );

    }
}

class spider extends animal{
        public spider(){
            super(8);
        }

        public void eat(){
            System.out.println("hello world ");
        }


}

 interface pet{
    public String get_name();



    public void set_name(String name);



    public void play();
}

class cat extends animal implements pet{
   public String name;

   public cat( String x ){
        super(4);
        this.name=x;
   }
   
   public String get_name(){
       return name;
   }

   public void set_name(String y){
       this.name= y;
   }
   
   public void play(){
       System.out.println("this cat plays  "+ name);
   }

   public void eat(){
       System.out.println("cats eat cat food");
   }


}

class fish extends animal{
   public fish(){
       super(0);
   }

   public void walk(){
       System.out.println("fish has no legs and cannot walk");
   }
   public void eat(){
       System.out.println("fish eats plants");
   }

}



public class java3 {
    public static void main(String[] args) {
        fish d = new fish();
        cat c = new cat("Fluffy");
        animal a = new fish();
        animal e = new spider();
       // pet p = new cat();

        //d.eat();
        //d.walk();

        c.eat();
        c.play();
        c.set_name("catoo");
        c.play();
        

       // a.eat();
      //  a.walk();

     // e.eat();
      //e.walk();

     // p.play();



   // ((fish)d).eat();
  //  ((cat)c).play();
   // ((spider)e).walk();


    //super.animal();
    

    }

}
