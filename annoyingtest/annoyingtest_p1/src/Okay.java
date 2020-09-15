public class Okay {
    Okay()
    {
        System.out.println("Constructor of Hola class");

    }
    void Okay_method(){
        System.out.println("trying new things i guess");
    }
    public static void main(String [] args)
    {
        Okay my= new Okay();
        Nokay your = new Nokay();

        my.Okay_method();
        your.Nokay_method();

    }


}
