public class MyOuterClass
    {


        static public Hand  OuterClassMethod()
            {
                class Plam implements Hand
                    {

                        String status;
                        @Override
                        public void facePlam()
                            {
                                status="I got my value form faceplam";
                            }

                        public String getStatus() {
                            return status;
                        }

                        @Override
                        public String toString() {
                            return "Plam{" +
                                    "status='" + status + '\'' +
                                    '}';
                        }
                    }
                Hand plam=new Plam();
               // Hand hand=new Plam();
                plam.facePlam();
                return plam;
            }

   }



