public class child extends parent {


        void printto()
        {
            System.out.println(super.a);


            System.out.println(super.b);
        }

        public static void main(String[] args)
        {

            new child().printto();
        }
    }

